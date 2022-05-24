package com.example.jotter.presentation.adapter;

import android.content.res.Resources;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.jotter.presentation.Fragments.AddingFragment.NewNoteFragment;
import com.example.jotter.presentation.Fragments.Home.HomeFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new NewNoteFragment();
            default:
                throw new Resources.NotFoundException();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
