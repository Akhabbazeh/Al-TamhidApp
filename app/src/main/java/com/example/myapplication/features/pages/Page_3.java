package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_3 extends BaseFragment {
    FrameLayout frameLayout_Page_3;

    public Page_3() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_3 = LayoutInflater.from(getContext()).inflate(R.layout.page_3, container, false);
        frameLayout_Page_3=page_3.findViewById(R.id.frameLayout_page_3);

        return page_3;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_3.requestLayout();
    }
}