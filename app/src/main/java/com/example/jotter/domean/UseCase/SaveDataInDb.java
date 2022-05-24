package com.example.jotter.domean.UseCase;

import com.example.jotter.Note;
import com.example.jotter.data.Repository.NoteRepository;

public class SaveDataInDb {

    private NoteRepository noteRepository;

    public SaveDataInDb(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public void Save(Note note){
        noteRepository.SaveNoteInStorage(note);
    }
}
