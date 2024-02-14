package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_6 extends BaseFragment {
    FrameLayout frameLayout_Page_6;

    public Page_6() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_6 = LayoutInflater.from(getContext()).inflate(R.layout.page_6, container, false);
        frameLayout_Page_6=page_6.findViewById(R.id.frameLayout_page_6);

        return page_6;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_6.requestLayout();
    }
}