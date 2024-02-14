package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_5 extends BaseFragment {
    FrameLayout frameLayout_Page_5;

    public Page_5() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_5 = LayoutInflater.from(getContext()).inflate(R.layout.page_5, container, false);
        frameLayout_Page_5=page_5.findViewById(R.id.frameLayout_page_5);

        return page_5;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_5.requestLayout();
    }
}