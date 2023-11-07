package com.jonystrins.notascursokotlin.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NotaEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val titulo: String,
    val descripcion: String
)
