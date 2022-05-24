package com.example.jotter.data.Modules.Convertation;

import com.example.jotter.data.DB.NoteItem;
import com.example.jotter.Note;
import com.example.jotter.domean.Entity.TypeNote;

import java.util.ArrayList;
import java.util.List;

public class ConvertDomeanAndDbToNote implements ConvertDomeanAndDb<NoteItem,Note> {


    @Override
    public Note VariableToDomeanType(NoteItem noteItem) {
        TypeNote type = ConvertType(noteItem.getTypeItem());

        Note note = new Note(noteItem.getTextNote(),type,
                noteItem.getQuantitySold(), noteItem.getUid(),
                noteItem.getPreviousID(),noteItem.getPreviousPreviousID()
                );
        return note;
    }

    @Override
    public NoteItem VariableToDbType(Note noteItem) {

        NoteItem note = new NoteItem(noteItem.getTextNote(),noteItem.getTypeNote(),noteItem.getPrevioutId(),
                noteItem.getRootId());
        return note;
    }

    @Override
    public List<Note> ArrayToDomeanType(List<NoteItem> arrayNoteItem) {
        List<Note> lst = new ArrayList<>();

        for(NoteItem noteItem: arrayNoteItem){
            TypeNote type = ConvertType(noteItem.getTypeItem());

            Note newNote = new Note(noteItem.getTextNote(), type,
                    noteItem.getQuantitySold(), noteItem.getUid(),
                    noteItem.getPreviousID(),noteItem.getPreviousPreviousID());

            lst.add(newNote);
        }

        return lst;
    }

    @Override
    public List<NoteItem> ArrayToDbType(List<Note> arrayNoteItem) {
        List<NoteItem> lst = new ArrayList<>();

        for(Note noteItem: arrayNoteItem){
            NoteItem note = new NoteItem(noteItem.getTextNote(),noteItem.getTypeNote(),noteItem.getPrevioutId(),
                    noteItem.getRootId());

            lst.add(note);
        }

        return lst;
    }

    private TypeNote ConvertType(String strTypeItem){
        switch (strTypeItem) {
            case "Nomenclature":
                return TypeNote.Nomenclature;
            case "DepartmentNomenclature":
                return TypeNote.DepartmentNomenclature;
            default:
                return TypeNote.Uncertain;
        }
    }
}
