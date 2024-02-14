package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_42 extends BaseFragment {
    FrameLayout frameLayout_Page_42;

    public Page_42() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_42 = LayoutInflater.from(getContext()).inflate(R.layout.page_42, container, false);
        frameLayout_Page_42=page_42.findViewById(R.id.frameLayout_page_42);

        return page_42;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_42.requestLayout();
    }
}