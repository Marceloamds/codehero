package com.hero.code.presentation.view.character.details

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.hero.code.R
import com.hero.code.databinding.ActivityCharacterDetailsBinding
import com.hero.code.domain.entity.character.Character
import com.hero.code.presentation.util.base.BaseActivity
import com.hero.code.presentation.util.base.BaseViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class CharacterDetailsActivity : BaseActivity() {

    override val baseViewModel: BaseViewModel get() = _viewModel
    private val _viewModel: CharacterDetailsViewModel by viewModel()

    private lateinit var binding: ActivityCharacterDetailsBinding
    private val intentCharacter by lazy { intent.getSerializableExtra(CHARACTER_EXTRA) as Character }
    private var character: Character? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_character_details)
        setupUi()
    }

    private fun setupUi() {
        with(binding) {}
    }

    private fun setupCharacterInfo() {
        with(binding) {}
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