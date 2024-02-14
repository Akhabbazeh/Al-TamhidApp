package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_16 extends BaseFragment {
    FrameLayout frameLayout_Page_16;

    public Page_16() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_16 = LayoutInflater.from(getContext()).inflate(R.layout.page_16, container, false);
        frameLayout_Page_16=page_16.findViewById(R.id.frameLayout_page_16);

        return page_16;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_16.requestLayout();
    }
}