package com.example.anubh.cosmic;


import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InteractiveFloors extends Fragment {
    TextView textView19, textView20;
    ImageButton imageButton,imageButton2,imageButton3;
    ScrollView scrollView;


    public InteractiveFloors() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_interactive_floors, container, false);
        textView19 = (TextView) rootView.findViewById(R.id.textView19);
        textView20 = (TextView) rootView.findViewById(R.id.textView20);

        String[] myArray = getResources().getStringArray(R.array.TextView20);
        String textout ="";

        for(int i=0; i< myArray.length;i++){
            textout += myArray[i]+"\n";
        }
        textView20.setText(textout);
        scrollView = (ScrollView) rootView.findViewById(R.id.scrollView);
        imageButton = (ImageButton) rootView.findViewById(R.id.imageButton);
        imageButton2 = (ImageButton) rootView.findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton) rootView.findViewById(R.id.imageButton3);
        return rootView;
    }

}
