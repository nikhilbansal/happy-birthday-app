package com.newlinecharacter.www.app.adaptor;

/**
 * Created by nikhil.bansal on 23/04/14.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.newlinecharacter.www.app.tabs.GamesFragment;
import com.newlinecharacter.www.app.tabs.TopRatedFragment;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new GamesFragment();
            case 1:
                // Games fragment activity
                return new TopRatedFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 2;
    }

}
