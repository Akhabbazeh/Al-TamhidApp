package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_25 extends BaseFragment {
    FrameLayout frameLayout_Page_25;

    public Page_25() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_25 = LayoutInflater.from(getContext()).inflate(R.layout.page_25, container, false);
        frameLayout_Page_25=page_25.findViewById(R.id.frameLayout_page_25);

        return page_25;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_25.requestLayout();
    }
}