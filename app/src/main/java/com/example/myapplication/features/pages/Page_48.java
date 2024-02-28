package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_48 extends BaseFragment {
    FrameLayout frameLayout_Page_48;

    public Page_48() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_48 = LayoutInflater.from(getContext()).inflate(R.layout.page_48, container, false);
        frameLayout_Page_48=page_48.findViewById(R.id.frameLayout_page_48);

        return page_48;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_48.requestLayout();
    }
}