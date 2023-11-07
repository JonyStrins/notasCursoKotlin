package com.jonystrins.notascursokotlin.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.jonystrins.notascursokotlin.models.NotaEntity

@Dao
interface NotaDao {

    @Query("SELECT * FROM NotaEntity")
    fun getAll(): List<NotaEntity>

    @Query("SELECT * FROM NotaEntity WHERE id = :notaid")
    fun getNotaByID(notaid: Int): NotaEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNota(nota: NotaEntity)

//    @Update
//    fun actualizarNota(nota: NotaEntity)

    @Delete
    fun eliminarNota(nota: NotaEntity)
}