package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_29 extends BaseFragment {
    FrameLayout frameLayout_Page_29;

    public Page_29() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_29 = LayoutInflater.from(getContext()).inflate(R.layout.page_29, container, false);
        frameLayout_Page_29=page_29.findViewById(R.id.frameLayout_page_29);

        return page_29;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_29.requestLayout();
    }
}