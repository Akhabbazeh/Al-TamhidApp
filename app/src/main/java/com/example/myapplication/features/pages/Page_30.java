package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_30 extends BaseFragment {
    FrameLayout frameLayout_Page_30;

    public Page_30() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_30 = LayoutInflater.from(getContext()).inflate(R.layout.page_30, container, false);
        frameLayout_Page_30=page_30.findViewById(R.id.frameLayout_page_30);

        return page_30;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_30.requestLayout();
    }
}