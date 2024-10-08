package com.st10079970.prixfinance;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.st10079970.prixfinance.FragementActivities.LoginTabFragment;
import com.st10079970.prixfinance.FragementActivities.RegisterTabFragment;

public class LoginAdapter extends FragmentStatePagerAdapter {

    private Context context;
    int totalTabs;

    public LoginAdapter(FragmentManager fm, Context context, int totalTabs) {
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    public Fragment getItem(int position){
        switch (position){
            case 0:
                LoginTabFragment loginTabFragment = new LoginTabFragment();
                return loginTabFragment;
            case 1:
                RegisterTabFragment registerTabFragment = new RegisterTabFragment();
                return  registerTabFragment;
            default:
                return null;
        }
    }
}
