package com.example.jotter.presentation.Fragments.AddingFragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jotter.Note;
import com.example.jotter.R;


public class NewNoteFragment extends Fragment {

    public NewNoteFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_new_note, container, false);

        Button creteNewNote = root.findViewById(R.id.SaveButton_id);
        CheckBox checkBoxButton = root.findViewById(R.id.checkBoxButton_id);
        CheckBox checkBoxDepartment = root.findViewById(R.id.checkBoxDepartment_id);
        //view element initialization

        checkBoxButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!checkBoxDepartment.isChecked())
                    checkBoxDepartment.setChecked(false);
                TextView tv = root.findViewById(R.id.textView5);
                tv.setText("ok");
                Toast.makeText(root.getContext(), "onClick", Toast.LENGTH_SHORT);
            }
        });

        checkBoxDepartment.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!checkBoxButton.isChecked())
                    checkBoxButton.setChecked(false);
                Toast.makeText(root.getContext(), "onClick", Toast.LENGTH_SHORT);
            }
        });
        //processing: if one checkBox = true - then the second becomes false

        creteNewNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = root.findViewById(R.id.textView5);
                tv.setText("ok");
            }
        });

        return inflater.inflate(R.layout.fragment_new_note, container, false);
    }
}



