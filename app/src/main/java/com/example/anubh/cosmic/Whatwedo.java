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
public class Whatwedo extends Fragment {

    ViewPager pager;

    public Whatwedo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_whatwedo, container, false);
        pager = (ViewPager) rootview.findViewById(R.id.pager);
        FragmentManager fragmentManager= getFragmentManager();
        pager.setAdapter(new MyAdapter1(fragmentManager));

        return rootview;


    }


}

class MyAdapter1 extends FragmentPagerAdapter {


    public MyAdapter1(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        Fragment fragment = new Fragment();
        if (fragment != null) {
            if (i == 0) {
                fragment = new InteractiveFloors();
            }
            if (i==1){
                fragment = new Techspec();
            }
            if (i==2){
                fragment = new pyramid();
            }
            if (i==3){
                fragment = new techspec2();
            }
            if (i==4){
                fragment = new techspec3();
            }
            if (i==5){
                fragment = new gallery();
            }
            if (i==6){
                fragment = new recording();
            }
            if (i==7){
                fragment = new cinema_fragment();
            }
            if (i==8){
                fragment = new techspec4();
            }
            if (i==9){
                fragment = new gallery2();
            }
            if (i==10){
                fragment = new theater();
            }
            if (i==11){
                fragment = new techspec5();
            }
            if (i==12){
                fragment = new tunnel();
            }
            if (i==13){
                fragment = new oculus();
            }
            if (i==14){
                fragment = new freefaall();
            }
            if (i==15){
                fragment = new interactive_table();
            }
            if (i==16){
                fragment = new mirror();
            }
            if (i==17){
                fragment = new simulator();
            }
            if (i==18){
                fragment = new interactivedispenser();
            }
            if (i==19){
                fragment = new video_projection();
            }
            }
        return fragment;
    }



    @Override
    public int getCount() {  return 20;
    }}




