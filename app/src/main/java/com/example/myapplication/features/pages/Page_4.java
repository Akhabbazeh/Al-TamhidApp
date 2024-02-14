package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_4 extends BaseFragment {
    FrameLayout frameLayout_Page_4;

    public Page_4() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_4 = LayoutInflater.from(getContext()).inflate(R.layout.page_4, container, false);
        frameLayout_Page_4=page_4.findViewById(R.id.frameLayout_page_4);

        return page_4;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_4.requestLayout();
    }
}