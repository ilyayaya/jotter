package com.example.jotter.presentation.Fragments.Home.adapter;

import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jotter.databinding.NoteItemBinding;

public class NoteHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public NoteItemBinding itemView;

    public NoteHolder(@NonNull NoteItemBinding itemView) {

        super(itemView.getRoot());
        this.itemView = itemView;

    }

    @Override
    public void onClick(View view) {

    }
}
