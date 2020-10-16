package com.hero.code.presentation.view.heroes.list

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.hero.code.R
import com.hero.code.databinding.ItemHeroBinding
import com.hero.code.domain.entity.hero.Hero
import com.hero.code.presentation.util.extension.format

class HeroViewHolder(
    private var binding: ItemHeroBinding
) : RecyclerView.ViewHolder(binding.root) {

    private var isExpanded = false

    fun setupBinding(
        hero: Hero,
        callback: (Hero) -> Unit,
        onLikeClickedCallback: (Hero) -> Unit,
        onShareClickedCallback: (Hero) -> Unit
    ) {
        with(binding) {
            isExpanded = false
            motionLayout.transitionToStart()
//            motionLayout.addTransitionListener(TransitionListener(binding, hero))
            motionLayout.setSafeClickListener(400) { startAnimation(hero) }
            imageViewHeroPoster.load(hero.multimedia?.src)
            textViewHeroReview.text = hero.summaryShort
            textViewHeroTitle.text = hero.displayTitle
            textViewHeroTitleEnd.text = hero.displayTitle
            textViewSynopsis.text = hero.summaryShort
            textViewReviewTitle.text = hero.headline
            textViewPublication.text = binding.root.context.getString(
                R.string.review_publication_template,
                hero.byline,
                hero.publicationDate.format()
            )
            textViewOpeningDate.text = hero.openingDate?.format()
            buttonFavorite.setSafeClickListener(200) { onLikeClicked(hero, onLikeClickedCallback) }
            buttonShare.setSafeClickListener { onShareClickedCallback(hero) }
            buttonGoToReview.setSafeClickListener { binding.root.context.openBrowser(hero.link.url) }
            setupLike(hero)
        }
    }

    private fun onLikeClicked(hero: Hero, onLikeClickedCallback: (Hero) -> Unit) {
        hero.isFavorite = !hero.isFavorite
        setupLike(hero)
        onLikeClickedCallback(hero)
    }

    private fun startAnimation(hero: Hero) {
        if (isExpanded) binding.motionLayout.transitionToStart()
        else binding.motionLayout.transitionToEnd()
        isExpanded = !isExpanded
    }

    private fun setupLike(hero: Hero) {
        binding.buttonFavorite.setImageDrawable(
            ContextCompat.getDrawable(
                binding.root.context,
                if (hero.isFavorite) R.drawable.ic_favorite else R.drawable.ic_favorite_border
            )
        )
    }

    class TransitionListener(
        private val binding: ItemHeroBinding,
        private val hero: Hero
    ) : MotionLayout.TransitionListener {

        private var isExpanded = false

        override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
            isExpanded = !isExpanded
            binding.imageViewHeroPoster.scaleType = if (isExpanded) ImageView.ScaleType.CENTER_CROP
            else ImageView.ScaleType.CENTER_CROP
            binding.imageViewHeroPoster.load(hero.multimedia?.src)
        }

        override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {}

        override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {}

        override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {}
    }

    companion object {
        fun inflate(parent: ViewGroup?) = HeroViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent?.context),
                R.layout.item_hero,
                parent,
                false
            )
        )
    }
}