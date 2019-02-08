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
public class Effect extends Fragment {
    TextView textView10,textView11,textView12,textView13,textView14;
    ImageView imageView4,imageView5,imageView6,imageView7,imageView9;


    public Effect() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_effect, container, false);

        textView10 = (TextView) rootView.findViewById(R.id.textView10);
        textView11 = (TextView) rootView.findViewById(R.id.textView11);
        textView12 = (TextView) rootView.findViewById(R.id.textView12);
        textView13 = (TextView) rootView.findViewById(R.id.textView13);
        textView14 = (TextView) rootView.findViewById(R.id.textView14);

        imageView4 = (ImageView) rootView.findViewById(R.id.imageView4);
        imageView5 = (ImageView) rootView.findViewById(R.id.imageView5);
        imageView6 = (ImageView) rootView.findViewById(R.id.imageView6);
        imageView7 = (ImageView) rootView.findViewById(R.id.imageView7);
        imageView9 = (ImageView) rootView.findViewById(R.id.imageView9);

        return rootView;
    }

}
