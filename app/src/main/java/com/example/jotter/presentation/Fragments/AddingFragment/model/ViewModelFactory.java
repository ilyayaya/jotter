package com.example.jotter.presentation.Fragments.AddingFragment.model;

import android.content.Context;
import android.content.res.Resources;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class ViewModelFactory implements ViewModelProvider.Factory {

    Context context;

    public ViewModelFactory(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(NewNoteViewModel.class))
            return (T) new NewNoteViewModel(context);

        throw new Resources.NotFoundException("Wrong ViewModel type");
    }
}
