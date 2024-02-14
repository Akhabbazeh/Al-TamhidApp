package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_18 extends BaseFragment {
    FrameLayout frameLayout_Page_18;

    public Page_18() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_18 = LayoutInflater.from(getContext()).inflate(R.layout.page_18, container, false);
        frameLayout_Page_18=page_18.findViewById(R.id.frameLayout_page_18);

        return page_18;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_18.requestLayout();
    }
}