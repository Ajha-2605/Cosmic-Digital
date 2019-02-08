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
public class Magic extends Fragment {
    VideoView videoView2;
    TextView textView15;
    ImageView imageView3;


    public Magic() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_magic, container, false);
        MediaController mc= new MediaController(getActivity());

        textView15 = (TextView) rootView.findViewById(R.id.textView15);
        imageView3 = (ImageView) rootView.findViewById(R.id.imageView3);

        videoView2 = (VideoView)rootView.findViewById(R.id.videoView2);
        String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.magicvideo_2;
        videoView2.setVideoURI(Uri.parse(path));
        videoView2.setMediaController(mc);
        videoView2.start();
        videoView2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });

        return rootView;
    }

}
