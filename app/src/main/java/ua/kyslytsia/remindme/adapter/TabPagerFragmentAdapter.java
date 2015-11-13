package ua.kyslytsia.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ua.kyslytsia.remindme.fragment.ExampleFragment;

public class TabPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[] {
                "Tab 1",
                "Напоминания",
                "Tab 2"};
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return ExampleFragment.getInstance();
            case 1: return ExampleFragment.getInstance();
            case 2: return ExampleFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}