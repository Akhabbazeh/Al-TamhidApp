package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_47 extends BaseFragment {
    FrameLayout frameLayout_Page_47;

    public Page_47() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_47 = LayoutInflater.from(getContext()).inflate(R.layout.page_47, container, false);
        frameLayout_Page_47=page_47.findViewById(R.id.frameLayout_page_47);

        return page_47;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_47.requestLayout();
    }
}