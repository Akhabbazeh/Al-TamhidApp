package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_53 extends BaseFragment {
    FrameLayout frameLayout_Page_53;

    public Page_53() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_53 = LayoutInflater.from(getContext()).inflate(R.layout.page_53, container, false);
        frameLayout_Page_53=page_53.findViewById(R.id.frameLayout_page_53);

        return page_53;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_53.requestLayout();
    }
}