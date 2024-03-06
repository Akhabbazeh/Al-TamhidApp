package com.example.myapplication.features.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.Dialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.features.PageInterface;
import com.example.myapplication.features.StartFragment;
import com.example.myapplication.features.pages.pagesFragment;
import com.example.myapplication.util.Tool;

public class MainActivity extends AppCompatActivity implements PageInterface  {
    private MediaPlayer music;
    private boolean isPlayer=false;
    private boolean isPause=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setFragment(new StartFragment());



    }

    public void click(View view) {

        if (isPlayer == true) {
            Toast.makeText(getApplicationContext(), "الرجاء إيقاف التسجيل أولاً", Toast.LENGTH_LONG).show();
        } else {

            if (music != null) {
                music.release();
                music = null;}

                String tag = view.getTag().toString();
                music = MediaPlayer.create(MainActivity.this, Tool.getAudioFileByTitle(tag));
                music.start();
            }
        }




    private void setFragment(Fragment fragment) {

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.FrameLayout_main_activity, fragment)
                .commit(); }

    @Override
    public void isPlayer(boolean state,boolean isPause) {
        this.isPlayer=state;
        this.isPause=isPause;

        if(state==true && music != null){
            music.release();
            music=null;
        }
    }

    @Override
    public void OnLongClickListeners(boolean state, String buttonTile) {
        if (isPlayer != true && isPause==false) {
            pagesFragment.OnLongClickListeners(state,buttonTile);
        }
    }

    }

