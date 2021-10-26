package com.raychal.myNoteApps.ui.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import com.raychal.myNoteApps.database.Note
import com.raychal.myNoteApps.repository.NoteRepository

class NoteAddUpdateViewModel(app: Application) : ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(app)

    fun insert(note: Note){
        mNoteRepository.insert(note)
    }

    fun update(note: Note){
        mNoteRepository.update(note)
    }

    fun delete(note: Note){
        mNoteRepository.delete(note)
    }
}