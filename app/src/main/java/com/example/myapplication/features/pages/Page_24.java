package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_24 extends BaseFragment {
    FrameLayout frameLayout_Page_24;

    public Page_24() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_24 = LayoutInflater.from(getContext()).inflate(R.layout.page_24, container, false);
        frameLayout_Page_24=page_24.findViewById(R.id.frameLayout_page_24);

        return page_24;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_24.requestLayout();
    }
}