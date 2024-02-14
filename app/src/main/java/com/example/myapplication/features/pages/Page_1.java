package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_1 extends BaseFragment {
    FrameLayout frameLayout_Page_1;

    public Page_1() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_1 = LayoutInflater.from(getContext()).inflate(R.layout.page_1, container, false);
        frameLayout_Page_1=page_1.findViewById(R.id.frameLayout_page_1);

        return page_1;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_1.requestLayout();
    }
}