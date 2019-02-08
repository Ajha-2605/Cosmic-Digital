package com.example.anubh.cosmic;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class whoweare extends Fragment {
    ViewPager pager;


    public whoweare(){
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_whoweare, container, false);
        pager = (ViewPager) rootview.findViewById(R.id.pager);
        FragmentManager fragmentManager= getFragmentManager();
        pager.setAdapter(new MyAdapter2(fragmentManager));

        return rootview;


    }


}

class MyAdapter2 extends FragmentPagerAdapter {


    public MyAdapter2(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        Fragment fragment = new Fragment();
        if (fragment != null) {
            if (i == 0) {
                fragment = new whoarewe();
            }
            if (i==1){
                fragment = new vission();
            }
            if (i==2){
                fragment = new mission();
            }
            if (i==3){
                fragment = new corevalue();
            }
            if (i==4){
                fragment = new meetteam1();
            }
            if (i==5){
                fragment = new meetteam2();
            }
            if (i==6){
                fragment = new meetteam3();
            }

        }
        return fragment;
    }



    @Override
    public int getCount() {  return 7;
    }}



