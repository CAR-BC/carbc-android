package Adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import Fragments.My_history_info;
import Fragments.My_history_reminders;
import Fragments.My_history_status;

public class My_History_Pager_Adapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public My_History_Pager_Adapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                My_history_status tab1 = new My_history_status();
                return tab1;
            case 1:
                My_history_reminders tab2 = new My_history_reminders();
                return tab2;
            case 2:
                My_history_info tab3 = new My_history_info();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
