package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import com.example.jetpackcompose.ui.theme.LazyColumn.StickyHeaderWithLazyColumn
import com.example.jetpackcompose.ui.theme.color2
import com.example.jetpackcompose.ui.theme.color3
import com.example.jetpackcompose.ui.theme.color4

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
                    //PasswordComp()


               /*  GradientButton(
                     text = "Welcome",
                     textColor = Color.White,
                     gradient = Brush.horizontalGradient(
                        colors = listOf(
                            color1,
                            color2,
                            color3,
                            color4
                        )
                     )
                 ) {

                 } */
                }

                //CoilImage()

                //LazyColumnComponent()

                StickyHeaderWithLazyColumn()


            }
        }
    }
}

