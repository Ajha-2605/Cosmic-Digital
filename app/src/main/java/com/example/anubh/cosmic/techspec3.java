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
public class techspec3 extends Fragment {
    TextView textView30,textView32;


    public techspec3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_techspec3, container, false);

        textView30 = (TextView) rootView.findViewById(R.id.textView30);
        textView32 = (TextView) rootView.findViewById(R.id.textView32);

        String[] myArray = getResources().getStringArray(R.array.TextView30);
        String textout ="";

        for(int i=0; i< myArray.length;i++){
            textout += myArray[i]+"\n";
        }
        textView30.setText(textout);

        String[] myArray1 = getResources().getStringArray(R.array.TextView32);
        String textout1 ="";

        for(int i=0; i< myArray1.length;i++){
            textout1 += myArray1[i]+"\n";
        }
        textView32.setText(textout1);
        return rootView;
    }

}
