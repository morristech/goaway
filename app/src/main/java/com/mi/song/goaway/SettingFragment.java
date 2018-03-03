package com.mi.song.goaway;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.takisoft.fix.support.v7.preference.PreferenceFragmentCompat;

public class SettingFragment extends PreferenceFragmentCompat {

    public static String PRE_KEY_TIP0 = "pre_key_tip0";
    public static String PRE_KEY_TIP1 = "pre_key_tip1";
    public static String PRE_KEY_TIP2 = "pre_key_tip2";
    public static String PRE_KEY_TIP3 = "pre_key_tip3";

    public SettingFragment() {
        // Required empty public constructor
    }

    @Override
    public void onResume() {
        super.onResume();
        setHasOptionsMenu(false);
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        if (activity != null) {
            activity.setTitle(getString(R.string.menu_setting));
            activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public void onCreatePreferencesFix(@Nullable Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preference, rootKey);
    }
}
