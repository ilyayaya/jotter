package com.example.jotter.data.DB;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface NoteItemDao {

    @Query("SELECT * FROM note_item")
    List<NoteItem> getAll();

    @Query("SELECT * FROM note_item WHERE previous_id = :tempID")
    List<NoteItem> findPreviousByID(int tempID);

    @Query("SELECT * FROM note_item WHERE previous_previous_id = :previousID")
    List<NoteItem> findPreviousPreviousByPreviousID(int previousID);

    @Query("SELECT * FROM note_item WHERE uid = :ID")
    List<NoteItem> findByID(int ID);

    @Insert
    void insertInDb(NoteItem note);

    @Delete
    void delete(NoteItem note);

}
