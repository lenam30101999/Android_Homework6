package com.example.homework6.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework6.R;
import com.example.homework6.fragment_phone.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class FragmentPhone extends Fragment {

    private TabLayout tab;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private View v;

    public FragmentPhone() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_phone, container, false);
        tab = v.findViewById(R.id.tabLayout);
        viewPager=v.findViewById(R.id.pager);
        adapter=new ViewPagerAdapter(getChildFragmentManager(),
                ViewPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        tab.setupWithViewPager(viewPager);
        return v;
    }
}