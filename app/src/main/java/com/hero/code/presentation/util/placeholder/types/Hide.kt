package com.hero.code.presentation.util.placeholder.types

import com.hero.code.presentation.util.placeholder.Placeholder

class Hide : Placeholder {
    override val progressVisible: Boolean get() = false
    override val visible: Boolean get() = false
}