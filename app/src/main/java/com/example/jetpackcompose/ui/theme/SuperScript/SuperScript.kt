package com.example.jetpackcompose.ui.theme.SuperScript

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle

@Composable
fun SuperScriptText(
    normalText: String,
    superText: String
) {
    Text(buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = MaterialTheme.typography.labelLarge.fontSize,

                )
        ){
            append(normalText)
        }

        withStyle(
            style = SpanStyle(
                fontSize = MaterialTheme.typography.labelMedium.fontSize,
                fontWeight = FontWeight.Light,
                baselineShift = BaselineShift.Superscript
            )
        ){
            append(superText)
        }
    })

}

@Composable
fun CallSuperScriptText() {
    SuperScriptText(normalText ="X", superText ="2" )
}