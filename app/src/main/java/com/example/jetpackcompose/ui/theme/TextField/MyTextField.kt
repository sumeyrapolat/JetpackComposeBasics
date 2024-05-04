package com.example.jetpackcompose.ui.theme.TextField

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun MyTextField() {

        var name by remember {
            mutableStateOf("")
        }

        OutlinedTextField(
            value = name,
            onValueChange = {
            name = it
        },
            //enabled = false,    //enable = false ile veri girişini kapatmış oluyoruz.
            //readOnly = true     //readOnly ile sadece okuma işlemi yapmamızı sağlamış oluyoruz.
            label = {
                Text(text = "Enter your email ")
            },
            singleLine = true,      // giriş bilgilerinin tek bir satırda kalmasını
            maxLines = 1,          //burada da yine aynı şekilde kaç satır izin veriyorsak ölçebiliyoruz

            leadingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Email,
                        contentDescription = "Email Icon")
                }
            },

            trailingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Check,
                        contentDescription = "Checked" )
                }
            },

            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Search
            ),

            keyboardActions = KeyboardActions(
                onSearch = {
                    Log.i("ImeAction", "clicked")
                }
            )
        )
}