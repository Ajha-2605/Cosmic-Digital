package com.example.anubh.cosmic;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ScrollingView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class limitless_fragment extends Fragment {
    TextView textView5,textView6,textView7;
    


    public limitless_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_limitless_fragment, container, false);


        textView5 = (TextView) rootView.findViewById(R.id.textView5);
        textView6 = (TextView) rootView.findViewById(R.id.textView6);
        textView7 = (TextView) rootView.findViewById(R.id.textView7);

        String[] myArray = getResources().getStringArray(R.array.TextView7);
        String textout ="";

        for(int i=0; i< myArray.length;i++){
            textout += myArray[i]+"\n";
        }
        textView7.setText(textout);
        return rootView;
    }

}
