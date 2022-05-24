package com.example.jotter.presentation.Fragments.Home.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jotter.databinding.NoteItemBinding;
import com.example.jotter.Note;

import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteHolder>{

    List<Note> tempLst;


    public NoteAdapter(List<Note> tempLst) {
        this.tempLst = tempLst;

        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NoteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        NoteItemBinding itemBinding = NoteItemBinding.inflate(inflater,parent,false);

        return new NoteHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteHolder holder, int position) {
         Note note = tempLst.get(position);
         holder.itemView.setNote2(note);
    }

    @Override
    public int getItemCount() {
        return tempLst.size();
    }
}
