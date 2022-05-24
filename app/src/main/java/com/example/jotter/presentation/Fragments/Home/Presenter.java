package com.example.jotter.presentation.Fragments.Home;

import android.content.Context;
import android.view.Display;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jotter.Note;
import com.example.jotter.R;
import com.example.jotter.domean.Entity.TypeNote;
import com.example.jotter.presentation.Fragments.Home.adapter.NoteAdapter;
import com.example.jotter.presentation.Fragments.Home.adapter.NoteSpaceDecoration;

import java.util.ArrayList;
import java.util.List;

public class Presenter {

    Context context;

    public Presenter(Context context) {
        this.context = context;
    }

    public void initRecyclerView(RecyclerView rcView){



        List<Note> lstNote = new ArrayList<>();


        lstNote.add(new Note("textNote", TypeNote.Uncertain,0,1 , 0,0));
        lstNote.add(new Note("textNote", TypeNote.Uncertain,0,1 , 0,0));
        lstNote.add(new Note("textNote", TypeNote.Uncertain,0,1 , 0,0));
        lstNote.add(new Note("textNote", TypeNote.Uncertain,0,1 , 0,0));
        NoteAdapter adapter = new NoteAdapter(lstNote);
        rcView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false));

        rcView.setAdapter(adapter);

    }
}
