package com.hero.code.presentation.view.heroes.details

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.hero.code.R
import com.hero.code.databinding.ActivityHeroesDetailsBinding
import com.hero.code.domain.entity.hero.Hero
import com.hero.code.presentation.util.base.BaseActivity
import com.hero.code.presentation.util.base.BaseViewModel
import com.hero.code.presentation.util.extension.*
import com.hero.code.presentation.view.heroes.OnHeroChangedObservable
import org.koin.android.viewmodel.ext.android.viewModel

class HeroDetailsActivity : BaseActivity() {

    override val baseViewModel: BaseViewModel get() = _viewModel
    private val _viewModel: HeroDetailsViewModel by viewModel()

    private lateinit var binding: ActivityHeroesDetailsBinding
    private val intentHero by lazy { intent.getSerializableExtra(HERO_EXTRA) as Hero }
    private var hero: Hero? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_heroes_details)
        hero = intentHero
        setupHeroInfo()
        setupLike()
        setupUi()
    }

    override fun subscribeUi() {
        super.subscribeUi()
        _viewModel.shareHero.observe(this, ::shareHero)
        OnHeroChangedObservable.updatedHero.observe(this, ::onHeroChanged)
    }

    private fun setupUi() {
        with(binding) {
            buttonGoToReview.setSafeClickListener { hero?.link?.url?.let { openBrowser(it) } }
            buttonFavorite.setSafeClickListener { _viewModel.onLikeClicked(hero) }
            buttonShare.setSafeClickListener { _viewModel.onShareClicked(hero) }
            buttonGoBack.setSafeClickListener { finish() }
        }
    }

    private fun setupHeroInfo() {
        with(binding) {
            imageViewHeroPoster.load(hero?.multimedia?.src)
            textViewHeroTitle.text = hero?.displayTitle
            textViewSynopsis.text = hero?.summaryShort
            textViewReviewTitle.text = hero?.headline
            textViewPublication.text = getString(
                R.string.review_publication_template,
                hero?.byline,
                hero?.publicationDate?.format()
            )
            textViewOpeningDate.text = hero?.openingDate?.format()
        }
    }

    private fun onHeroChanged(hero: Hero) {
        if (this.hero?.link?.url == hero.link.url) {
            this.hero = hero
            setupLike()
        }
    }

    private fun setupLike() {
        binding.buttonFavorite.setImageDrawable(
            ContextCompat.getDrawable(
                binding.root.context,
                if (hero?.isFavorite == true) R.drawable.ic_favorite else R.drawable.ic_favorite_border
            )
        )
    }

    companion object {
        private const val HERO_EXTRA = "HERO_EXTRA"

        fun createIntent(context: Context, hero: Hero): Intent {
            return Intent(context, HeroDetailsActivity::class.java).apply {
                putExtra(HERO_EXTRA, hero)
            }
        }
    }
}