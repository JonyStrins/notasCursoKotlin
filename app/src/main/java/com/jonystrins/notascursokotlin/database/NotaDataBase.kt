package com.jonystrins.notascursokotlin.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jonystrins.notascursokotlin.dao.NotaDao
import com.jonystrins.notascursokotlin.models.NotaEntity

@Database(entities = [NotaEntity::class], version = 1)
abstract class NotaDataBase(): RoomDatabase(){
    abstract val dao: NotaDao
}
