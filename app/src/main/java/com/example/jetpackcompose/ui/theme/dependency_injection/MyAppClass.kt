package com.example.jetpackcompose.ui.theme.dependency_injection

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyAppClass : Application() {

    //burada amacımız hilt grafiğinin başlangıcını uygulamamızda başlatabilmek
}