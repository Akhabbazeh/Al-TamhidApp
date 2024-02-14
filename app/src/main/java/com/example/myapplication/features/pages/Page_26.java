package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_26 extends BaseFragment {
    FrameLayout frameLayout_Page_26;

    public Page_26() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_26 = LayoutInflater.from(getContext()).inflate(R.layout.page_26, container, false);
        frameLayout_Page_26=page_26.findViewById(R.id.frameLayout_page_26);

        return page_26;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_26.requestLayout();
    }
}