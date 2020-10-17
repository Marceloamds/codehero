package com.hero.code.presentation.view.character.list

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.google.android.material.tabs.TabLayoutMediator
import com.hero.code.R
import com.hero.code.databinding.ActivityListCharactersBinding
import com.hero.code.presentation.util.base.BaseActivity
import com.hero.code.presentation.util.base.BaseViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class ListCharactersActivity : BaseActivity() {

    override val baseViewModel: BaseViewModel get() = _viewModel
    private val _viewModel: ListCharactersViewModel by viewModel()

    private lateinit var binding: ActivityListCharactersBinding
    private lateinit var adapter: ListCharactersAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_list_characters)
        setupUi()
    }

    override fun subscribeUi() {
        super.subscribeUi()
        _viewModel.placeholder.observe(this) { binding.placeholderView.setPlaceholder(it) }
        _viewModel.totalPages.observe(this, ::onTotalPagesReceived)
    }

    private fun setupUi() {
        with(binding) {
            buttonNextPage.setOnClickListener { characterViewPager.currentItem += 1 }
            buttonPreviousPage.setOnClickListener { characterViewPager.currentItem += -1 }
        }
    }

    private fun onTotalPagesReceived(totalPages: Int?) {
        totalPages?.let {
            with(binding) {
                adapter = ListCharactersAdapter(this@ListCharactersActivity, it)
                binding.characterViewPager.adapter = adapter
                TabLayoutMediator(viewPagerIndicator, characterViewPager) { tab, position ->
                    tab.text = (position + 1).toString()
                }.attach()
            }
        }
    }

    companion object {

        fun createIntent(context: Context) =
            Intent(context, ListCharactersActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
    }
}

