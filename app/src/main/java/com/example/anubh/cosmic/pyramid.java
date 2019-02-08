package com.example.anubh.cosmic;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class pyramid extends Fragment {
    TextView textView23,textView24;
    ImageButton imageButton4,imageButton5,imageButton6,imageButton7;


    public pyramid() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_pyramid, container, false);

        textView23 = (TextView) rootView.findViewById(R.id.textView23);
        textView24 = (TextView) rootView.findViewById(R.id.textView24);
        String[] myArray = getResources().getStringArray(R.array.TextView24);
        String textout ="";

        for(int i=0; i< myArray.length;i++){
            textout += myArray[i]+"\n";
        }
        textView24.setText(textout);

        imageButton4 = (ImageButton) rootView.findViewById(R.id.imageButton4);
        imageButton5 = (ImageButton) rootView.findViewById(R.id.imageButton5);
        imageButton6 = (ImageButton) rootView.findViewById(R.id.imageButton6);
        imageButton7 = (ImageButton) rootView.findViewById(R.id.imageButton7);

        return rootView;
    }

}
