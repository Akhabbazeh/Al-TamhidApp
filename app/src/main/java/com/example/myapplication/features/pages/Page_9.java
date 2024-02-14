package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_9 extends BaseFragment {
    FrameLayout frameLayout_Page_9;

    public Page_9() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_9 = LayoutInflater.from(getContext()).inflate(R.layout.page_9, container, false);
        frameLayout_Page_9=page_9.findViewById(R.id.frameLayout_page_9);

        return page_9;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_9.requestLayout();
    }
}