package com.example.jotter.presentation.Fragments.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jotter.R;
import com.example.jotter.Note;
import com.example.jotter.domean.Entity.TypeNote;
import com.example.jotter.presentation.Fragments.Home.adapter.NoteAdapter;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    Presenter presenter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new Presenter(this.getContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView rcView = root.findViewById(R.id.RecyclerHome_id);
        presenter.initRecyclerView(rcView);


        return root;
    }
}