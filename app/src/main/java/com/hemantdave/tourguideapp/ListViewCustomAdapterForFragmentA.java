package com.hemantdave.tourguideapp;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ListViewCustomAdapterForFragmentA extends BaseAdapter {
    ArrayList<LocationsPOJO> locationPojo;
    Context context;

    public ListViewCustomAdapterForFragmentA(Context context) {
        this.context = context;
        locationPojo = new ArrayList<LocationsPOJO>();
        Resources res = this.context.getResources();
        String[] titles = res.getStringArray(R.array.Titles);
        String[] description = res.getStringArray(R.array.Details);
        int[] images = {R.drawable.udz_1, R.drawable.udz_2, R.drawable.udz_3, R.drawable.udz_4, R.drawable.udz_5};
        for (int i = 0; i < images.length; i++) {
            locationPojo.add(new LocationsPOJO(titles[i], description[i], images[i]));
        }
    }

    @Override
    public int getCount() {
        return locationPojo.size();

    }

    @Override
    public Object getItem(int position) {
        return locationPojo.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.visuals_custom_rowl, parent, false);
        }
        TextView locationTitle = (TextView) row.findViewById(R.id.locationTitle);
        TextView desc = (TextView) row.findViewById(R.id.locationDesc);
        ImageView location_food = (ImageView) row.findViewById(R.id.locationImage);
        LocationsPOJO temp_obj = locationPojo.get(position);
        locationTitle.setText(temp_obj.getTitles());
        desc.setText(temp_obj.getDescription());
        location_food.setImageResource(temp_obj.getImages());

        return row;
    }
}
