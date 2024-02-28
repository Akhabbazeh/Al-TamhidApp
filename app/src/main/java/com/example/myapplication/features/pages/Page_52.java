package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_52 extends BaseFragment {
    FrameLayout frameLayout_Page_52;

    public Page_52() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_52 = LayoutInflater.from(getContext()).inflate(R.layout.page_52, container, false);
        frameLayout_Page_52=page_52.findViewById(R.id.frameLayout_page_52);

        return page_52;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_52.requestLayout();
    }
}