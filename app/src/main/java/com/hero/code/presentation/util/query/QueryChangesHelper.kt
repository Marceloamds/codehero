package com.hero.code.presentation.util.query

import androidx.appcompat.widget.SearchView

class QueryChangesHelper(private val callback: (String) -> Unit) : SearchView.OnQueryTextListener {
    override fun onQueryTextSubmit(p0: String?): Boolean {
        p0?.let { callback(it) }
        return true
    }

    override fun onQueryTextChange(p0: String?) = true
}