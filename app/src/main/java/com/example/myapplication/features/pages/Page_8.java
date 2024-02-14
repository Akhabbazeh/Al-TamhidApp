package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_8 extends BaseFragment {
    FrameLayout frameLayout_Page_8;

    public Page_8() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_8 = LayoutInflater.from(getContext()).inflate(R.layout.page_8, container, false);
        frameLayout_Page_8=page_8.findViewById(R.id.frameLayout_page_8);

        return page_8;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_8.requestLayout();
    }
}