package com.hero.code.presentation.view.character.show

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hero.code.databinding.FragmentShowCharacterBinding
import com.hero.code.databinding.ItemCharacterBinding
import com.hero.code.domain.entity.character.Character
import com.hero.code.presentation.util.dialog.DialogData
import com.hero.code.presentation.util.extension.circleLoad
import com.hero.code.presentation.util.extension.onGoTo
import com.hero.code.presentation.util.extension.showDialog
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class ShowCharacterFragment : Fragment() {

    private lateinit var binding: FragmentShowCharacterBinding

    private val position by lazy { arguments?.getInt(POSITION_EXTRA, 0) ?: 0 }
    private val query by lazy { arguments?.getString(QUERY_EXTRA, "") ?: "" }

    private val _viewModel: ShowCharacterViewModel by viewModel { parametersOf(position, query) }
    private var dialog: Dialog? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentShowCharacterBinding.inflate(inflater, container, false)
        subscribeUi()
        return binding.root
    }

    private fun subscribeUi() {
        with(_viewModel) {
            dialog.observe(viewLifecycleOwner, ::onNextDialog)
            charactersList.observe(viewLifecycleOwner, ::onCharactersReceived)
            placeholder.observe(viewLifecycleOwner) { binding.placeholderView.setPlaceholder(it) }
            goTo.observe(viewLifecycleOwner) { context?.run { onGoTo(it) } }
        }
    }

    private fun onCharactersReceived(characterPage: CharacterPage?) {
        characterPage?.let {
            with(binding) {
                firstCharacter.setupCharacter(characterPage.firstCharacter)
                secondCharacter.setupCharacter(characterPage.secondCharacter)
                thirdCharacter.setupCharacter(characterPage.thirdCharacter)
                fourthCharacter.setupCharacter(characterPage.fourthCharacter)
            }
        }
    }

    private fun ItemCharacterBinding.setupCharacter(character: Character?) {
        imageCharacter.circleLoad(character?.thumbnail)
        textCharacterName.text = character?.name
        root.setOnClickListener { _viewModel.onCharacterSelected(character) }
    }

    private fun onNextDialog(dialogData: DialogData?) {
        dialog?.dismiss()
        dialog = dialogData?.let { context?.showDialog(it) }
    }

    companion object {
        private const val POSITION_EXTRA = "POSITION_EXTRA"
        private const val QUERY_EXTRA = "QUERY_EXTRA"

        fun newInstance(position: Int, query: String) = ShowCharacterFragment().apply {
            val bundle = Bundle()
            bundle.putInt(POSITION_EXTRA, position)
            bundle.putString(QUERY_EXTRA, query)
            arguments = bundle
        }
    }
}