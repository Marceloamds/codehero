package com.hero.code.presentation.view.heroes.list

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.hero.code.R
import com.hero.code.databinding.ActivityListCharactersBinding
import com.hero.code.presentation.util.base.BaseActivity
import com.hero.code.presentation.util.base.BaseViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class ListCharacterActivity : BaseActivity() {

    override val baseViewModel: BaseViewModel get() = _viewModel
    private val _viewModel: ListCharactersViewModel by viewModel()

    private lateinit var binding: ActivityListCharactersBinding
    private lateinit var adapter: ListCharactersAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_list_characters)
        supportActionBar?.title = getString(R.string.search_for_reviews)
        setupRecyclerView()
    }

    override fun subscribeUi() {
        super.subscribeUi()
        _viewModel.charactersList.observe(this) { it?.let(adapter::submitList) }
        _viewModel.placeholder.observe(this) { binding.placeholderView.setPlaceholder(it) }
    }

    private fun setupRecyclerView() {
        adapter = ListCharactersAdapter(
            _viewModel::onCharacterSelected,
        )
        binding.recyclerViewHeroes.layoutManager = LinearLayoutManager(this@ListCharacterActivity)
        binding.recyclerViewHeroes.adapter = adapter
    }


    companion object {

        fun createIntent(context: Context) =
            Intent(context, ListCharacterActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
    }
}

