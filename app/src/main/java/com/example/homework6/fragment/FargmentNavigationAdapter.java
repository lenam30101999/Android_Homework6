package com.example.homework6.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FargmentNavigationAdapter extends FragmentStatePagerAdapter {
    private int numPage = 4;

    public FargmentNavigationAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FragmentPhone();
            case 1: return new FragmentLaptop();
            case 2: return new FragmentCart();
            case 3: return new FragmentProfile();
            default: return new FragmentPhone();
        }
    }

    @Override
    public int getCount() {
        return numPage;
    }
}
