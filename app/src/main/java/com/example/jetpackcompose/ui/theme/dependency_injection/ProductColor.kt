package com.example.jetpackcompose.ui.theme.dependency_injection

import com.example.jetpackcompose.ui.theme.dependency_injection.myInterface.ColorInterface
import javax.inject.Inject

class ProductColor
@Inject constructor(private val colorImplementor: ColorInterface){

    fun getColor() :String {
        return  "Your color set to ${colorImplementor.productColor()}"
    }
}