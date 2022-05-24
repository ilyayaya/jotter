package com.example.jotter.presentation.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.res.Resources;
import android.os.Bundle;

import com.example.jotter.R;
import com.example.jotter.presentation.Fragments.AddingFragment.NewNoteFragment;
import com.example.jotter.presentation.Fragments.Home.HomeFragment;
import com.example.jotter.presentation.adapter.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabLayout tabLayout = findViewById(R.id.tabLayout_id);
        ViewPager2 viewPager = findViewById(R.id.ViewPager_id);
        viewPager.setAdapter(new ViewPagerAdapter(this));

        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                if(position == 0)
                    tab.setText("home");
                else
                    tab.setText("add");

            }
        }).attach();


    }
}