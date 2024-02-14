package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_43 extends BaseFragment {
    FrameLayout frameLayout_Page_43;

    public Page_43() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_43 = LayoutInflater.from(getContext()).inflate(R.layout.page_43, container, false);
        frameLayout_Page_43=page_43.findViewById(R.id.frameLayout_page_43);

        return page_43;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_43.requestLayout();
    }
}