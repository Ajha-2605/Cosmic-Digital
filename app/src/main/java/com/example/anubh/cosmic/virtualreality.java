package com.example.anubh.cosmic;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class virtualreality extends Fragment {
    TextView textView8,textView9;
    ImageView imageView2;


    public virtualreality() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_virtualreality, container, false);

        imageView2 = (ImageView) rootView.findViewById(R.id.imageView2);

        textView8 = (TextView)rootView.findViewById(R.id.textView8);
        textView9 = (TextView)rootView.findViewById(R.id.textView9);

        String[] myArray = getResources().getStringArray(R.array.TextView9);
        String textout ="";

        for(int i=0; i< myArray.length;i++){
            textout += myArray[i]+"\n";
        }
        textView9.setText(textout);

        return rootView;
    }

}
