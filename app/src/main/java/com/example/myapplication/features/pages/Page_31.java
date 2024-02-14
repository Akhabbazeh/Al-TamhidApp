package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_31 extends BaseFragment {
    FrameLayout frameLayout_Page_31;

    public Page_31() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_31 = LayoutInflater.from(getContext()).inflate(R.layout.page_31, container, false);
        frameLayout_Page_31=page_31.findViewById(R.id.frameLayout_page_31);

        return page_31;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_31.requestLayout();
    }
}