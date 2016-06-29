package com.hemantdave.tourguideapp;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;



public class Restaurants_FragmentC extends Fragment {
    ListView resturantsListView;
    Context context;

    public Restaurants_FragmentC() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__fragment_c, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        context = getActivity();
        resturantsListView = (ListView) getView().findViewById(R.id.resturantsLV);
        resturantsListView.setAdapter(new ListViewCustomAdapterForFragmentC(context));
    }
}
