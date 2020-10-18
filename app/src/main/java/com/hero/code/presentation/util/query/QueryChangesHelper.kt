package com.hero.code.presentation.util.query

import androidx.appcompat.widget.SearchView

class QueryChangesHelper(private val callback: (String) -> Unit) : SearchView.OnQueryTextListener {
    override fun onQueryTextSubmit(query: String?): Boolean {
        query?.let { callback(it) }
        return true
    }

    override fun onQueryTextChange(query: String?) = true
}