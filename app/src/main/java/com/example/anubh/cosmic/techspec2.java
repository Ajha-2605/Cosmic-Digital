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
public class techspec2 extends Fragment {
    TextView textView27,textView28;


    public techspec2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_techspec2, container, false);
        textView27 = (TextView) rootView.findViewById(R.id.textView27);
        textView28 = (TextView) rootView.findViewById(R.id.textView28);

        String[] myArray = getResources().getStringArray(R.array.TextView27);
        String textout ="";

        for(int i=0; i< myArray.length;i++){
            textout += myArray[i]+"\n";
        }
        textView27.setText(textout);

        String[] myArray1 = getResources().getStringArray(R.array.TextView28);
        String textout1 ="";

        for(int i=0; i< myArray1.length;i++){
            textout1 += myArray1[i]+"\n";
        }
        textView28.setText(textout1);
        return rootView;
    }

}
