package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_50 extends BaseFragment {
    FrameLayout frameLayout_Page_50;

    public Page_50() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_50 = LayoutInflater.from(getContext()).inflate(R.layout.page_50, container, false);
        frameLayout_Page_50=page_50.findViewById(R.id.frameLayout_page_50);

        return page_50;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_50.requestLayout();
    }
}