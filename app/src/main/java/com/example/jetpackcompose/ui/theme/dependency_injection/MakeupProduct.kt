package com.example.jetpackcompose.ui.theme.dependency_injection

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MakeupProduct
    @Inject
        constructor( makeupCategory: MakeupCategory, productType: ProductType) {

    fun makeup(){
        println("Makeup is the best things ever.")
    }
}