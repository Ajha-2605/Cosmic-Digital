package com.example.anubh.cosmic;


import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;


/**
 * A simple {@link Fragment} subclass.
 */
public class sensory extends Fragment {
    VideoView videoView5;
    TextView textView18;
    ImageView imageView11;


    public sensory() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_sensory, container, false);
        MediaController mc= new MediaController(getActivity());

        textView18 = (TextView) rootView.findViewById(R.id.textView18);
        imageView11 = (ImageView) rootView.findViewById(R.id.imageView11);

        videoView5 = (VideoView)rootView.findViewById(R.id.videoView5);
        String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.sound;
        videoView5.setVideoURI(Uri.parse(path));
        videoView5.setMediaController(mc);
        videoView5.start();
        videoView5.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });
        return rootView;
    }

}
