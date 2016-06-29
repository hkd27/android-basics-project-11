package com.hemantdave.tourguideapp;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by INDIA on 6/29/2016.
 */
public class ListViewCustomAdapterForFragmentD extends BaseAdapter {
    ArrayList<FactsPOJO> FactsList;
    Context context;

    public ListViewCustomAdapterForFragmentD(Context context) {
        this.context = context;
        FactsList = new ArrayList<FactsPOJO>();
        Resources res = this.context.getResources();
        String[] titles = res.getStringArray(R.array.factsTitle);
        String[] description = res.getStringArray(R.array.factsDesc);
        for (int i = 0; i < titles.length; i++) {
            FactsList.add(new FactsPOJO(titles[i], description[i]));
        }
    }

    @Override
    public int getCount() {
        return FactsList.size();
    }

    @Override
    public Object getItem(int position) {
        return FactsList.get(position);
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
            row = inflater.inflate(R.layout.facts_custom_row, parent, false);
        }
        TextView FactsTitle = (TextView) row.findViewById(R.id.factsTitleTV);
        TextView FactsDesc = (TextView) row.findViewById(R.id.factsDetailsTV);
        FactsPOJO temp_obj = FactsList.get(position);
        FactsTitle.setText(temp_obj.getTitle());
        FactsDesc.setText(temp_obj.getDescription());


        return row;

    }
}
