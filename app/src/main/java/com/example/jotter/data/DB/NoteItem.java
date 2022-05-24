package com.example.jotter.data.DB;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_item")
public class NoteItem {


    public NoteItem(String textNote,String typeItem,int previousID, int previousPreviousID) {
        this.textNote = textNote;
        this.typeItem = typeItem;
        this.quantitySold = 0;
        this.previousID = previousID;
        this.previousPreviousID = previousPreviousID;
    }

    @PrimaryKey(autoGenerate = true)
    private int uid;

    @ColumnInfo(name = "previous_id")
    private int previousID;

    @ColumnInfo(name = "previous_previous_id")
    private int previousPreviousID;

    @ColumnInfo(name = "text_note")
    private String textNote;

    @ColumnInfo(name = "type_item")
    private String typeItem;

    @ColumnInfo(name = "quantity_sold")
    private int quantitySold;

    public int getUid() {
        return uid;
    }

    public int getPreviousID() {
        return previousID;
    }

    public int getPreviousPreviousID() {
        return previousPreviousID;
    }

    public String getTextNote() {
        return textNote;
    }

    public String getTypeItem() {
        return typeItem;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }
}
