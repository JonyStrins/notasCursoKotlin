package com.jonystrins.notascursokotlin.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonystrins.notascursokotlin.components.BotonFlotanteExtendido
import com.jonystrins.notascursokotlin.components.ItemListComponent

@SuppressLint("UnrememberedMutableState")
@Preview
@Composable
fun HomeScreen(){
    Scaffold(
        floatingActionButton = {
            BotonFlotanteExtendido()
        },
        topBar = {

        },
        bottomBar = {

        }

    ) {
        padding ->

        Row(
            modifier = Modifier.fillMaxWidth().padding(padding),
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Notas", fontSize = 50.sp)
        }
        Row (
        ){
            LazyVerticalGrid(
                columns = GridCells.Adaptive(150.dp)
            ){
                items(6){
                    ItemListComponent()
                }
            }
        }
    }
}