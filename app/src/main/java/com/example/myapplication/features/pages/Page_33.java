package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_33 extends BaseFragment {
    FrameLayout frameLayout_Page_33;

    public Page_33() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_33 = LayoutInflater.from(getContext()).inflate(R.layout.page_33, container, false);
        frameLayout_Page_33=page_33.findViewById(R.id.frameLayout_page_33);

        return page_33;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_33.requestLayout();
    }
}