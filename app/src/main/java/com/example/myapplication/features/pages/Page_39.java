package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_39 extends BaseFragment {
    FrameLayout frameLayout_Page_39;

    public Page_39() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_39 = LayoutInflater.from(getContext()).inflate(R.layout.page_39, container, false);
        frameLayout_Page_39=page_39.findViewById(R.id.frameLayout_page_39);

        return page_39;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_39.requestLayout();
    }
}