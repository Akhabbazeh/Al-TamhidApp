package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_51 extends BaseFragment {
    FrameLayout frameLayout_Page_51;

    public Page_51() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_51 = LayoutInflater.from(getContext()).inflate(R.layout.page_51, container, false);
        frameLayout_Page_51=page_51.findViewById(R.id.frameLayout_page_51);

        return page_51;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_51.requestLayout();
    }
}