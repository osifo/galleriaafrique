package com.galleriafrique.controller.activity.base;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.galleriafrique.controller.fragment.base.BaseFragment;
import com.galleriafrique.controller.interfaces.FragmentSwitcherInterfce;

/**
 * Created by osifo on 8/23/15.
 */
public class FragmentSwitcher implements FragmentSwitcherInterfce {

    private AppCompatActivity activity;
    private FragmentManager fragmentManager;

    public FragmentSwitcher(AppCompatActivity activity, FragmentManager fragmentManager) {
        this.activity = activity;
        this.fragmentManager = fragmentManager;
    }

    private void replaceFragment(BaseFragment fragment, boolean withAnimation, int container) {
        FragmentTransaction ft = activity.getSupportFragmentManager().beginTransaction();

        if (withAnimation) {
            ft.setCustomAnimations(R.anim.slide_in_from_right, R.anim.slide_out_to_left, R.anim.slide_in_from_left, R.anim.slide_out_to_right);
        }

        ft.replace(container, fragment, fragment.getTagText());
        ft.commit();
    }

    private void addFragment(BaseFragment fragment, boolean withAnimation, int container) {

        if (fragmentManager.findFragmentByTag(fragment.getTagText()) == null) {

            FragmentTransaction ft = activity.getSupportFragmentManager().beginTransaction();

            if (withAnimation) {
//                ft.setCustomAnimations(R.anim.slide_in_from_right, R.anim.slide_out_to_left, R.anim.slide_in_from_left, R.anim.slide_out_to_right);
            }

            ft.add(container, fragment, fragment.getTagText());
            ft.addToBackStack(fragment.getTagText());
            ft.commit();
        } else {

        }
    }


    private void addMultipleFragments(BaseFragment fragment, boolean withAnimation, int container) {

        FragmentTransaction ft = activity.getSupportFragmentManager().beginTransaction();

        if (withAnimation) {
//                ft.setCustomAnimations(R.anim.slide_in_from_right, R.anim.slide_out_to_left, R.anim.slide_in_from_left, R.anim.slide_out_to_right);
        }
        ft.add(container, fragment, fragment.getTagText());
        ft.addToBackStack(fragment.getTagText());
        ft.commitAllowingStateLoss();
    }
}
