package com.example.myapplication.features.ContentsFragment;


import static android.app.PendingIntent.getActivity;

import android.content.Context;
import android.os.Bundle;
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
                       sendPageNumber(0);
                    }
                        break; // break is optional
                    case 1 :
                    {
                        sendPageNumber(4);
                    }
                    break;
                    case 2 :
                    {
                        sendPageNumber(5);

                    }
                    break;
                    case 3 :
                    {
                        sendPageNumber(7);

                    }
                    break;
                    case 4 :
                    {
                        sendPageNumber(8);

                    }
                    break;
                    case 5 :
                {
                    sendPageNumber(10);

                }
                break;
                    case 6 :
                    {
                        sendPageNumber(18);

                    }
                    break;
                    case 7 :
                    {
                        sendPageNumber(20);

                    }
                    break;
                    case 8 :
                {
                    sendPageNumber(24);

                }
                break;
                    case 9 :
                    {
                        sendPageNumber(28);

                    }
                    break;
                    case 10 :
                    {
                        sendPageNumber(31);

                    }
                    break;
                    case 11 :
                    {
                        sendPageNumber(37);

                    }
                    break;
                    case 12 :
                    {
                        sendPageNumber(39);

                    }
                    break;
                    case 13 :
                    {
                        sendPageNumber(41);

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


}

     private void sendPageNumber(int position){
         pagesFragment pagesFragment = new pagesFragment();

         Bundle bundle = new Bundle();
         bundle.putInt("Position", position);

         pagesFragment.setArguments(bundle);

         fragmentManager.beginTransaction()
                 .replace(R.id.FrameLayout_main_activity, pagesFragment, "pagesFragment")
                 .addToBackStack("pagesFragment")
                 .commit();


     }

}


