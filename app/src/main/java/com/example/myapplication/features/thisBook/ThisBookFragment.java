package com.example.myapplication.features.thisBook;

import android.os.Bundle;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;


public class ThisBookFragment extends BaseFragment {

    TextView this_book_words_text;
    GridView grid_View_img_book;
    ImageView ButtonBack;
    String this_book_words_text_colors = "بابٌ يدخل منه فِلذةُ أكبادِنا إلى عالم القرآن الكريم، ليتفيّؤُوا ظِلالَهُ الوافِرَةَ ويُرتّلوا آياته العظيمة، ويتلونه حقّ تلاوته.\n" +
            "\n"+
            "أسلوبه ميسّر ومبسّط، حيث أنه يحوي في طيّاته تدريباتٍ عمليّةً، وأمثلةٍ عديدةٍ، ليُصبح الطالب بعد هذه الدُربَةِ العمليّة مطبقاً لأحكام التجويد الأساسية دون تكلُفٍ.\n";


    public ThisBookFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view_3 = LayoutInflater.from(getContext()).inflate(R.layout.fragment_this_book, container, false);
        setNotificationBarColor(R.color.primary_color);

        this_book_words_text = view_3.findViewById(R.id.this_book_words_text);
        grid_View_img_book = view_3.findViewById(R.id.grid_View_img_book);

        SpannableString spannableString=new SpannableString(this_book_words_text_colors);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(R.color.primary_color));
        ForegroundColorSpan foregroundColorSpan_1 = new ForegroundColorSpan(getResources().getColor(R.color.primary_color));

        spannableString.setSpan(foregroundColorSpan,0,4,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(foregroundColorSpan_1,130,150,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        this_book_words_text.setText(spannableString);

        int[] images = {R.drawable.book_img_1,R.drawable.book_img_2,R.drawable.book_img_3,
                R.drawable.book_img_4,R.drawable.book_img_5,R.drawable.book_img_6,
                R.drawable.book_img_7,R.drawable.book_img_8};

        AdapterGridView adapterGridView = new AdapterGridView(getContext(), images);
        grid_View_img_book.setAdapter(adapterGridView);

        ButtonBack = view_3.findViewById(R.id.ButtonBack);
        ButtonBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        return view_3;
    }



}
