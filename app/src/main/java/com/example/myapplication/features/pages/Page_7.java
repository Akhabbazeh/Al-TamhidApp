package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_7 extends BaseFragment {
    FrameLayout frameLayout_Page_7;

    public Page_7() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_7 = LayoutInflater.from(getContext()).inflate(R.layout.page_7, container, false);
        frameLayout_Page_7=page_7.findViewById(R.id.frameLayout_page_7);

        return page_7;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_7.requestLayout();
    }
}