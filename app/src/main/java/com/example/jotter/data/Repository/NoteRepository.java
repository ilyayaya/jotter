package com.example.jotter.data.Repository;

import com.example.jotter.data.Modules.LocalSave.Interfaces.LocalSave;
import com.example.jotter.data.Modules.Convertation.ConvertDomeanAndDbToNote;
import com.example.jotter.Note;
import com.example.jotter.domean.Repository.Repository;

import java.util.List;

public class NoteRepository implements Repository {

    LocalSave localOperations;
    ConvertDomeanAndDbToNote converter;

    public NoteRepository(LocalSave localOperations) {
        this.localOperations = localOperations;
        converter = new ConvertDomeanAndDbToNote();
    }

    @Override
    public void SaveNoteInStorage(Note note) {
        localOperations.Save(converter.VariableToDbType(note));
    }

    @Override
    public List<Note> GetRootByPreviousId(int previous_id) {

        return converter.ArrayToDomeanType(localOperations.GetRoot(previous_id));
    }

    @Override
    public List<Note> GetPreviousByTempId(int temp_id) {

        return converter.ArrayToDomeanType(localOperations.GetPrevious(temp_id));
    }

    @Override
    public List<Note> GetAllNote() {
        return converter.ArrayToDomeanType(localOperations.GetAll());
    }

    @Override
    public Note GetNoteById(int Id) {
        return converter.VariableToDomeanType(localOperations.Get(Id));
    }

    @Override
    public void DeleteNote(Note note) {
        localOperations.Delete(converter.VariableToDbType(note));
    }
}
