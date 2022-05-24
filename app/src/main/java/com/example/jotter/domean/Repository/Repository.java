package com.example.jotter.domean.Repository;

import com.example.jotter.Note;

import java.util.List;

public interface Repository {

    void SaveNoteInStorage(Note note);

    List<Note> GetRootByPreviousId(int previous_id);

    List<Note> GetPreviousByTempId(int temp_id);

    List<Note> GetAllNote();

    Note GetNoteById(int Id);

    void DeleteNote(Note note);
}
