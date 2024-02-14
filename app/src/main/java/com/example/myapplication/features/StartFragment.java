package com.example.myapplication.features;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.DrawableRes;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.myapplication.R;
import com.example.myapplication.features.ContentsFragment.ContentsFragment;
import com.example.myapplication.features.thisBook.ThisBookFragment;
import com.example.myapplication.features.ui.BaseFragment;


public class StartFragment extends BaseFragment {
    ImageView background_start_fragment;
    ImageView img_home_shape_top;
    ImageView title_group_book;
    ImageView logo_app;
    ImageView background_buttons_start_fragment_1;
    ImageView background_buttons_start_fragment_2;
    ImageView background_buttons_start_fragment_3;
    ImageView background_buttons_start_fragment_4;
    ImageView background_buttons_start_fragment_5;




    public StartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_start, container, false);

        setNotificationBarColor(R.color.yallow);


        background_start_fragment = view.findViewById(R.id.background_start_fragment);
        img_home_shape_top = view.findViewById(R.id.img_home_shape_top);
        title_group_book = view.findViewById(R.id.title_group_book);
        logo_app = view.findViewById(R.id.logo_app);
        background_buttons_start_fragment_1 = view.findViewById(R.id.background_buttons_start_fragment_1);
        background_buttons_start_fragment_2 = view.findViewById(R.id.background_buttons_start_fragment_2);
        background_buttons_start_fragment_3 = view.findViewById(R.id.background_buttons_start_fragment_3);
        background_buttons_start_fragment_4 = view.findViewById(R.id.background_buttons_start_fragment_4);
        background_buttons_start_fragment_5 = view.findViewById(R.id.background_buttons_start_fragment_5);



        displayImageDrawable(getContext(),title_group_book,R.drawable.title_group_book);
        displayImageDrawable(getContext(),background_start_fragment,R.drawable.background_start_fragment);
        displayImageDrawable(getContext(),img_home_shape_top,R.drawable.img_home_shape_top);
        displayImageDrawable(getContext(),logo_app,R.drawable.logo_app);
        displayImageDrawable(getContext(),background_buttons_start_fragment_1,R.drawable.background_buttons_start_fragment_2);
        displayImageDrawable(getContext(),background_buttons_start_fragment_2,R.drawable.background_buttons_start_fragment_2);
        displayImageDrawable(getContext(),background_buttons_start_fragment_3,R.drawable.background_buttons_start_fragment_2);
        displayImageDrawable(getContext(),background_buttons_start_fragment_4,R.drawable.background_buttons_start_fragment_2);
        displayImageDrawable(getContext(),background_buttons_start_fragment_5,R.drawable.background_buttons_start_fragment_2);


        background_buttons_start_fragment_1.setOnClickListener(v -> {

                getActivity().getSupportFragmentManager().beginTransaction()
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .replace(R.id.FrameLayout_main_activity, new ContentsFragment(),"ContentsFragment")
                        .addToBackStack("ContentsFragment")
                        .commit();
        });

        background_buttons_start_fragment_2.setOnClickListener(v -> {

            getActivity().getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.FrameLayout_main_activity, new ThisBookFragment(),"ThisBookFragment")
                    .addToBackStack("ThisBookFragment")
                    .commit();
        });

        background_buttons_start_fragment_3.setOnClickListener(v -> {

            getActivity().getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.FrameLayout_main_activity, new AuthorsFragment(),"AuthorsFragment")
                    .addToBackStack("AuthorsFragment")
                    .commit();
        });

        background_buttons_start_fragment_4.setOnClickListener(v -> {

            getActivity().getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.FrameLayout_main_activity, new UsersGuideFragment(),"UsersGuideFragment")
                    .addToBackStack("UsersGuideFragment")
                    .commit();
        });

        background_buttons_start_fragment_5.setOnClickListener(v -> {

            getActivity().getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.FrameLayout_main_activity, new OurServicesFragment(),"OurServicesFragment")
                    .addToBackStack("OurServicesFragment")
                    .commit();
        });

        return view;


    }
    public static void displayImageDrawable(Context context, ImageView img, @DrawableRes int drawable) {
        try {
            Glide.with(context).load(drawable)
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(img);
        } catch (Exception e) {
        }
    }
    

}

