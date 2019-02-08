package com.example.anubh.cosmic;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class careers extends Fragment {
WebView webView;

    public careers() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_careers, container, false);
        webView = (WebView) rootView.findViewById(R.id.webview);
        String url = "http://www.cosmicdigi.com/careers";
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);


        return rootView;

    }


}
