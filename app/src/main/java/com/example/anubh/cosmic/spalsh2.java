package com.example.anubh.cosmic;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;



public class spalsh2 extends AppCompatActivity implements View.OnClickListener{
    ImageButton facebook,twitter,youtube,linkedin;
    ImageView logo;
    private static int SPLASH_TIMEOUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(spalsh2.this,MainActivity.class);
                startActivity(home);
                finish();
            }
        },SPLASH_TIMEOUT);

        facebook = (ImageButton) findViewById(R.id.facebook);
        twitter = (ImageButton) findViewById(R.id.twitter);
        linkedin = (ImageButton) findViewById(R.id.linkedin);
        youtube = (ImageButton) findViewById(R.id.youtube);
        logo = (ImageView) findViewById(R.id.logo);


        facebook.setOnClickListener(this);
        twitter.setOnClickListener(this);
        youtube.setOnClickListener(this);
        linkedin.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.facebook:
                Intent facebookIntent = openFacebook(spalsh2.this);
                startActivity(facebookIntent);
                break;
            case R.id.twitter:
                Intent twitterIntent = openTwitter(spalsh2.this);
                startActivity(twitterIntent);
                break;
            case R.id.linkedin:
                Intent linkedinIntent = openLinkedin(spalsh2.this);
                startActivity(linkedinIntent);
                break;
            case R.id.youtube:
                Intent youtubeIntent = openYoutube(spalsh2.this);
                startActivity(youtubeIntent);
                break;


        }
    }

    public static Intent openFacebook(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/cosmicdigi"));
        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/cosmicdigi"));
        }


    }

    public static Intent openTwitter(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.twitter.android", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse(""));
        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse(""));


        }
    }

    public static Intent openLinkedin(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.linkedin.android", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse(""));
        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse(""));
        }
    }

    public static Intent openYoutube(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.google.youtube", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/channel/UCfm1fizlu-VZlPfSiMnIFqw"));
        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/channel/UCfm1fizlu-VZlPfSiMnIFqw"));
        }
    }


}
