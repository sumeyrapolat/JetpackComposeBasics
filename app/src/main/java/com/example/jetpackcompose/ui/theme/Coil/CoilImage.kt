package com.example.jetpackcompose.ui.theme.Coil

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlurEffect
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import coil.request.ImageRequest
import com.example.jetpackcompose.R

@Composable
fun CoilImage() {
    Box(
        modifier = Modifier
            .width(150.dp)
            .height(150.dp),
        contentAlignment = Alignment.Center
    ){
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data("https://static.ticimax.cloud/cdn-cgi/image/width=540,quality=99/9062/uploads/editoruploads/11964cf9409215cac6bdb628330501d3.jpg")
                .crossfade(true)
                .build(),
            placeholder = painterResource(R.drawable.ben),
            error = painterResource(id = R.drawable.error),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.clip(CircleShape)
        )
    }
}

@Composable
@Preview
fun CoilImagePreview() {
    CoilImage()
}