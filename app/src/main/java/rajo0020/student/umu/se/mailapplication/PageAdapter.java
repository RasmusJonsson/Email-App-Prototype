package rajo0020.student.umu.se.mailapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Dator on 2017-07-17.
 */

public class PageAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TabFragmentPrimary tabPrimary = new TabFragmentPrimary();
                return tabPrimary;
            case 1:
                TabFragmentSocial tabSocial = new TabFragmentSocial();
                return tabSocial;
            case 2:
                TabFragmentPromotions tabPromotions = new TabFragmentPromotions();
                return tabPromotions;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
