package com.example.homework6.fragment_phone;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.homework6.fragment_phone.Fragment1;
import com.example.homework6.fragment_phone.Fragment2;
import com.example.homework6.fragment_phone.Fragment3;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        Fragment fragment = null;
        if (position == 0)
            fragment = new Fragment1();
        else if (position == 1)
            fragment = new Fragment2();
        else if (position == 2)
            fragment = new Fragment3();

        return fragment;
    }

    @Override
    public int getCount()
    {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        String title = null;
        if (position == 0)
            title = "IOS";
        else if (position == 1)
            title = "Android";
        else if (position == 2)
            title = "Windows";
        return title;
    }
}