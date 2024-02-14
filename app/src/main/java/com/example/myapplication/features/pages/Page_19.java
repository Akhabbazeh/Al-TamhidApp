package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_19 extends BaseFragment {
    FrameLayout frameLayout_Page_19;

    public Page_19() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_19 = LayoutInflater.from(getContext()).inflate(R.layout.page_19, container, false);
        frameLayout_Page_19=page_19.findViewById(R.id.frameLayout_page_19);

        return page_19;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_19.requestLayout();
    }
}