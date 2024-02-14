package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_14 extends BaseFragment {
    FrameLayout frameLayout_Page_14;

    public Page_14() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_14 = LayoutInflater.from(getContext()).inflate(R.layout.page_14, container, false);
        frameLayout_Page_14=page_14.findViewById(R.id.frameLayout_page_14);

        return page_14;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_14.requestLayout();
    }
}