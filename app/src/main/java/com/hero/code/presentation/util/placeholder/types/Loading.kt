package com.hero.code.presentation.util.placeholder.types

import com.hero.code.presentation.util.placeholder.Placeholder

class Loading : Placeholder {
    override val progressVisible: Boolean get() = true
    override val visible: Boolean get() = true
}