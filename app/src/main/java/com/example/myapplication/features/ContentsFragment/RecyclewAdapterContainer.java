package com.example.myapplication.features.ContentsFragment;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.features.pages.pagesFragment;

import java.util.ArrayList;


class RecyclewAdapterContainer extends RecyclerView.Adapter<RecyclewAdapterContainer.ContainerHolder> {

   private Context context;
    private ArrayList<ContainerModul> Containersdata ;
    private FragmentManager fragmentManager;


    public RecyclewAdapterContainer(FragmentManager fragmentManager,Context context, ArrayList<ContainerModul> Containersdata) {
        this.context = context;
        this.Containersdata = Containersdata;
        this.fragmentManager = fragmentManager;

    }


    @NonNull
    @Override
    public RecyclewAdapterContainer.ContainerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list_container_title,parent,false);
        return new ContainerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclewAdapterContainer.ContainerHolder holder, int position) {
      holder.page_num.setText(Containersdata.get(position).getPage_num()+"");
        holder.titleContain.setText(Containersdata.get(position).getTitleContain());
        holder.title_num.setText(Containersdata.get(position).getTitle_num()+"");

        holder.Go_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position)
                {
                    case 0 :
                    {
                        fragmentManager.beginTransaction()
                                .replace(R.id.FrameLayout_main_activity, new pagesFragment(),"ThisBookFragment")
                                .addToBackStack("ThisBookFragment")
                                .commit();
                    }
                        break; // break is optional
                    case 1 :
                    {
                        Toast.makeText(context, "عند الضغط على هذا الزر سيتم الانتقال للصفحة 15", Toast.LENGTH_LONG).show();
                    }
                    break;
                    case 2 :
                    {
                        Toast.makeText(context, "عند الضغط على هذا الزر سيتم الانتقال للصفحة 16", Toast.LENGTH_LONG).show();

                    }
                    break;
                    case 3 :
                    {
                        Toast.makeText(context, "عند الضغط على هذا الزر سيتم الانتقال للصفحة 18", Toast.LENGTH_LONG).show();

                    }
                    break;
                    case 4 :
                    {
                        Toast.makeText(context, "عند الضغط على هذا الزر سيتم الانتقال للصفحة 19", Toast.LENGTH_LONG).show();

                    }
                    break;
                    case 5 :
                {
                    Toast.makeText(context, "عند الضغط على هذا الزر سيتم الانتقال للصفحة 21", Toast.LENGTH_LONG).show();

                }
                break;
                    case 6 :
                    {
                        Toast.makeText(context, "عند الضغط على هذا الزر سيتم الانتقال للصفحة 29", Toast.LENGTH_LONG).show();

                    }
                    break;
                    case 7 :
                    {
                        Toast.makeText(context, "عند الضغط على هذا الزر سيتم الانتقال للصفحة 31", Toast.LENGTH_LONG).show();

                    }
                    break;
                    case 8 :
                {
                    Toast.makeText(context, "عند الضغط على هذا الزر سيتم الانتقال للصفحة 35", Toast.LENGTH_LONG).show();

                }
                break;
                    case 9 :
                    {
                        Toast.makeText(context, "عند الضغط على هذا الزر سيتم الانتقال للصفحة 41", Toast.LENGTH_LONG).show();

                    }
                    break;
                    case 10 :
                    {
                        Toast.makeText(context, "عند الضغط على هذا الزر سيتم الانتقال للصفحة 44", Toast.LENGTH_LONG).show();

                    }
                    break;
                    case 11 :
                    {
                        Toast.makeText(context, "عند الضغط على هذا الزر سيتم الانتقال للصفحة 47", Toast.LENGTH_LONG).show();

                    }
                    break;
                    case 12 :
                    {
                        Toast.makeText(context, "عند الضغط على هذا الزر سيتم الانتقال للصفحة50", Toast.LENGTH_LONG).show();

                    }
                    break;
                    case 13 :
                    {
                        Toast.makeText(context, "عند الضغط على هذا الزر سيتم الانتقال للصفحة 51", Toast.LENGTH_LONG).show();

                    }
                    break;


                }

            }
        });




    }


    @Override
    public int getItemCount() {
        return Containersdata.size();
    }


    public class ContainerHolder extends RecyclerView.ViewHolder {
        TextView title_num;
        TextView titleContain;
        TextView page_num;
        ConstraintLayout Go_button;
        public ContainerHolder(@NonNull View itemView) {
            super(itemView);
             title_num = itemView.findViewById(R.id.title_num);
             titleContain = itemView.findViewById(R.id.titleContain);
             page_num = itemView.findViewById(R.id.page_num);
            Go_button = itemView.findViewById(R.id.Go_button);


        }
}}


