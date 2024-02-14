package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_32 extends BaseFragment {
    FrameLayout frameLayout_Page_32;

    public Page_32() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_32 = LayoutInflater.from(getContext()).inflate(R.layout.page_32, container, false);
        frameLayout_Page_32=page_32.findViewById(R.id.frameLayout_page_32);

        return page_32;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_32.requestLayout();
    }
}