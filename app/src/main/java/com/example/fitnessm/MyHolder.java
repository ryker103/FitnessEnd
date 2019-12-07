package com.example.fitnessm;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView mImaeView, dImageView;
    TextView mTitle, mDes, dDes, mDesKTT, mDesMTTTK;
    ItemClickListener itemClickListener;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.mImaeView = itemView.findViewById(R.id.imageIV);
        this.mTitle = itemView.findViewById(R.id.titleTV);
        this.mDes = itemView.findViewById(R.id.descriptionTV);
        this.dImageView = itemView.findViewById(R.id.imageIVAdd);
        this.dDes = itemView.findViewById(R.id.descriptionTVAdd);

        //add them 2 cai mo ta ky thuat tap
        this.mDesKTT = itemView.findViewById(R.id.descriptionKTT);
        this.mDesMTTTK = itemView.findViewById(R.id.descriptionmotaKTT);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        this.itemClickListener.onItemClickListener(v, getLayoutPosition());

    }

    public void setItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener = ic;
    }
}
