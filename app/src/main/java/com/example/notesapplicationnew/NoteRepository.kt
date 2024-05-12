package com.example.notesapplicationnew

import androidx.lifecycle.LiveData

class NoteRepository (private val notesDao:NotesDao){
    val allNotes: LiveData<List<Note>> = notesDao.getAllNotes()


    //insert the data
    suspend fun insert(note:Note){
        notesDao.insert(note)
    }
    //update the data
    suspend fun delete(note:Note){
        notesDao.delete(note)
    }
    //delete the data
    suspend fun update(note:Note){
        notesDao.update(note)
    }
}