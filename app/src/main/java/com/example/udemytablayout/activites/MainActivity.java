package com.example.udemytablayout.activites;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.example.udemytablayout.R;
import com.example.udemytablayout.adapters.ViewPagerAdapter;
import com.example.udemytablayout.fragments.FavoritesFragment;
import com.example.udemytablayout.fragments.NearbyFragment;
import com.example.udemytablayout.fragments.RecentsFragment;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewpager_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new RecentsFragment(),"Recents");
        adapter.addFragment(new FavoritesFragment(),"Favorites");
        adapter.addFragment(new NearbyFragment(),"Nearby");

//        adapter.addFragment(new OneFragment(),"Item One");
//        adapter.addFragment(new TwoFragment(),"Item Two");
//        adapter.addFragment(new ThreeFragment(),"Item Three");
//        adapter.addFragment(new FourFragment(),"Item Four");
//        adapter.addFragment(new FiveFragment(),"Item Five");
//        adapter.addFragment(new SixFragment(),"Item Six");
//        adapter.addFragment(new SevenFragment(),"Item Seven");
//        adapter.addFragment(new EigthFragment(),"Item Eigth");
//        adapter.addFragment(new NineFragment(),"Item Nine");
//        adapter.addFragment(new TenFragment(),"Item Ten");

        viewPager.setAdapter(adapter);

        tabLayout = findViewById(R.id.tablayout_id);

        tabLayout.setupWithViewPager(viewPager);


        tabLayout.getTabAt(0).setIcon(R.drawable.ic_phone);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_heart);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_account);


    }//The last method onCreate
}//The last class MainActivity
