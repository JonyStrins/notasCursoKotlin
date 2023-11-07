package com.jonystrins.notascursokotlin.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ItemListComponent(){
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        ),
        modifier = Modifier
            .size(width = 150.dp, height = 125.dp)
    ) {
        Text("Titulo", modifier = Modifier.padding(3.dp, 5.dp, 0.dp, 0.dp))
        Text("Descripcion", modifier = Modifier.padding(3.dp, 5.dp, 0.dp, 0.dp))
    }
}