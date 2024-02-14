package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_36 extends BaseFragment {
    FrameLayout frameLayout_Page_36;

    public Page_36() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_36 = LayoutInflater.from(getContext()).inflate(R.layout.page_36, container, false);
        frameLayout_Page_36=page_36.findViewById(R.id.frameLayout_page_36);

        return page_36;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_36.requestLayout();
    }
}