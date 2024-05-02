package com.example.jetpackcompose.ui.theme.SubScript

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle

@Composable
fun SubScriptText(
    normalText: String,
    subText: String
) {

    Text(buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = MaterialTheme.typography.labelLarge.fontSize
            )
        ){
            append(normalText)
        }

        withStyle(
            style= SpanStyle(
                fontSize = MaterialTheme.typography.labelMedium.fontSize,
                fontWeight = FontWeight.Light,
                baselineShift = BaselineShift.Subscript
            )
        ){
            append(subText)
        }
    }

    )

}

@Composable
fun CallSubScriptText() {
    SubScriptText("Sümeyra","Polat")
    
}