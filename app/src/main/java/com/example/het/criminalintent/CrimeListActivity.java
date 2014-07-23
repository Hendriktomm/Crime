package com.example.het.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by HET on 23.7.2014.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
