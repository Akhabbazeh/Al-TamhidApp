package com.example.myapplication.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_46 extends BaseFragment {
    FrameLayout frameLayout_Page_46;

    public Page_46() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_46 = LayoutInflater.from(getContext()).inflate(R.layout.page_46, container, false);
        frameLayout_Page_46=page_46.findViewById(R.id.frameLayout_page_46);

        return page_46;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_46.requestLayout();
    }
}