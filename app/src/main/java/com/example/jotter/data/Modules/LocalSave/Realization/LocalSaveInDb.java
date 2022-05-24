package com.example.jotter.data.Modules.LocalSave.Realization;

import android.content.Context;

import androidx.room.Room;

import com.example.jotter.data.DB.AppDatabase;
import com.example.jotter.data.DB.NoteItem;
import com.example.jotter.data.DB.NoteItemDao;
import com.example.jotter.data.Modules.LocalSave.Interfaces.LocalSave;

import java.util.List;

public class LocalSaveInDb implements LocalSave {

    AppDatabase appDatabase;

    public LocalSaveInDb(Context context) {
        appDatabase = Room.databaseBuilder(context,
                AppDatabase.class, "database-name").allowMainThreadQueries().build();
    }

    @Override
    public List<NoteItem> GetRoot(int index) {
        NoteItemDao noteItemDao = appDatabase.Dao();
        return noteItemDao.findPreviousPreviousByPreviousID(index);
    }

    @Override
    public List<NoteItem> GetPrevious(int index) {
        NoteItemDao noteItemDao = appDatabase.Dao();
        return noteItemDao.findPreviousByID(index);
    }

    @Override
    public List<NoteItem> GetAll() {
        NoteItemDao noteItemDao = appDatabase.Dao();
        return noteItemDao.getAll();
    }

    @Override
    public NoteItem Get(int index) {
        NoteItemDao noteItemDao = appDatabase.Dao();
        if (noteItemDao.findByID(index).get(0) != null)
            return noteItemDao.findByID(index).get(0);
        else
            return null;
    }

    @Override
    public void Save(NoteItem noteItem) {
        NoteItemDao noteItemDao = appDatabase.Dao();
        noteItemDao.insertInDb(noteItem);
    }

    @Override
    public void Delete(NoteItem noteItem) {
        NoteItemDao noteItemDao = appDatabase.Dao();
        noteItemDao.delete(noteItem);
    }
}
