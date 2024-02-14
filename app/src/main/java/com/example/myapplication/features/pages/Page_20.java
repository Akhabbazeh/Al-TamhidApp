package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_20 extends BaseFragment {
    FrameLayout frameLayout_Page_20;

    public Page_20() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_20 = LayoutInflater.from(getContext()).inflate(R.layout.page_20, container, false);
        frameLayout_Page_20=page_20.findViewById(R.id.frameLayout_page_20);

        return page_20;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_20.requestLayout();
    }
}