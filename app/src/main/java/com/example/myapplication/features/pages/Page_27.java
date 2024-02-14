package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_27 extends BaseFragment {
    FrameLayout frameLayout_Page_27;

    public Page_27() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_27 = LayoutInflater.from(getContext()).inflate(R.layout.page_27, container, false);
        frameLayout_Page_27=page_27.findViewById(R.id.frameLayout_page_27);

        return page_27;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_27.requestLayout();
    }
}