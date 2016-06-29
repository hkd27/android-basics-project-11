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
public class VisualAttraction_FragmentA extends Fragment {

    ListView VisualListView;
    Context context;

    public VisualAttraction_FragmentA() {


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_fragment_a, container, false);
    }

    @Override
    public void onResume() {
        context = getActivity();
        VisualListView = (ListView) getView().findViewById(R.id.visualLV);
        VisualListView.setAdapter(new ListViewCustomAdapterForFragmentA(context));
        super.onResume();
    }
}
