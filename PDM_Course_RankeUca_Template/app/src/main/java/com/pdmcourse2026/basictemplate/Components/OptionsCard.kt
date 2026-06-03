package com.pdmcourse2026.basictemplate.Components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.pdmcourse2026.basictemplate.model.Option
import okio.Options

@Composable
fun OptionsCard(option: Option){
    Card(modifier = Modifier.fillMaxWidth() ) {
        AsyncImage(
            model = option.imageUrl,
            contentDescription = "",
            modifier = Modifier.size(50.dp).
        )

    }

}