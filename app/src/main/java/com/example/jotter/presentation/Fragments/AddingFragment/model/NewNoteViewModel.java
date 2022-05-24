package com.example.jotter.presentation.Fragments.AddingFragment.model;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class NewNoteViewModel extends ViewModel {

    LiveData<String> nameNewNote;
    LiveData<Integer> priceNewNote;
    Context context;

    public NewNoteViewModel(Context context) {
        this.context = context;
    }

   /* public void SaveDataInDatabase(String text, CheckBox checkBoxButton, CheckBox checkBoxDep, ){

        TypeNote type;
        if(checkBoxButton.isChecked()){
            type = TypeNote.Nomenclature;
        }else if(checkBoxDep.isChecked()){
            type = TypeNote.DepartmentNomenclature;
        }else{
            type = TypeNote.Uncertain;
            Toast.makeText(context,"select cell type", Toast.LENGTH_SHORT);
        }

        if(type != TypeNote.Uncertain)
           // Note newNote = new Note(text,type,0,);



       // new SaveDataInDb(new NoteRepository(new LocalSaveInDb(context))).Save(newNote);
    }*/

}
