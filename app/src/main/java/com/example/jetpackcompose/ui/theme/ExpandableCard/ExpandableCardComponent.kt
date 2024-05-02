package com.example.jetpackcompose.ui.theme.ExpandableCard

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExpandableCard() {
    var expandableState by rememberSaveable {
        mutableStateOf(false)    }

    val rotationState by animateFloatAsState(
        targetValue = if (expandableState) 180f else 0f)


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            ),
        onClick = {
            expandableState = !expandableState
        }

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(modifier = Modifier.weight(7f),
                    text ="AndroSumBlog",
                    fontSize = MaterialTheme.typography.headlineSmall.fontSize,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                IconButton(
                    modifier = Modifier
                        .weight(1f)
                        .rotate(rotationState),
                    onClick = {
                        expandableState = !expandableState
                    }) {
                    Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "Arrow Drop Down" )
                }
            }

            if(expandableState){
                Text(text = "Merhaba ben sümeyra bir süredir android laanında kendimi geliştermek için günlük egzersizler yapıyorum umarım bir gün başarılı bir kadın android developer olarak bu sektörde bir yerim olur.Merhaba ben sümeyra bir süredir android laanında kendimi geliştermek için günlük egzersizler yapıyorum umarım bir gün başarılı bir kadın android developer olarak bu sektörde bir yerim olur.",
                    fontSize = MaterialTheme.typography.bodySmall.fontSize,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis)
            }

        }
    }
    
}

@Composable
@Preview
fun ExpandableCardPreview() {
    ExpandableCard()
}