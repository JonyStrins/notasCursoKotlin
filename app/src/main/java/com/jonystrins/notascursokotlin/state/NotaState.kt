package com.jonystrins.notascursokotlin.state

import com.jonystrins.notascursokotlin.models.NotaEntity

data class NotaState(
    val nota: NotaEntity = NotaEntity(id = 0, titulo = "", descripcion = ""),
    val notas: List<NotaEntity> = emptyList()
)
