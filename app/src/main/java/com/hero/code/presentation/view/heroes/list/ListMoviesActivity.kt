package com.hero.code.presentation.view.heroes.list

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.hero.code.R
import com.hero.code.databinding.ActivityListHeroesBinding
import com.hero.code.presentation.util.base.BaseActivity
import com.hero.code.presentation.util.base.BaseViewModel
import com.hero.code.presentation.util.extension.shareHero
import com.hero.code.presentation.util.query.QueryChangesHelper
import com.hero.code.presentation.view.heroes.OnHeroChangedObservable
import org.koin.android.viewmodel.ext.android.viewModel

class ListHeroesActivity : BaseActivity() {

    override val baseViewModel: BaseViewModel get() = _viewModel
    private val _viewModel: ListHeroesViewModel by viewModel()

    private lateinit var binding: ActivityListHeroesBinding
    private lateinit var adapter: ListHeroesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_list_heroes)
        supportActionBar?.title = getString(R.string.search_for_reviews)
        setupRecyclerView()
        setupUi()
    }

    override fun subscribeUi() {
        super.subscribeUi()
        _viewModel.heroesList.observe(this) { it?.let(adapter::submitList) }
        _viewModel.progressVisible.observe(this) { it?.let(adapter::setProgressVisible) }
        _viewModel.placeholder.observe(this) { binding.placeholderView.setPlaceholder(it) }
        _viewModel.showEmptyPlaceholder.observe(this, ::onEmptyPlaceholder)
        _viewModel.shareHero.observe(this, ::shareHero)
        OnHeroChangedObservable.updatedHero.observe(this) { it?.let(adapter::updateHero) }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.list_heroes_menu, menu)
        setupSearchView(menu?.findItem(R.id.action_search))
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.filter_favorite -> {
                _viewModel.onFavoriteHeroesClicked()
                true
            }
            R.id.all_heroes -> {
                _viewModel.getAllHeroes()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


    private fun setupRecyclerView() {
        adapter = ListHeroesAdapter(
            _viewModel::onHeroeselected,
            _viewModel::onLikeClicked,
            _viewModel::onShareClicked,
            _viewModel::onProgressItemShown
        )
        binding.recyclerViewHeroes.layoutManager = LinearLayoutManager(this@ListHeroesActivity)
        binding.recyclerViewHeroes.adapter = adapter
    }

    private fun setupUi() {
        binding.buttonTryAgain.setSafeClickListener { _viewModel.getAllHeroes() }
    }

    private fun setupSearchView(searchItem: MenuItem?) {
        searchItem?.let {
            val searchView = it.actionView as SearchView
            searchView.setOnQueryTextListener(QueryChangesHelper(_viewModel::onQueryChanged))
            searchView.setOnCloseListener(::onQueryClosed)
        }
    }

    private fun onQueryClosed(): Boolean {
        _viewModel.onQueryChanged("")
        return true
    }

    private fun onEmptyPlaceholder(showEmptyPlaceholder: Boolean?) {
        binding.emptyListLayout.visibility =
            if (showEmptyPlaceholder == true) View.VISIBLE else View.GONE
    }

    companion object {

        fun createIntent(context: Context) =
            Intent(context, ListHeroesActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
    }
}

