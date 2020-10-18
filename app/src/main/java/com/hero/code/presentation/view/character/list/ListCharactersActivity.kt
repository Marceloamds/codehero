package com.hero.code.presentation.view.character.list

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.android.material.tabs.TabLayoutMediator
import com.hero.code.R
import com.hero.code.databinding.ActivityListCharactersBinding
import com.hero.code.presentation.util.dialog.DialogData
import com.hero.code.presentation.util.extension.showDialog
import com.hero.code.presentation.util.extension.onGoTo
import com.hero.code.presentation.util.query.QueryChangesHelper
import org.koin.android.viewmodel.ext.android.viewModel

class ListCharactersActivity : AppCompatActivity() {

    private val _viewModel: ListCharactersViewModel by viewModel()

    private lateinit var binding: ActivityListCharactersBinding
    private lateinit var adapter: ListCharactersAdapter

    private var currentTabLayoutMediator: TabLayoutMediator? = null
    private var dialog: Dialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_list_characters)
        setupUi()
        subscribeUi()
    }

    private fun subscribeUi() {
        _viewModel.dialog.observe(this, ::onNextDialog)
        _viewModel.goTo.observe(this, ::onGoTo)
        _viewModel.placeholder.observe(this) { binding.placeholderView.setPlaceholder(it) }
        _viewModel.listCharactersInfo.observe(this, ::onListCharactersInfoReceived)
    }

    private fun setupUi() {
        with(binding) {
            buttonNextPage.setOnClickListener { characterViewPager.currentItem += 1 }
            buttonPreviousPage.setOnClickListener { characterViewPager.currentItem += -1 }
            searchViewCharacter.setOnQueryTextListener(QueryChangesHelper(_viewModel::onQuerySubmitted))
            searchViewCharacter.findViewById<ImageView>(R.id.search_close_btn).setOnClickListener {
                onQueryClosed()
            }
        }
    }

    private fun onListCharactersInfoReceived(info: ListCharactersInfo?) {
        info?.let {
            adapter = ListCharactersAdapter(this, it.totalPages, it.query)
            setupViewPager()
        }
    }

    private fun setupViewPager() {
        currentTabLayoutMediator?.detach()
        binding.characterViewPager.adapter = adapter
        currentTabLayoutMediator = getTabLayoutMediator()
        currentTabLayoutMediator?.attach()
    }

    private fun getTabLayoutMediator(): TabLayoutMediator {
        with(binding) {
            return TabLayoutMediator(viewPagerIndicator, characterViewPager) { tab, position ->
                tab.text = (position + 1).toString()
            }
        }
    }

    private fun onQueryClosed() {
        with(binding.searchViewCharacter) {
            setQuery("", true)
            clearFocus()
            _viewModel.onQuerySubmitted("")
        }
    }

    private fun onNextDialog(dialogData: DialogData?) {
        dialog?.dismiss()
        dialog = dialogData?.let { showDialog(it) }
    }

    companion object {

        fun createIntent(context: Context) =
            Intent(context, ListCharactersActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
    }
}

