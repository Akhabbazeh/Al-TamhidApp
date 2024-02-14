package com.example.myapplication.features.ContentsFragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.features.ui.BaseFragment;


import java.util.ArrayList;


public class ContentsFragment extends BaseFragment {
    private ImageView ButtonBack;
    public ContentsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view_6 = LayoutInflater.from(getContext()).inflate(R.layout.fragment_contents, container, false);
        setNotificationBarColor(R.color.primary_color);

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

        ButtonBack = view_6.findViewById(R.id.ButtonBack);
        ButtonBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        ArrayList<ContainerModul> Containersdata= new ArrayList<>();
        Containersdata.add(new ContainerModul(1,"الحروف حسب ترتيبها مخارجها",11));
        Containersdata.add(new ContainerModul(2,"الحروفٌ اللَّثويَّة",15));
        Containersdata.add(new ContainerModul(3,"الهَمْسُ",16));
        Containersdata.add(new ContainerModul(4,"التَّاء المبسوطَة والتَّاء المربوطَة ",18));
        Containersdata.add(new ContainerModul(5,"القَلْقَةُ",19));
        Containersdata.add(new ContainerModul(6,"التَّفخيم والتَّرقيق",21));
        Containersdata.add(new ContainerModul(7,"هَمْزةُ الوصلِ",29));
        Containersdata.add(new ContainerModul(8,"لامُ (أَلِ) التعريفِ",31));
        Containersdata.add(new ContainerModul(9,"المُدودُ",35));
        Containersdata.add(new ContainerModul(10,"الغُنّةُ",41));
        Containersdata.add(new ContainerModul(11,"التّنوينُ",44));
        Containersdata.add(new ContainerModul(12,"علاماتُ ضبطِ المصحفِ الشَّريفِ",47));
        Containersdata.add(new ContainerModul(13,"أمثلة عن الفرق بين الرسمين العثماني والإملائي",50));
        Containersdata.add(new ContainerModul(14,"أمثلة تطبيقية من جزء عمَّ",51));




        RecyclerView RecycleContainer  = (RecyclerView) view_6.findViewById(R.id.RecyclerView_container);
        RecyclewAdapterContainer adapterContainer = new RecyclewAdapterContainer(fragmentManager,getContext(), Containersdata);
        RecycleContainer.setLayoutManager(new LinearLayoutManager(getContext()));
        RecycleContainer.setAdapter(adapterContainer);
        RecycleContainer.setHasFixedSize(true);

        return view_6;






    }



}
