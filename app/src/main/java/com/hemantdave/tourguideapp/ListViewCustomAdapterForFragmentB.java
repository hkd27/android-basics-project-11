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
public class ListViewCustomAdapterForFragmentB extends BaseAdapter {
    ArrayList<FoodiePOJO> fooddieList;
    Context context;
    public ListViewCustomAdapterForFragmentB(Context context) {
        this.context = context;
        fooddieList = new ArrayList<FoodiePOJO>();
        Resources res = this.context.getResources();
        String[] titles = res.getStringArray(R.array.foodieTitle);
        String[] description = res.getStringArray(R.array.foodieDesc);
        String[] phoneNumber=res.getStringArray(R.array.foodiePhoneNo);
        int[] images = {R.drawable.food_1, R.drawable.food_2, R.drawable.food_3, R.drawable.food_4, R.drawable.food_5};
        for (int i = 0; i < images.length; i++) {
            fooddieList.add(new FoodiePOJO(titles[i], description[i],phoneNumber[i], images[i]));
        }
    }

    @Override
    public int getCount() {
        return fooddieList.size();
    }

    @Override
    public Object getItem(int position) {
        return fooddieList.get(position);
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
            row = inflater.inflate(R.layout.foodie_custom_row, parent, false);
        }
        TextView foodieTitle = (TextView) row.findViewById(R.id.foodieTitleTV);
        TextView desc = (TextView) row.findViewById(R.id.foodiedesTV);
        TextView phoneNumber= (TextView) row.findViewById(R.id.foodiePhoneTV);
        ImageView location_food = (ImageView) row.findViewById(R.id.foodieIV);

        FoodiePOJO temp_obj = fooddieList.get(position);
        foodieTitle.setText(temp_obj.getTitles());
        desc.setText(temp_obj.getDescription());
        location_food.setImageResource(temp_obj.getImages());
        phoneNumber.setText(temp_obj.getPhoneNumber());

        return row;
    }
}
