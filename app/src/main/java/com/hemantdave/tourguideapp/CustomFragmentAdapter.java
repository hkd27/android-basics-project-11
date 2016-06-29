package com.hemantdave.tourguideapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by INDIA on 6/26/2016.
 */
public class CustomFragmentAdapter extends FragmentPagerAdapter {
    Context context;

    public CustomFragmentAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        context = mContext;

    }


    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        Bundle args = new Bundle();
        if (position == 0) {
            fragment = new VisualAttraction_FragmentA();


        } else if (position == 1) {
            fragment = new FoddieAttractions_FragmentB();
        } else if (position == 2) {
            fragment = new Restaurants_FragmentC();
        } else if (position == 3) {
            fragment = new Facts_FragmentD();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = new String();
        if (position == 0) {
            title = "Visual Attractions";
        } else if (position == 1) {
            title = "Foodie delight";
        } else if (position == 2) {
            title = "Restaurants Best in Town";
        } else if (position == 3) {
            title = "Facts About City of Lakes";
        }
        return title;
    }
}
