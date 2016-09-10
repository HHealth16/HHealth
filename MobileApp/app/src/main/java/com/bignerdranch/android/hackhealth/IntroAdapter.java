package com.bignerdranch.android.hackhealth;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by edmundliang on 9/10/16.
 */

public class IntroAdapter extends FragmentPagerAdapter {


    public IntroAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0: return new IntroFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 1;
    }
}


