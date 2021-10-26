package com.raychal.myNoteApps.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.raychal.myNoteApps.database.Note
import com.raychal.myNoteApps.repository.NoteRepository

class MainViewModel(app: Application) : ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(app)

    fun getAllNotes(): LiveData<List<Note>> = mNoteRepository.getAllNotes()
}