package com.example.bredge.fallow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bredge.R;
import com.example.bredge.utils.MyGlide;

import java.util.ArrayList;

public class FallowAdapter extends RecyclerView.Adapter<FallowAdapter.MYview> {
    private Context context;
    ArrayList<FallowModel> list;

    public FallowAdapter(Context context, ArrayList<FallowModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MYview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MYview(LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull MYview holder, int position) {
        holder.fallow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.fallow.setText("UnFollow");
                holder.fallow.setBackgroundResource(R.drawable.cm_background);
                holder.fallow.setTextColor(context.getResources().getColor(R.color.Primary_color2));
            }
        });
        holder.uname.setText(list.get(position).user_name);
        MyGlide.with(context, list.get(position).user_images, holder.ImageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MYview extends RecyclerView.ViewHolder {
        TextView fallow, uname;
        ImageView ImageView;

        public MYview(@NonNull View itemView) {
            super(itemView);
            fallow = itemView.findViewById(R.id.fallow);
            ImageView = itemView.findViewById(R.id.img2);
            uname = itemView.findViewById(R.id.uname);
        }
    }
}
