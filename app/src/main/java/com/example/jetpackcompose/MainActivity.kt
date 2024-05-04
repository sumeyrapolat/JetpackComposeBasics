package com.example.jetpackcompose

import android.os.Bundle
import android.telecom.Call
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.jetpackcompose.ui.theme.Coil.CoilImage
import com.example.jetpackcompose.ui.theme.Coil.CoilImagePreview
import com.example.jetpackcompose.ui.theme.TextField.MyTextField
import com.example.jetpackcompose.ui.theme.ExpandableCard.ExpandableCard
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import com.example.jetpackcompose.ui.theme.Password.PasswordComp
import com.example.jetpackcompose.ui.theme.SignUpWithGoogle.SignUpWithGoogle
import com.example.jetpackcompose.ui.theme.SubScript.CallSubScriptText
import com.example.jetpackcompose.ui.theme.SuperScript.CallSuperScriptText
import com.example.jetpackcompose.ui.theme.SuperScript.SuperScriptText
import com.example.jetpackcompose.ui.theme.TextSelection.TextSelection

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    //ExpandableCard()
                    //TextSelection()
                    //CallSuperScriptText()
                    // CallSubScriptText()
                    // MyTextField()
                    /* SignUpWithGoogle("Sign Up With Google", "Account Loading...", onClicked = {
                        Log.i("google button", "clicked")
                    }*/
                        //CoilImage()
                    PasswordComp()
                }

                //CoilImage()


            }
        }
    }
}

