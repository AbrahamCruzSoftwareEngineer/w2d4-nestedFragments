package com.evolutiondso.www.w2d4_nestedfragments;

/**
 * Created by Albrtx on 30/10/2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FirstFragment extends Fragment {


    public FirstFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = (View) inflater.inflate(R.layout.bluefragment, container, false);

        Fragment fragment2 = new SecondFragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.nestedFragment, fragment2 ).commit();

        return view;
    }

}
