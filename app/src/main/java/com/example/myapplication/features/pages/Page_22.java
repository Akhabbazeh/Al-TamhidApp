package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_22 extends BaseFragment {
    FrameLayout frameLayout_Page_22;

    public Page_22() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_22 = LayoutInflater.from(getContext()).inflate(R.layout.page_22, container, false);
        frameLayout_Page_22=page_22.findViewById(R.id.frameLayout_page_22);

        return page_22;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_22.requestLayout();
    }
}