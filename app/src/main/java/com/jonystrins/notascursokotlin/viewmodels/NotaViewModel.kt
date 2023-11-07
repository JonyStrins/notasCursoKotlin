package com.jonystrins.notascursokotlin.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jonystrins.notascursokotlin.models.NotaEntity
import com.jonystrins.notascursokotlin.repository.NotaRepository
import com.jonystrins.notascursokotlin.state.NotaState
import kotlinx.coroutines.launch

class NotaViewModel(
    private val repository: NotaRepository
): ViewModel() {

    var state by mutableStateOf(NotaState())
        private set

    init {
        viewModelScope.launch {
            state = state.copy(
                notas = repository.getAll()
            )
        }
    }

    fun obtenerNotaID(id: Int){
        viewModelScope.launch {
            state = state.copy(
                nota = repository.getNotaById(id)
            )
        }
    }

    fun guardarNota(nota: NotaEntity){
        viewModelScope.launch {
            repository.insertNota(nota)
        }
    }

    fun actualizarNota(nota: NotaEntity){
        viewModelScope.launch {
            repository.insertNota(nota)
        }
    }

    fun eliminarNota(nota:NotaEntity){
        viewModelScope.launch {
            repository.eliminarNota(nota)
        }
    }
}