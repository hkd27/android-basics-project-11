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

/**
 * Created by INDIA on 6/29/2016.
 */
public class ListViewCustomAdapterForFragmentC extends BaseAdapter {
    ArrayList<RestaurantsPOJO> restaurantsList;
    Context context;

    public ListViewCustomAdapterForFragmentC(Context context) {
        this.context = context;
        restaurantsList = new ArrayList<RestaurantsPOJO>();
        Resources res = this.context.getResources();
        String[] Name = res.getStringArray(R.array.restaurantName);
        String[] location = res.getStringArray(R.array.restaurantLocation);
        String[] timings=res.getStringArray(R.array.restaurantTimings);
        int[] images = {R.drawable.restaurants_1, R.drawable.restaurants_2, R.drawable.restaurants_3, R.drawable.restaurants_4, R.drawable.restaurants_5};
        for (int i = 0; i < images.length; i++) {
            restaurantsList.add(new RestaurantsPOJO(Name[i], location[i],timings[i], images[i]));
        }

    }

    @Override
    public int getCount() {
        return restaurantsList.size();
    }

    @Override
    public Object getItem(int position) {
        return restaurantsList.get(position);
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
            row = inflater.inflate(R.layout.restaurants_custom_row, parent, false);
        }
        TextView name = (TextView) row.findViewById(R.id.resturantsNameTV);
        TextView location = (TextView) row.findViewById(R.id.resturantsLocTV);
        TextView timing= (TextView) row.findViewById(R.id.resturantsLocTV);
        ImageView images = (ImageView) row.findViewById(R.id.resturantsIV);

        RestaurantsPOJO temp_obj = restaurantsList.get(position);
        name.setText(temp_obj.getName());
        location.setText(temp_obj.getLocation());
        images.setImageResource(temp_obj.getImages());
        timing.setText(temp_obj.getTimings());

        return row;
    }
}
