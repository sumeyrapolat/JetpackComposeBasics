package com.example.jetpackcompose.ui.theme.LimitedTextField

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun LimitedTextField()
{
    var name by remember {
        mutableStateOf("")
    }

    val limit :Int =10

    OutlinedTextField(
        value = name,
        onValueChange = {
            if (limit > it.length){}
                name =it
                        },
        label = { Text(text = "Name") },
        placeholder = { Text(text = "Enter your name here")}
        )
}