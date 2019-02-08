package com.example.anubh.cosmic;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class techspec5 extends Fragment {
    TextView textView40;


    public techspec5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_techspec5, container, false);
        textView40 = (TextView) rootView.findViewById(R.id.textView40);
        String[] myArray = getResources().getStringArray(R.array.TextView40);
        String textout ="";

        for(int i=0; i< myArray.length;i++){
            textout += myArray[i]+"\n";
        }
        textView40.setText(textout);
        return rootView;
    }

}
