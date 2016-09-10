package com.bignerdranch.android.hackhealth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by edmundliang on 9/10/16.
 */
public class IntroFragment extends Fragment {

    private Button mGetStarted;
    private View mView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_intro, container, false);
        mGetStarted = (Button) mView.findViewById(R.id.get_started_button);
        mGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getStarted = new Intent(IntroFragment.this.getActivity(), LoginPage.class);
                startActivity(getStarted);
            }
        });
        return mView;
    }



}
