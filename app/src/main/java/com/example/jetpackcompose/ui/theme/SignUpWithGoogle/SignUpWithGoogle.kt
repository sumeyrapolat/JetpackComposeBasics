package com.example.jetpackcompose.ui.theme.SignUpWithGoogle

import android.util.Log
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R

@Composable
fun SignUpWithGoogle(
    //değişkenlerimi sabitliyorum

    text : String = "Sign Up With Google",
    loadingText : String = "Creating Account",
    Icon: Painter = painterResource(id = R.drawable.ic_google_logo),
    borderColor : Color = Color.Black,
    backgroundColor : Color = MaterialTheme.colorScheme.surface,
    progressInicatorColor : Color =  MaterialTheme.colorScheme.primary,
    onClicked : ()-> Unit


) {

    var clicked by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Surface(onClick = { clicked = !clicked },
            shape = RectangleShape,
            border = BorderStroke(width = 1.dp, color = borderColor),
            color = backgroundColor
        )
        {

            Row(
                modifier = Modifier
                    .padding(start = 12.dp, end = 16.dp, top = 12.dp, bottom = 12.dp)
                    .animateContentSize(
                        animationSpec = tween(
                            durationMillis = 300,
                            easing = LinearOutSlowInEasing
                        )
                    ) ,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,

                )

            {
                Icon(painter = Icon,
                    contentDescription ="Google Logo",
                    tint= Color.Unspecified
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = if (clicked) loadingText else text)

                if (clicked){
                    Spacer(modifier = Modifier.width(16.dp))

                    CircularProgressIndicator(
                        modifier = Modifier
                            .height(16.dp)
                            .width(16.dp),
                        strokeWidth = 2.dp,
                        color =progressInicatorColor
                    )
                    onClicked()
                }
            }

        }
    }
}

@Composable
@Preview
fun SignUpWithGooglePreview() {
    SignUpWithGoogle("Sign Up With Google", "Account Loading...", onClicked = {
        Log.i("google button", "clicked")
    })
}