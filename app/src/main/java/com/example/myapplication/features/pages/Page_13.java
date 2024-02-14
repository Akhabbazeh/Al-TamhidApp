package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_13 extends BaseFragment {
    FrameLayout frameLayout_Page_13;

    public Page_13() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_13 = LayoutInflater.from(getContext()).inflate(R.layout.page_13, container, false);
        frameLayout_Page_13=page_13.findViewById(R.id.frameLayout_page_13);

        return page_13;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_13.requestLayout();
    }
}