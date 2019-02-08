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
public class whyus extends Fragment {
   ViewPager pager;

    public whyus() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_whyus, container, false);
        pager = (ViewPager) rootview.findViewById(R.id.pager);
        FragmentManager fragmentManager= getFragmentManager();
        pager.setAdapter(new MyAdapter3(fragmentManager));

        return rootview;


    }


}

class MyAdapter3 extends FragmentPagerAdapter {


    public MyAdapter3(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        Fragment fragment = new Fragment();
        if (fragment != null) {
            if (i == 0) {
                fragment = new technology();
            }
            if (i==1){
                fragment = new ourapproach();
            }


        }
        return fragment;
    }



    @Override
    public int getCount() {  return 2;
    }}
