package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_44 extends BaseFragment {
    FrameLayout frameLayout_Page_44;

    public Page_44() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_44 = LayoutInflater.from(getContext()).inflate(R.layout.page_44, container, false);
        frameLayout_Page_44=page_44.findViewById(R.id.frameLayout_page_44);

        return page_44;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_44.requestLayout();
    }
}