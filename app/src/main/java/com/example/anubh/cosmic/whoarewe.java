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
public class whoarewe extends Fragment {
    TextView textView59;


    public whoarewe() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_whoarewe, container, false);
        textView59 = (TextView) rootView.findViewById(R.id.textView59);
        String[] myArray = getResources().getStringArray(R.array.TextView59);
        String textout ="";

        for(int i=0; i< myArray.length;i++){
            textout += myArray[i]+"\n";
        }
        textView59.setText(textout);
        return rootView;
    }

}
