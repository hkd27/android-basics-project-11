package com.hemantdave.tourguideapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {

    ViewPager viewPager=null;
     Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mContext = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.pager);
        FragmentManager fmManager=getSupportFragmentManager();
        viewPager.setAdapter(new CustomFragmentAdapter(fmManager,mContext));
    }
}
