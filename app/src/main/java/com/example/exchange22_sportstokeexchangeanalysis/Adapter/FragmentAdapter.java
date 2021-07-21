package com.example.exchange22_sportstokeexchangeanalysis.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.exchange22_sportstokeexchangeanalysis.Fragment.Guide_Fragment;
import com.example.exchange22_sportstokeexchangeanalysis.Fragment.Matches_Fragment;

public class FragmentAdapter extends FragmentStatePagerAdapter {

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Guide_Fragment tab1 = new Guide_Fragment();
                return tab1;
            case 1:
                Matches_Fragment tab2 = new Matches_Fragment();
                return tab2;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}