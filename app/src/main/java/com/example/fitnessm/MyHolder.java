package com.example.fitnessm;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public CardView linearLayout;
    public LinearLayout linearLayoutRe; //animation
    ImageView mImaeView, dImageView;
    TextView mTitle, mDes, dDes, mDesKTT, mDesMTTTK;
    ItemClickListener itemClickListener;

    @SuppressLint("ResourceType")
    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.linearLayoutRe = itemView.findViewById(R.id.linearLayout); //animation
        this.linearLayout = itemView.findViewById(R.id.rowlayout);//Đổi màu click

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
