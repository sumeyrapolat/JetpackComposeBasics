package com.example.jetpackcompose.ui.theme.LazyColumn

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnComponent() {
    val personRepository = PersonRepository()
    val getAllData = personRepository.getAllData()

    LazyColumn(
        modifier = Modifier.padding(1.dp),
        contentPadding = PaddingValues(24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp) // 8dp boşluk ekleyelim
    ){
        items(items = getAllData){ person ->
            CustomItem(person = person)

        }
    }
}