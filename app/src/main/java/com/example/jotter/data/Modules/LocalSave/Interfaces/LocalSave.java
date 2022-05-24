package com.example.jotter.data.Modules.LocalSave.Interfaces;

import com.example.jotter.data.DB.NoteItem;

import java.util.List;

public interface LocalSave {

    List<NoteItem> GetRoot(int index);

    List<NoteItem> GetPrevious(int index);

    List<NoteItem> GetAll();

    NoteItem Get(int index);

    public void Save(NoteItem noteItem);

    public void Delete(NoteItem noteItem);


}
