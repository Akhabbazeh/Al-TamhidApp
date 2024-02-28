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
        }else if (position==4){
            return MediaPlayer.create(context,R.raw.page_15);
        }else return MediaPlayer.create(context,R.raw.page_00);
    }

    public static String getPageTitle(int pageNum){
        switch (pageNum){
        case 0:
            return "الحروف حسب ترتيب مخارجها";
        case 1:
            return "الحروف حسب ترتيب مخارجها(2)";
        case 2:
            return "الحروف حسب ترتيب مخارجها(3)";
         case 3:
            return "الحروف حسب ترتيب مخارجها(4)";
        case 4:
            return "الحروفٌ اللَّثويَّة";
        case 5:
            return "الهمس";
            case 6:
                return "الهمس(2)";
            case 7:
                return "التاء المربوطة والتاء المبسوطة";
            case 8:
                return "القلقلة";
            case 9:
                return "القلقلة(2)";
            case 10:
                return "التفخيم والترقيق";
            case 11:
                return "التفخيم والترقيق(2)";
            case 12:
                return "التفخيم والترقيق(3)";
            case 13:
                return "التفخيم والترقيق(4)";
            case 14:
                return "التفخيم والترقيق(5)";
            case 15:
                return "اختبار المرحلة الأولى";
            case 16:
                return "همزة الوصل";
            case 17:
                return "همزة الوصل(2)";
            case 18:
                return "لام(ال) التعريف";
            case 19:
                return "لام(ال) التعريف(2)";
            case 20:
                return "لام(ال) التعريف(3)";
            case 21:
                return "لام(ال) التعريف(4)";
            case 22:
                return "المدود";
            case 23:
                return "المدود(2)";
            case 24:
                return "المدود(3)";
            case 25:
                return "المدود(4)";
            case 26:
                return "المدود(5)";
            case 27:
                return "المدود(6)";
            case 28:
                return "الغنة";
            case 29:
                return "الغنة(2)";
            case 30:
                return "الغنة(3)";
            case 31:
                return "التنوين";
            case 32:
                return "التنوين(2)";
            case 33:
                return "التنوين(3)";
            case 34:
                return "علامات ضبط المصحف";
            case 35:
                return "علامات ضبط المصحف(2)";
            case 36:
                return "علامات ضبط المصحف(3)";
            case 37:
                return "أمثلة عن الفرق بين الرسم العثماني والإملائي";
            case 38:
                return "أمثلة تطبيقية عن جزء عمّ";
            case 39:
                return "اختبار كامل الكتاب";
            case 40:
                return "اختبار كامل الكتاب(2)";
            default: return null;


        }
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

            case "page_11_1":
                return R.raw.page_11_1;
            case "page_11_2":
                return R.raw.page_11_2;
            case "page_11_3":
                return R.raw.page_11_3;
            case "page_12_1":
                return R.raw.page_12_1;
            case "page_12_2":
                return R.raw.page_12_2;
            case "page_12_3":
                return R.raw.page_12_3;
            case "page_12_4":
                return R.raw.page_12_4;
            case "page_12_5":
                return R.raw.page_12_5;
            case "page_12_6":
                return R.raw.page_12_6;
            case "page_13_1":
                return R.raw.page_13_1;
            case "page_13_2":
                return R.raw.page_13_2;
            case "page_13_3":
                return R.raw.page_13_3;
            case "page_13_4":
                return R.raw.page_13_4;
            case "page_13_5":
                return R.raw.page_13_5;
            case "page_13_6":
                return R.raw.page_13_6;
            case "page_13_7":
                return R.raw.page_13_7;
            case "page_13_8":
                return R.raw.page_13_8;
            case "page_13_9":
                return R.raw.page_13_9;
            case "page_13_10":
                return R.raw.page_13_10;
            case "page_13_11":
                return R.raw.page_13_11;
            case "page_13_12":
                return R.raw.page_13_12;
            case "page_13_13":
                return R.raw.page_13_13;
            case "page_13_14":
                return R.raw.page_13_14;
            case "page_14_15":
                return R.raw.page_13_15;
            case "page_13_16":
                return R.raw.page_13_16;
            case "page_13_17":
                return R.raw.page_13_17;
            case "page_13_18":
                return R.raw.page_13_18;
            case "page_14_1":
                return R.raw.page_14_1;
            case "page_14_2":
                return R.raw.page_14_2;
            case "page_14_3":
                return R.raw.page_14_3;
            case "page_14_4":
                return R.raw.page_14_4;
            case "page_14_5":
                return R.raw.page_14_5;
            case "page_14_6":
                return R.raw.page_14_6;
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
             default: return R.raw.cleck_00;
}
    }
}
