package com.jonystrins.notascursokotlin.repository

import com.jonystrins.notascursokotlin.dao.NotaDao
import com.jonystrins.notascursokotlin.models.NotaEntity

class NotaRepository(
    private val dao: NotaDao
) {
    fun getAll(): List<NotaEntity>{
        return dao.getAll()
    }

    fun getNotaById(id: Int): NotaEntity{
        return dao.getNotaByID(id)
    }

    fun insertNota(nota: NotaEntity){
        dao.insertNota(nota)
    }

    fun eliminarNota(nota: NotaEntity){
        dao.eliminarNota(nota)
    }
}