package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_34 extends BaseFragment {
    FrameLayout frameLayout_Page_34;

    public Page_34() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_34 = LayoutInflater.from(getContext()).inflate(R.layout.page_34, container, false);
        frameLayout_Page_34=page_34.findViewById(R.id.frameLayout_page_34);

        return page_34;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_34.requestLayout();
    }
}