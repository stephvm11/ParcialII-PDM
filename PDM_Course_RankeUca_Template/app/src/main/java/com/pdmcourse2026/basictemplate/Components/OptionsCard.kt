package com.pdmcourse2026.basictemplate.Components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.pdmcourse2026.basictemplate.model.Option
import okio.Options

@Composable
fun OptionsCard(option: Option) {
    Card(modifier = Modifier
        .fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            AsyncImage(
                model = option.imageUrl,
                contentDescription = "",
                modifier = Modifier
                    .size(150.dp)
                    .padding(bottom = 5.dp),
                contentScale = ContentScale.Crop
            )
            Column() {Text(
                text = option.name
            )
                Text(
                    text = "Toca para votar"
                ) }

        }


    }

}