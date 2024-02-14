package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_40 extends BaseFragment {
    FrameLayout frameLayout_Page_40;

    public Page_40() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_40 = LayoutInflater.from(getContext()).inflate(R.layout.page_40, container, false);
        frameLayout_Page_40=page_40.findViewById(R.id.frameLayout_page_40);

        return page_40;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_40.requestLayout();
    }
}