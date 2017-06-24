package com.parent.school.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.myapp.myapp.R;

/**
 * Created by Aarohi on 6/17/2017.
 */

public class PrimaryTaskFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frg_primarytask,container, false);
        return view;
    }

}
