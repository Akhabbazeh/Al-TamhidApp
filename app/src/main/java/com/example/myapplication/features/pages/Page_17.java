package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_17 extends BaseFragment {
    FrameLayout frameLayout_Page_17;

    public Page_17() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_17 = LayoutInflater.from(getContext()).inflate(R.layout.page_17, container, false);
        frameLayout_Page_17=page_17.findViewById(R.id.frameLayout_page_17);

        return page_17;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_17.requestLayout();
    }
}