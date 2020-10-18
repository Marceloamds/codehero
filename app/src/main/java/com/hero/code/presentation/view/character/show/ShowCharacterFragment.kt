package com.hero.code.presentation.view.character.show

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.fragment.app.Fragment
import com.hero.code.databinding.FragmentShowCharacterBinding
import com.hero.code.databinding.ItemCharacterBinding
import com.hero.code.domain.entity.character.Character
import com.hero.code.presentation.util.extension.circleLoad
import com.hero.code.presentation.util.navigation.NavData
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class ShowCharacterFragment : Fragment() {

    private lateinit var binding: FragmentShowCharacterBinding

    private val position by lazy { arguments?.getInt(POSITION_EXTRA, 0) ?: 0 }
    private val query by lazy { arguments?.getString(QUERY_EXTRA, "") ?: "" }

    private val _viewModel: ShowCharacterViewModel by viewModel { parametersOf(position, query) }

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
        _viewModel.charactersList.observe(viewLifecycleOwner, ::onCharactersReceived)
        _viewModel.placeholder.observe(viewLifecycleOwner) {
            binding.placeholderView.setPlaceholder(it)
        }
        _viewModel.goTo.observe(viewLifecycleOwner, ::onGoTo)
    }

    private fun onCharactersReceived(characterList: List<Character?>?) {
        characterList?.let {
            with(binding) {
                firstCharacter.setupCharacter(characterList[0])
                secondCharacter.setupCharacter(characterList[1])
                thirdCharacter.setupCharacter(characterList[2])
                fourthCharacter.setupCharacter(characterList[3])
            }
        }
    }

    private fun ItemCharacterBinding.setupCharacter(character: Character?) {
        this.character = character
        root.setOnClickListener { _viewModel.onCharacterSelected(character) }
    }

    private fun onGoTo(navData: NavData?) {
        context?.let { navData?.navigate(it) }
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

        @BindingAdapter("loadCharacterImage")
        @JvmStatic
        fun ImageView.loadCharacterImage(character: Character?) {
            circleLoad(character?.thumbnail)
        }
    }
}