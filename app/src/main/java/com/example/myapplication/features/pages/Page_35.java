package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_35 extends BaseFragment {
    FrameLayout frameLayout_Page_35;

    public Page_35() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_35 = LayoutInflater.from(getContext()).inflate(R.layout.page_35, container, false);
        frameLayout_Page_35=page_35.findViewById(R.id.frameLayout_page_35);

        return page_35;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_35.requestLayout();
    }
}