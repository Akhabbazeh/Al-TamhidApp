package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_41 extends BaseFragment {
    FrameLayout frameLayout_Page_41;

    public Page_41() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_41 = LayoutInflater.from(getContext()).inflate(R.layout.page_41, container, false);
        frameLayout_Page_41=page_41.findViewById(R.id.frameLayout_page_41);

        return page_41;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_41.requestLayout();
    }
}