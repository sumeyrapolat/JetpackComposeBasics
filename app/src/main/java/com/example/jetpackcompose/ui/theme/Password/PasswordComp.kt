package com.example.jetpackcompose.ui.theme.Password

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.R

@Composable
fun PasswordComp() {

    var password by rememberSaveable {
        mutableStateOf("")
    }

    var passwordVisibility by rememberSaveable {
        mutableStateOf(false)
    }

    val icon = if(passwordVisibility){
        painterResource(id = R.drawable.outline_visibility_24)
    }else {
        painterResource(id = R.drawable.outline_visibility_off_24)
    }


    OutlinedTextField(value = password, onValueChange = {
        password = it
    },
        placeholder = {
            Text(text = "Password")
        },
        label = {
            Text(text = "Password")
        },
        trailingIcon = {
            IconButton(onClick = {
                passwordVisibility = !passwordVisibility
            }) {
                Icon(
                    painter = icon,
                    contentDescription ="Visibilitiy Lock Icon")

            }
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Done

        ),
        keyboardActions = KeyboardActions(
            onDone = {
                Log.i("ImeAction", "clicked")

            }
        ),
        visualTransformation = if(passwordVisibility) VisualTransformation.None
        else PasswordVisualTransformation()


    )



}


