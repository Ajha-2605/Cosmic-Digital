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
public class visual extends Fragment {
    VideoView videoView4;
    TextView textView17;
    ImageView imageView10;


    public visual() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_visual, container, false);
        MediaController mc= new MediaController(getActivity());
        textView17 = (TextView) rootView.findViewById(R.id.textView17);
        imageView10 = (ImageView) rootView.findViewById(R.id.imageView10);

        videoView4 = (VideoView)rootView.findViewById(R.id.videoView4);
        String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.galaxy;
        videoView4.setVideoURI(Uri.parse(path));
        videoView4.setMediaController(mc);
        videoView4.start();
        videoView4.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });
        return rootView;
    }

}
