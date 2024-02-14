package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_45 extends BaseFragment {
    FrameLayout frameLayout_Page_45;

    public Page_45() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_45 = LayoutInflater.from(getContext()).inflate(R.layout.page_45, container, false);
        frameLayout_Page_45=page_45.findViewById(R.id.frameLayout_page_45);

        return page_45;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_45.requestLayout();
    }
}