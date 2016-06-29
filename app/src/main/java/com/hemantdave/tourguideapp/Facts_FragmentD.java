package com.hemantdave.tourguideapp;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class Facts_FragmentD extends Fragment {
    ListView factsListView;
    Context context;

    public Facts_FragmentD() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_facts__fragment_d, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        context = getActivity();
        factsListView = (ListView) getView().findViewById(R.id.FactsLV);
        factsListView.setAdapter(new ListViewCustomAdapterForFragmentD(context));
    }
}
