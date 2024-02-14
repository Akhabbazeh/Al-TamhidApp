package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_21 extends BaseFragment {
    FrameLayout frameLayout_Page_21;

    public Page_21() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_21 = LayoutInflater.from(getContext()).inflate(R.layout.page_21, container, false);
        frameLayout_Page_21=page_21.findViewById(R.id.frameLayout_page_21);

        return page_21;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_21.requestLayout();
    }
}