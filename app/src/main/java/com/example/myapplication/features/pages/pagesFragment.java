package com.example.myapplication.features.pages;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.DrawableRes;
import androidx.viewpager2.widget.ViewPager2;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.myapplication.R;
import com.example.myapplication.features.ui.MainActivity;
import com.example.myapplication.features.ui.PageInterface_2;
import com.example.myapplication.util.Tool;
import com.example.myapplication.features.PageInterface;
import com.example.myapplication.features.ui.BaseFragment;


public class pagesFragment extends BaseFragment {
   private TextView txtTitlePage;
   private TextView txt_counter;
    private ImageView run_player_icon;
    private ImageView btn_add_counter;
    private ImageView btn_remove_counter;
    private ImageView stop_player_icon;
    private ImageView btn_cancel_counter;
    private ImageView btn_play_counter;
    private MediaPlayer mediaPlayer;
    private SeekBar seekBar;
    private TextView seekbarHint;
    private ViewPager2 ViewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private boolean isPause=false;
    private PageInterface pageInterface;
   private int pageNum;
   private static FrameLayout constraint_nav_counter;
    private static FrameLayout constraint_nav;
    private static String _buttonTile;
    private int counterNum =1;
    private int counterNum_new=0;
    private boolean counterIsEmpty=true;
    private int counterIsplay =2;


    public pagesFragment() {

    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            pageInterface = (PageInterface) context;

        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement FragmentToActivity");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       // getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_BEHIND);
        View view_2 = LayoutInflater.from(getContext()).inflate(R.layout.fragment_pages, container, false);



        run_player_icon = view_2.findViewById(R.id.run_player_icon);
        stop_player_icon = view_2.findViewById(R.id.stop_player_icon);
        ViewPager = view_2.findViewById(R.id.pager);
        seekbarHint= view_2.findViewById(R.id.seekbarHint);
        seekBar = view_2.findViewById(R.id.seekbar);
        mediaPlayer= MediaPlayer.create(getContext(),R.raw.page_15);
        txtTitlePage = view_2.findViewById(R.id.txtTitlePage);
        constraint_nav_counter = view_2.findViewById(R.id.constraint_nav_counter);
        constraint_nav = view_2.findViewById(R.id.constraint_nav);
        btn_cancel_counter = view_2.findViewById(R.id.btn_cancel_counter);
        btn_play_counter = view_2.findViewById(R.id.btn_play_counter);
        txt_counter = view_2.findViewById(R.id.txt_counter);
        btn_add_counter = view_2.findViewById(R.id.btn_add_counter);
        btn_remove_counter = view_2.findViewById(R.id.btn_remove_counter);


        initComponent();
        initViewPager();

        return view_2;
    }

    public void initViewPager() {
        pageInterface.isPlayer(false,false);
        viewPagerAdapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager(), getLifecycle());
        // set Orientation in your ViewPager2
        ViewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        // add Fragments in your ViewPagerFragmentAdapter class
//        viewPagerAdapter.addFragment(new Page_1());
//        viewPagerAdapter.addFragment(new Page_2());
//        viewPagerAdapter.addFragment(new Page_3());
//        viewPagerAdapter.addFragment(new Page_4());
//        viewPagerAdapter.addFragment(new Page_5());
//        viewPagerAdapter.addFragment(new Page_6());
//        viewPagerAdapter.addFragment(new Page_7());
//        viewPagerAdapter.addFragment(new Page_8());
//        viewPagerAdapter.addFragment(new Page_9());
//        viewPagerAdapter.addFragment(new Page_10());
        viewPagerAdapter.addFragment(new Page_11());
        viewPagerAdapter.addFragment(new Page_12());
        viewPagerAdapter.addFragment(new Page_13());
        viewPagerAdapter.addFragment(new Page_14());
        viewPagerAdapter.addFragment(new Page_15());
        viewPagerAdapter.addFragment(new Page_16());
        viewPagerAdapter.addFragment(new Page_17());
        viewPagerAdapter.addFragment(new Page_18());
        viewPagerAdapter.addFragment(new Page_19());
        viewPagerAdapter.addFragment(new Page_20());
        viewPagerAdapter.addFragment(new Page_21());
        viewPagerAdapter.addFragment(new Page_22());
        viewPagerAdapter.addFragment(new Page_23());
        viewPagerAdapter.addFragment(new Page_24());
        viewPagerAdapter.addFragment(new Page_25());
        viewPagerAdapter.addFragment(new Page_26());
//        viewPagerAdapter.addFragment(new Page_27());
//        viewPagerAdapter.addFragment(new Page_28());
        viewPagerAdapter.addFragment(new Page_29());
        viewPagerAdapter.addFragment(new Page_30());
        viewPagerAdapter.addFragment(new Page_31());
        viewPagerAdapter.addFragment(new Page_32());
        viewPagerAdapter.addFragment(new Page_33());
        viewPagerAdapter.addFragment(new Page_34());
        viewPagerAdapter.addFragment(new Page_35());
        viewPagerAdapter.addFragment(new Page_36());
        viewPagerAdapter.addFragment(new Page_37());
        viewPagerAdapter.addFragment(new Page_38());
        viewPagerAdapter.addFragment(new Page_39());
        viewPagerAdapter.addFragment(new Page_40());
        viewPagerAdapter.addFragment(new Page_41());
        viewPagerAdapter.addFragment(new Page_42());
        viewPagerAdapter.addFragment(new Page_43());
        viewPagerAdapter.addFragment(new Page_44());
        viewPagerAdapter.addFragment(new Page_45());
        ViewPager.setAdapter(viewPagerAdapter);
        ViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                pageNum = position;
                if (!(mediaPlayer.isPlaying() && mediaPlayer != null || isPause==true)){
//                    mediaPlayer=Tool.getAudioPage(getContext(),pageNum);
//                    seekBar.setMax(mediaPlayer.getDuration());
//                    txtTitlePage.setText(Tool.getPageTitle(pageNum));
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }

   public void initComponent(){

       Tool.displayImageDrawable(getContext(), stop_player_icon, R.drawable.stop_player_icon);
       Tool.displayImageDrawable(getContext(), run_player_icon, R.drawable.run_player_icon);

       run_player_icon.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               seekbarHint.setVisibility(view.VISIBLE);
               if (mediaPlayer != null && mediaPlayer.isPlaying()) {pauseAudio();}
               else {startAudio();}
           }});

            stop_player_icon.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {stopAudio();}
      });

            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromTouch) {
                if(fromTouch) {
                    mediaPlayer.seekTo(progress);
                    seekBar.setProgress(progress);
                }
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.seekTo(seekBar.getProgress());
                }
            }
        });



        Handler mSeekbarUpdateHandler = new Handler();
        Runnable mUpdateSeekbar = new Runnable() {
           @Override
           public void run() {
               seekbarHint.setText(Tool.milliSecondsToTimer(mediaPlayer.getCurrentPosition()));
               seekBar.setProgress(mediaPlayer.getCurrentPosition());
               mSeekbarUpdateHandler.postDelayed(this, 50);
           }
       };
       mSeekbarUpdateHandler.postDelayed(mUpdateSeekbar, 0);

       btn_cancel_counter.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               constraint_nav_counter.setVisibility(View.GONE);
               counterNum=1;
               txt_counter.setText(counterNum+"");

               isPlayDialogDetails(null,0);

           }
       });

       btn_add_counter.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               counterNum++;
               txt_counter.setText(counterNum+"");
           }
       });
       btn_remove_counter.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(counterNum>1)
               { counterNum--;
               txt_counter.setText(counterNum+"");}
           }
       });

       btn_play_counter.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(counterNum_new==0||!counterIsEmpty){
                   if (!counterIsEmpty){
                       btn_add_counter.setVisibility(View.VISIBLE);
                       btn_remove_counter.setVisibility(View.VISIBLE);
                       counterNum=Integer.parseInt(txt_counter.getText().toString());
                       txt_counter.setText(counterNum+"");
                       counterIsplay =0;
                       Tool.displayImageDrawable(getContext(), btn_play_counter, R.drawable.run_player_icon);

                   }else {
                   counterIsplay =1;
                   Tool.displayImageDrawable(getContext(), btn_play_counter, R.drawable.pause_player_icon);
                   btn_add_counter.setVisibility(View.GONE);
                   btn_remove_counter.setVisibility(View.GONE);

                   isPlayDialogDetails(_buttonTile,counterNum);
                   }
               }

           }
       });


   };


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mediaPlayer.stop();
        pageInterface.isPlayer(true,false);

    }

    private void stopAudio(){

        seekbarHint.setVisibility(View.GONE);
        seekBar.setVisibility(View.GONE);
        mediaPlayer.stop();
        Tool.displayImageDrawable(getContext(), run_player_icon, R.drawable.run_player_icon);
        pageInterface.isPlayer(false,false);
        mediaPlayer = Tool.getAudioPage(getContext(),pageNum);
        seekBar.setMax(mediaPlayer.getDuration());
        txtTitlePage.setText(Tool.getPageTitle(pageNum));
        seekBar.setProgress(0);
        stop_player_icon.setVisibility(View.GONE);
        isPause=false;
    }
    private void startAudio(){
        mediaPlayer.start();
        seekBar.setProgress(mediaPlayer.getCurrentPosition());
        pageInterface.isPlayer(true,false);
        seekBar.setVisibility(View.VISIBLE);
        stop_player_icon.setVisibility(View.VISIBLE);
        Tool.displayImageDrawable(getContext(), run_player_icon, R.drawable.pause_player_icon);
    }

    private void pauseAudio(){
        mediaPlayer.pause();
        isPause=true;
        pageInterface.isPlayer(false,true);
        Tool.displayImageDrawable(getContext(), run_player_icon, R.drawable.run_player_icon);
    }

    public static void OnLongClickListeners(boolean state, String buttonTile) {
        if (state==true) {
            constraint_nav_counter.setVisibility(View.VISIBLE);
            _buttonTile=buttonTile;
        }

    }
    private void isPlayDialogDetails(String buttonTile,int num) {

        if(num!=0){

            mediaPlayer = MediaPlayer.create(getContext(), Tool.getAudioFileByTitle(buttonTile));
            final int[] count = {num};
            pageInterface.isPlayer(true,false);
            counterIsEmpty=false;
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                 if (count[0]>1) {
                     if(counterIsplay==0){
                            pageInterface.isPlayer(false,false);
                            mediaPlayer = Tool.getAudioPage(getContext(),pageNum);
                            seekBar.setMax(mediaPlayer.getDuration());
                            counterIsEmpty=true;
                            return;
                        }

                        mediaPlayer.start();
                        count[0]--;
                        txt_counter.setText(count[0] + "");
                    } else {
                        constraint_nav_counter.setVisibility(View.GONE);
                        counterNum=1;
                        counterNum_new=0;
                        counterIsEmpty=true;
                        Tool.displayImageDrawable(getContext(), btn_play_counter, R.drawable.run_player_icon);
                        pageInterface.isPlayer(false,false);
                        btn_add_counter.setVisibility(View.VISIBLE);
                        btn_remove_counter.setVisibility(View.VISIBLE);
                    }
                }
            });
            mediaPlayer.start();
            mediaPlayer = Tool.getAudioPage(getContext(),pageNum);
            seekBar.setMax(mediaPlayer.getDuration());

        }
    }

    }
