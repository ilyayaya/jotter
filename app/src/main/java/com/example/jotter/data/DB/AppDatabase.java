package com.example.jotter.data.DB;

import androidx.room.AutoMigration;
import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {NoteItem.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NoteItemDao Dao();
}