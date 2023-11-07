package com.jonystrins.notascursokotlin.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun BotonFlotanteExtendido(){
    ExtendedFloatingActionButton(onClick = {

    }){
        Icon(Icons.Default.Add, "")
        Text(text = "Extended FAB")
    }
}