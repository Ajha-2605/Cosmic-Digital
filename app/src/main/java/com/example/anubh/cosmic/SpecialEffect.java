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
public class SpecialEffect extends Fragment {
    VideoView videoView3;
    TextView textView16;
    ImageView imageView8;


    public SpecialEffect() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_special_effect, container, false);
        textView16 = (TextView) rootView.findViewById(R.id.textView16);
        imageView8 = (ImageView) rootView.findViewById(R.id.imageView8);

        MediaController mc= new MediaController(getActivity());

        videoView3 = (VideoView)rootView.findViewById(R.id.videoView3);
        String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.thunder_music_0;
        videoView3.setVideoURI(Uri.parse(path));
        videoView3.setMediaController(mc);
        videoView3.start();
        videoView3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });
        return rootView;
    }

}
