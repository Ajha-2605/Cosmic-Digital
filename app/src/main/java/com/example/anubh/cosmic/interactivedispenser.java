package com.example.anubh.cosmic;


import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;


/**
 * A simple {@link Fragment} subclass.
 */
public class interactivedispenser extends Fragment {
    TextView textView55;
    VideoView videoView6;

    public interactivedispenser() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_interactivedispenser, container, false);
        MediaController mc= new MediaController(getActivity());
        textView55 = (TextView) rootView.findViewById(R.id.textView55);
        String[] myArray = getResources().getStringArray(R.array.TextView55);
        String textout ="";

        for(int i=0; i< myArray.length;i++){
            textout += myArray[i]+"\n";
        }
        textView55.setText(textout);

        videoView6 = (VideoView) rootView.findViewById(R.id.videoView6);
        String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.interactivedispenser;
        videoView6.setVideoURI(Uri.parse(path));
        videoView6.setMediaController(mc);
        videoView6.start();
        videoView6.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });
        return rootView;
    }

}
