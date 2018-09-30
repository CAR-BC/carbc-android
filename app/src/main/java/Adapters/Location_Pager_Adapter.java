package Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import Fragments.Service_repair_location;
import Fragments.Service_repair_map;

public class Location_Pager_Adapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public Location_Pager_Adapter(FragmentManager fm, int mNumOfTabs) {
        super(fm);
        this.mNumOfTabs = mNumOfTabs;
        ;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Service_repair_location tab1 = new Service_repair_location();
                return tab1;
            case 1:
                Service_repair_map tab2 = new Service_repair_map();
                return tab2;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
