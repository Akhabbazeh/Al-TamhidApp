package com.example.myapplication.util;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.DrawableRes;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.myapplication.R;
import com.example.myapplication.features.ui.MainActivity;

public class Tool {

    public static String milliSecondsToTimer(long milliseconds) {
        String finalTimerString = "";
        String secondsString = "";

        // Convert total duration into time
        int hours = (int) (milliseconds / (1000 * 60 * 60));
        int minutes = (int) (milliseconds % (1000 * 60 * 60)) / (1000 * 60);
        int seconds = (int) ((milliseconds % (1000 * 60 * 60)) % (1000 * 60) / 1000);
        // Add hours if there
        if (hours > 0) {
            finalTimerString = hours + ":";
        }

        // Prepending 0 to seconds if it is one digit
        if (seconds < 10) {
            secondsString = "0" + seconds;
        } else {
            secondsString = "" + seconds;
        }

        finalTimerString = finalTimerString + minutes + ":" + secondsString;

        // return timer string
        return finalTimerString;


    }

    public static MediaPlayer getAudioPage(Context context,int position){

        if (position==0){
            return MediaPlayer.create(context,R.raw.page_11);
        }else if (position==1){
            return MediaPlayer.create(context,R.raw.page_15);
        }else return null;
    }

    public static String getPageTitle(int pageNum){
        if (pageNum==0){
            return "الحروف حسب ترتيب مخارجها";
        }else if (pageNum==0){
            return "الحروفٌ اللَّثويَّة";
        }else return "null";
    }
    public static void displayImageDrawable(Context context, ImageView img, @DrawableRes int drawable) {
        try {
            Glide.with(context).load(drawable)
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(img);
        } catch (Exception e) {
        }
    }

    public static int getAudioFileByTitle(String buttonTile)
    {
        switch(buttonTile){

           case "page_15_8":
               return R.raw.page_15_08;


            case "page_15_9":
                return R.raw.page_15_09;


            case "page_15_10":
                return R.raw.page_15_10;

            case "page_15_11":
                return R.raw.page_15_11;


            case "page_15_12":
                return R.raw.page_15_12;


            case "page_15_13":
                return R.raw.page_15_13;

            case "page_15_14":
                return R.raw.page_15_14;

            case "page_15_15":
                return R.raw.page_15_15;

            case "page_15_16":
                return R.raw.page_15_16;

            case "page_15_17":
                return R.raw.page_15_17;

            case "page_15_18":
                return R.raw.page_15_18;
            case "page_15_19":
                return R.raw.page_15_19;

            case "page_15_20":
                return R.raw.page_15_20;

            case "page_15_21":
                return R.raw.page_15_21;

            case "page_15_22":
                return R.raw.page_15_22;

            case "page_15_23":
                return R.raw.page_15_23;

            case "page_15_24":
                return R.raw.page_15_24;

            case "page_15_25":
                return R.raw.page_15_25;
             default: return -1;
}
    }
}
