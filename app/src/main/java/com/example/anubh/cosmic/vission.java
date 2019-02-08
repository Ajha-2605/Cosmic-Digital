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
public class vission extends Fragment {
    TextView textView61;


    public vission() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_vission, container, false);
        textView61 = (TextView) rootView.findViewById(R.id.textView61);
        String[] myArray = getResources().getStringArray(R.array.TextView61);
        String textout ="";

        for(int i=0; i< myArray.length;i++){
            textout += myArray[i]+"\n";
        }
        textView61.setText(textout);
        return rootView;
    }

}
