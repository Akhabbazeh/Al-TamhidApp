package com.example.myapplication.features;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;


public class UsersGuideFragment extends BaseFragment {
    private ImageView ButtonBack;
    public UsersGuideFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view_5 = LayoutInflater.from(getContext()).inflate(R.layout.fragment_users_guide, container, false);
        setNotificationBarColor(R.color.primary_color);

        ButtonBack = view_5.findViewById(R.id.ButtonBack);
        ButtonBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });
        return view_5;
    }



}
