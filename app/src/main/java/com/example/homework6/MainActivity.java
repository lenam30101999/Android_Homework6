package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;

import com.example.homework6.fragment.FargmentNavigationAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView navigationView;
    private ViewPager viewPager;
    private FargmentNavigationAdapter adapter;
    private FloatingActionButton bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        navigationView = findViewById(R.id.navigation);
        bt = findViewById(R.id.fab);
        bt.setOnClickListener(v -> Toast.makeText(MainActivity.this,"Clicked!",Toast.LENGTH_SHORT).show());
        adapter = new FargmentNavigationAdapter(getSupportFragmentManager(),
                FargmentNavigationAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        navigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_phone:viewPager.setCurrentItem(0);
                    break;
                case R.id.navigation_laptop:viewPager.setCurrentItem(1);
                    break;
                case R.id.navigation_cart:viewPager.setCurrentItem(2);
                    break;
                case R.id.navigation_profile:viewPager.setCurrentItem(3);
                    break;
            }
            return true;
        });
    }
}