package com.example.checklist.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.checklist.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TesteDetalhadoFragment extends Fragment {

    public TesteDetalhadoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_teste_detalhado, container, false);
    }
}
