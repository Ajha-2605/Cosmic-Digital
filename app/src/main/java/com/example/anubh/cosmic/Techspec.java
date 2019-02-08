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
public class Techspec extends Fragment {
    TextView textView21,textView22;


    public Techspec() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_techspec, container, false);

        textView21 = (TextView) rootView.findViewById(R.id.textView21);
        textView22 = (TextView) rootView.findViewById(R.id.textView22);
        String[] myArray = getResources().getStringArray(R.array.TextView22);
        String textout ="";

        for(int i=0; i< myArray.length;i++){
            textout += myArray[i]+"\n";
        }
        textView22.setText(textout);

        return rootView;

    }

}
