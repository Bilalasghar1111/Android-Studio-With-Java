package com.example.tablayout;//package com.example.tablayout;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.viewpager.widget.ViewPager;
//
//import android.os.Bundle;
//import android.widget.TableLayout;
//
//public class MainActivity extends AppCompatActivity {
//TableLayout tab;
//ViewPager pager;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        tab = findViewById(R.id.tab);
//        pager = findViewById(R.id.pager);
//
//        ViewPagerMessengerAdapter adapter = new ViewPagerMessengerAdapter(getSupportFragmentManager());
//        pager.setAdapter(adapter);
//
//        tab.setupWithViewPager(pager);
//    }
//}

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.example.tablayout.ViewPagerMessengerAdapter;

public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    ViewPager pager;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab = findViewById(R.id.tab);
        pager = findViewById(R.id.pager);

        ViewPagerMessengerAdapter adapter = new ViewPagerMessengerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);

        tab.setupWithViewPager(pager);
    }
}
