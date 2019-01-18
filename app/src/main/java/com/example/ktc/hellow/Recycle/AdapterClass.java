package com.example.ktc.hellow.Recycle;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ktc.hellow.MainActivity;
import com.example.ktc.hellow.R;

import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.holder> {
        List<Item> itemList;


    public AdapterClass(List<Item> itemList) {
        this.itemList = itemList;

    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        return new holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int i) {
                Item row=itemList.get(i);
                holder.title.setText(row.getTitle());
                holder.subtitle.setText(row.getSubtitle());
                holder.img.setImageResource(row.getImageId());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class holder extends RecyclerView.ViewHolder {
        public TextView title,subtitle;
        public ImageView img;

        public holder(@NonNull View itemView) {
            super(itemView);
            title =  itemView.findViewById(R.id.title);
            this.subtitle = itemView.findViewById(R.id.subtitle);
            this.img = itemView.findViewById(R.id.img);

        }
    }
}
