package com.example.myapplication.features.thisBook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.DrawableRes;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.myapplication.R;

public class AdapterGridView extends BaseAdapter {

        Context context;
        int[] images;
        LayoutInflater inflater;

        public AdapterGridView(Context context, int[] images) {
            this.context = context;
            this.images = images;
            inflater = (LayoutInflater.from(context));
        }


        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View view, ViewGroup parent) {
            view = inflater.inflate(R.layout.item_grid_view_img_book, null);

            ImageView imageView = view.findViewById(R.id.img_item_grid_view);
            displayImageDrawable(context,imageView,images[position]);
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
