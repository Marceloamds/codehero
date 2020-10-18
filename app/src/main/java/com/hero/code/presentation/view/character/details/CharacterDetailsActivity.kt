package com.hero.code.presentation.view.character.details

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hero.code.R
import com.hero.code.databinding.ActivityCharacterDetailsBinding
import com.hero.code.domain.entity.character.Character
import com.hero.code.presentation.util.extension.load
import org.koin.android.viewmodel.ext.android.viewModel

class CharacterDetailsActivity : AppCompatActivity() {

    private val _viewModel: CharacterDetailsViewModel by viewModel()

    private lateinit var binding: ActivityCharacterDetailsBinding
    private val character by lazy { intent.getSerializableExtra(CHARACTER_EXTRA) as Character }
    private lateinit var adapter: CharacterUrlsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_character_details)
        setupUi()
        setupCharacterInfo()
        setupUrlRecycler()
    }

    private fun setupCharacterInfo() {
        with(binding) {
            imageViewCharacterThumbnail.load(character.thumbnail)
            textViewCharacterName.text = character.name
            if (!character.description.isNullOrEmpty()) {
                textViewDescription.text = character.description
            }
        }
    }

    private fun setupUi() {
        binding.buttonGoBack.setOnClickListener { finish() }
    }

    private fun setupUrlRecycler() {
        adapter = CharacterUrlsAdapter()
        binding.recyclerViewUrls.adapter = adapter
        adapter.submitList(character.urls)
    }

    companion object {
        private const val CHARACTER_EXTRA = "CHARACTER_EXTRA"

        fun createIntent(context: Context, character: Character): Intent {
            return Intent(context, CharacterDetailsActivity::class.java).apply {
                putExtra(CHARACTER_EXTRA, character)
            }
        }
    }
}