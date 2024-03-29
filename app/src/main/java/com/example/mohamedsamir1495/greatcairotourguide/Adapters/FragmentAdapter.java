package com.example.mohamedsamir1495.greatcairotourguide.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.mohamedsamir1495.greatcairotourguide.Fragments.FoodFragment;
import com.example.mohamedsamir1495.greatcairotourguide.Fragments.InfoFragment;
import com.example.mohamedsamir1495.greatcairotourguide.Fragments.ShopsFragment;
import com.example.mohamedsamir1495.greatcairotourguide.Fragments.SightsFragment;
import com.example.mohamedsamir1495.greatcairotourguide.R;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightsFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2){
            return new ShopsFragment();
        } else {
            return new InfoFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_sights);
        } else if (position == 1) {
            return context.getString(R.string.category_food);
        } else if (position == 2) {
            return context.getString(R.string.category_shops);
        } else {
            return context.getString(R.string.category_info);
        }
    }
}
