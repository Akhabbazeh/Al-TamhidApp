package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_11 extends BaseFragment {
    FrameLayout frameLayout_Page_11;

    public Page_11() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_11 = LayoutInflater.from(getContext()).inflate(R.layout.page_11, container, false);
        frameLayout_Page_11=page_11.findViewById(R.id.frameLayout_page_11);

        return page_11;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_11.requestLayout();
    }
}