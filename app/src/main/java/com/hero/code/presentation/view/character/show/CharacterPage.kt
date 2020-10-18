package com.hero.code.presentation.view.character.show

import com.hero.code.domain.entity.character.Character

data class CharacterPage(
    val firstCharacter: Character?,
    val secondCharacter: Character?,
    val thirdCharacter: Character?,
    val fourthCharacter: Character?
) {

    companion object {
        private const val TOTAL_CHARACTERS = 4

        fun fromCharacterList(characterList: List<Character?>): CharacterPage {
            if (characterList.size > TOTAL_CHARACTERS) {
                throw RuntimeException(
                    "List total size is not supported by presentation. Please make the necessary changes on CharacterPage and ShowCharacterFragment"
                )
            } else return CharacterPage(
                firstCharacter = characterList.getOrNull(0),
                secondCharacter = characterList.getOrNull(1),
                thirdCharacter = characterList.getOrNull(2),
                fourthCharacter = characterList.getOrNull(3)
            )
        }
    }
}