package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_10 extends BaseFragment {
    FrameLayout frameLayout_Page_10;

    public Page_10() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_10 = LayoutInflater.from(getContext()).inflate(R.layout.page_10, container, false);
        frameLayout_Page_10=page_10.findViewById(R.id.frameLayout_page_10);

        return page_10;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_10.requestLayout();
    }
}