package com.example.jetpackcompose.ui.theme.dependency_injection.myInterface

import com.example.jetpackcompose.ui.theme.dependency_injection.myInterface.ColorInterface
import javax.inject.Inject


class ColorImplementor @Inject constructor()
    : ColorInterface {
    override fun productColor(): String {
        return "soft pink"
    }

}