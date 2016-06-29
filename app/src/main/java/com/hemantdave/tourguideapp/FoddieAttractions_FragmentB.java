package com.hemantdave.tourguideapp;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FoddieAttractions_FragmentB extends Fragment {
    ListView foodieListView;
    Context context;

    public FoddieAttractions_FragmentB() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_b, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        context = getActivity();
        foodieListView = (ListView) getView().findViewById(R.id.foodieLV);
        foodieListView.setAdapter(new ListViewCustomAdapterForFragmentB(context));
    }
}
