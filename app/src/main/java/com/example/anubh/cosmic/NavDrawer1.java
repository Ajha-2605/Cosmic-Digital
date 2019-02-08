package com.example.anubh.cosmic;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class NavDrawer1 extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    TextView textView2,textView3,textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_drawer1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle("About");

        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);

        String[] myArray = getResources().getStringArray(R.array.TextView3);
        String textout ="";

        for(int i=0; i< myArray.length;i++){
            textout += myArray[i]+"\n";
        }
        textView3.setText(textout);

        String[] myArray1 = getResources().getStringArray(R.array.TextView4);
        String textout1 ="";

        for(int i=0; i< myArray1.length;i++){
            textout1 += myArray1[i]+"\n";
        }
        textView4.setText(textout1);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
        setTitle("About");}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav_drawer1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_facebook) {
            Intent facebookIntent = openFacebook(NavDrawer1.this);
            startActivity(facebookIntent);
            return true;
        }
        if (id == R.id.action_twitter) {
            Intent twitterIntent = openTwitter(NavDrawer1.this);
            startActivity(twitterIntent);
            return true;
        }
        if (id == R.id.action_linkedin) {
            Intent linkedinIntent = openLinkedin(NavDrawer1.this);
            startActivity(linkedinIntent);
            return true;
        }
        if (id == R.id.action_youtube) {
            Intent youtubeIntent = openYoutube(NavDrawer1.this);
            startActivity(youtubeIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);

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


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id){
            case R.id.nav_home:
                Toast.makeText(getApplicationContext(),"Home",Toast.LENGTH_SHORT).show();
                Home_fragment fragment = new Home_fragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).addToBackStack("home").commit();
                setTitle("Home");
                break;


            case R.id.nav_whatwedo:
                Toast.makeText(getApplicationContext(),"What We do",Toast.LENGTH_SHORT).show();
                Whatwedo fragment1 = new Whatwedo();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment1).addToBackStack("whatwedo").commit();
                setTitle("What We Do");

                break;

            case R.id.nav_whoarewe:
                Toast.makeText(getApplicationContext(), "Who Are We", Toast.LENGTH_SHORT).show();
                whoweare fragment2 = new whoweare();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment2).addToBackStack("whoarewe").commit();
                setTitle("Who We Are");
                break;

            case R.id.nav_whyus:
                Toast.makeText(getApplicationContext(),"Why Us",Toast.LENGTH_SHORT).show();
                whyus fragment3 = new whyus();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment3).addToBackStack("whyus").commit();
                setTitle("Why Us");
                break;

            case  R.id.nav_careers:
                Toast.makeText(getApplicationContext(),"Careers",Toast.LENGTH_SHORT).show();
                careers fragment4 = new careers();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment4).addToBackStack("careers").commit();
                setTitle("Careers");
                break;

            case R.id.nav_ContactUs:
                Toast.makeText(getApplicationContext(),"Contact Us",Toast.LENGTH_SHORT).show();
                contactus fragment5 = new contactus();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment5).addToBackStack("contactus").commit();
                setTitle("Contact Us");
                break;

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
