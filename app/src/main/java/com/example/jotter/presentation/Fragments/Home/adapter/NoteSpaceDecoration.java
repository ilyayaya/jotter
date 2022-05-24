package com.example.jotter.presentation.Fragments.Home.adapter;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NoteSpaceDecoration extends RecyclerView.ItemDecoration{
    int space;

    public NoteSpaceDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        outRect.bottom = space;
        outRect.left = space;
        outRect.right = space / 2;
        outRect.top = space;
        //super.getItemOffsets(outRect, view, parent, state);
    }
}
