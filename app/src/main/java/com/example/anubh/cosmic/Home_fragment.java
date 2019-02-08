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
public class Home_fragment extends Fragment {

    ViewPager Pager;

    public Home_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_home_fragment, container, false);
        Pager = (ViewPager) rootview.findViewById(R.id.pager);
        FragmentManager fragmentManager= getFragmentManager();
        Pager.setAdapter(new MyAdapter(fragmentManager));

        return rootview;




    }




}

class MyAdapter extends FragmentPagerAdapter {


    public MyAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        Fragment fragment = new Fragment();
        if (fragment != null) {
            if (i == 0) {
                fragment = new limitless_fragment();

            }
            if (i == 1) {
                fragment = new virtualreality();
            }
            if (i == 2) {
                fragment = new Effect();
            }
            if (i == 3) {
                fragment = new Magic();
            }
            if (i == 4) {
                fragment = new SpecialEffect();
            }
            if (i == 5) {
                fragment = new visual();
            }
            if (i==6){
                fragment = new sensory();
            }
            if (i==7){
                fragment = new recording();
            }
        }
        return fragment;
    }



    @Override
    public int getCount() {
        return 8;
    }}






