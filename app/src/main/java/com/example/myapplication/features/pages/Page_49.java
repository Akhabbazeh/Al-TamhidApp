package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_49 extends BaseFragment {
    FrameLayout frameLayout_Page_49;

    public Page_49() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_49 = LayoutInflater.from(getContext()).inflate(R.layout.page_49, container, false);
        frameLayout_Page_49=page_49.findViewById(R.id.frameLayout_page_49);

        return page_49;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_49.requestLayout();
    }
}