package com.hero.code.presentation.view.character.show

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.fragment.app.Fragment
import com.hero.code.databinding.FragmentShowCharacterBinding
import com.hero.code.domain.entity.character.Character
import com.hero.code.presentation.util.extension.load
import com.hero.code.presentation.util.navigation.NavData
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class ShowCharacterFragment : Fragment() {

    private lateinit var binding: FragmentShowCharacterBinding

    private val position by lazy { arguments?.getInt(POSITION_EXTRA, 0) ?: 0 }

    private val _viewModel: ShowCharacterViewModel by viewModel { parametersOf(position) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShowCharacterBinding.inflate(inflater, container, false)
        setupUi()
        subscribeUi()
        return binding.root
    }

    private fun subscribeUi() {
        _viewModel.charactersList.observe(viewLifecycleOwner, ::onCharactersReceived)
        _viewModel.goTo.observe(viewLifecycleOwner, ::onGoTo)
    }

    private fun setupUi() {
        with(binding) {

        }
    }

    private fun onCharactersReceived(characterList: List<Character?>?) {
        characterList?.let {
            with(binding) {
                firstCharacter.character = characterList[0]
                secondCharacter.character = characterList[1]
                thirdCharacter.character = characterList[2]
                fourthCharacter.character = characterList[3]
            }
        }
    }

    private fun onGoTo(navData: NavData?) {
        context?.let { navData?.navigate(it) }
    }

    companion object {
        private const val POSITION_EXTRA = "POSITION_EXTRA"

        fun newInstance(position: Int) = ShowCharacterFragment().apply {
            val bundle = Bundle()
            bundle.putInt(POSITION_EXTRA, position)
            arguments = bundle
        }

        @BindingAdapter("loadCharacterImage")
        @JvmStatic
        fun ImageView.loadCharacterImage(character: Character?) {
            load(character?.thumbnail)
        }
    }
}