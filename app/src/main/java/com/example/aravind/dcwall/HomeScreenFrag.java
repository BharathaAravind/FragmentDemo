package com.example.aravind.dcwall;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeScreenFrag.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HomeScreenFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeScreenFrag extends Fragment {
    public HomeScreenFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_screen, container, false);
    }


}
