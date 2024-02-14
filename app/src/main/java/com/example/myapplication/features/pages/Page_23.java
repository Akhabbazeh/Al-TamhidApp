package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_23 extends BaseFragment {
    FrameLayout frameLayout_Page_23;

    public Page_23() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_23 = LayoutInflater.from(getContext()).inflate(R.layout.page_23, container, false);
        frameLayout_Page_23=page_23.findViewById(R.id.frameLayout_page_23);

        return page_23;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_23.requestLayout();
    }
}