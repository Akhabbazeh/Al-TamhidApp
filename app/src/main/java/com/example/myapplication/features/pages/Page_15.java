package com.example.myapplication.features.pages;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.myapplication.R;
import com.example.myapplication.features.PageInterface;
import com.example.myapplication.features.ui.BaseFragment;
import com.example.myapplication.features.ui.PageInterface_2;

public class Page_15 extends BaseFragment {
    FrameLayout frameLayout_page_15;
    private PageInterface pageInterface;
    private LayoutInflater textCounterLayout;
    private View page_15_8;
    private View page_15_9;
    private View page_15_10;
    private View page_15_11;
    private View page_15_12;
    private View page_15_13;
    private View page_15_14;
    private View page_15_15;
    private View page_15_16;
    private View page_15_17;
    private View page_15_18;
    private View page_15_19;
    private View page_15_20;
    private View page_15_21;
    private View page_15_22;
    private View page_15_23;
    private View page_15_24;
    private View page_15_25;

    public Page_15() {

    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            pageInterface = (PageInterface) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement TextClicked");
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_15 = LayoutInflater.from(getContext()).inflate(R.layout.page_15, container, false);
        frameLayout_page_15=page_15.findViewById(R.id.frameLayout_page_15);
        page_15_8=page_15.findViewById(R.id.page_15_8);
        page_15_9=page_15.findViewById(R.id.page_15_9);
        page_15_10=page_15.findViewById(R.id.page_15_10);
        page_15_11=page_15.findViewById(R.id.page_15_11);
        page_15_12=page_15.findViewById(R.id.page_15_12);
        page_15_13=page_15.findViewById(R.id.page_15_13);
        page_15_14=page_15.findViewById(R.id.page_15_14);
        page_15_15=page_15.findViewById(R.id.page_15_15);
        page_15_16=page_15.findViewById(R.id.page_15_16);
        page_15_17=page_15.findViewById(R.id.page_15_17);
        page_15_18=page_15.findViewById(R.id.page_15_18);
        page_15_19=page_15.findViewById(R.id.page_15_19);
        page_15_20=page_15.findViewById(R.id.page_15_20);
        page_15_21=page_15.findViewById(R.id.page_15_21);
        page_15_22=page_15.findViewById(R.id.page_15_22);
        page_15_23=page_15.findViewById(R.id.page_15_23);
        page_15_24=page_15.findViewById(R.id.page_15_24);
        page_15_25=page_15.findViewById(R.id.page_15_25);

        setOnLongClickListener();


        return page_15;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            switch (v.getId()) {
                case R.id.page_15_8:
                    pageInterface.OnLongClickListeners(true,"page_15_8");
                    break;
                case R.id.page_15_9:
                    pageInterface.OnLongClickListeners(true,"page_15_9");
                    break;
                case R.id.page_15_10:
                    pageInterface.OnLongClickListeners(true,"page_15_10");
                    break;
                case R.id.page_15_11:
                    pageInterface.OnLongClickListeners(true,"page_15_11");
                    break;
                case R.id.page_15_12:
                    pageInterface.OnLongClickListeners(true,"page_15_12");
                    break;
                case R.id.page_15_13:
                    pageInterface.OnLongClickListeners(true,"page_15_13");
                    break;
                case R.id.page_15_14:
                    pageInterface.OnLongClickListeners(true,"page_15_14");
                    break;
                case R.id.page_15_15:
                    pageInterface.OnLongClickListeners(true,"page_15_15");
                    break;
                case R.id.page_15_16:
                    pageInterface.OnLongClickListeners(true,"page_15_16");
                    break;
                case R.id.page_15_17:
                    pageInterface.OnLongClickListeners(true,"page_15_17");
                    break;
                case R.id.page_15_18:
                    pageInterface.OnLongClickListeners(true,"page_15_18");
                    break;
                case R.id.page_15_19:
                    pageInterface.OnLongClickListeners(true,"page_15_19");
                    break;
                case R.id.page_15_20:
                    pageInterface.OnLongClickListeners(true,"page_15_20");
                    break;
                case R.id.page_15_21:
                    pageInterface.OnLongClickListeners(true,"page_15_21");
                    break;
                case R.id.page_15_22:
                    pageInterface.OnLongClickListeners(true,"page_15_22");
                    break;
                case R.id.page_15_23:
                    pageInterface.OnLongClickListeners(true,"page_15_23");
                    break;
                case R.id.page_15_24:
                    pageInterface.OnLongClickListeners(true,"page_15_24");
                    break;
                case R.id.page_15_25:
                    pageInterface.OnLongClickListeners(true,"page_15_25");
                    break;

            }
            return true;
        }
    };
   private void setOnLongClickListener(){
       page_15_8.setOnLongClickListener(listener);
       page_15_9.setOnLongClickListener(listener);
       page_15_10.setOnLongClickListener(listener);
       page_15_11.setOnLongClickListener(listener);
       page_15_12.setOnLongClickListener(listener);
       page_15_13.setOnLongClickListener(listener);
       page_15_14.setOnLongClickListener(listener);
       page_15_15.setOnLongClickListener(listener);
       page_15_16.setOnLongClickListener(listener);
       page_15_17.setOnLongClickListener(listener);
       page_15_18.setOnLongClickListener(listener);
       page_15_19.setOnLongClickListener(listener);
       page_15_20.setOnLongClickListener(listener);
       page_15_21.setOnLongClickListener(listener);
       page_15_22.setOnLongClickListener(listener);
       page_15_23.setOnLongClickListener(listener);
       page_15_24.setOnLongClickListener(listener);
       page_15_25.setOnLongClickListener(listener);


    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_15.requestLayout();
    }
}