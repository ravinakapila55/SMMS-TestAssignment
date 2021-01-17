package com.smms_testassignment.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.smms_testassignment.fragment.RequisitionFragment;

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new RequisitionFragment();
            case 1:
                return new RequisitionFragment();
            case 2:
                return new RequisitionFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Requisitions";
            case 1:
                return "Quotation";
            case 2:
                return "Purchase Order";
            default:return null;
        }
    }
}

