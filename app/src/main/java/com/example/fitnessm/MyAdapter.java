package com.example.fitnessm;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.zip.Inflater;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

        int row_index = -1;
    Context c;
    ArrayList<Model> models;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, null);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, final int position) {

        //mấy cái holder settext này là cho nó hiển thị ra ngay thằng trc khi click
        holder.mTitle.setText(models.get(position).getTitle());
        holder.mDes.setText(models.get(position).getDescription());
        holder.mImaeView.setImageResource(models.get(position).getImg());
        holder.dImageView.setImageResource(models.get(position).getImgAdd());
        holder.dDes.setText(models.get(position).getDescripAdd());
        //ad them
        holder.mDesKTT.setText(models.get(position).getDescriptionKTT());
        holder.mDesMTTTK.setText(models.get(position).getDescriptionMoTaKTT());

      /*  holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index= position;
                notifyDataSetChanged();
            }
        });

        if (row_index==position) {
            holder.linearLayout.setBackgroundColor(Color.RED);
        } else {
            holder.linearLayout.setBackgroundColor(Color.parseColor("#dddddd"));
        }*/
        //pass Activity

        //con cái hàm setitemclick này là m code lúc m click vào  hieu hiue,
        // may cai nay t hieu ,ok t chi mac cai cho nay ne
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {
                String gTitle = models.get(position).getTitle();
                String gDesc = models.get(position).getDescription();
                String gDescAdd = models.get(position).getDescripAdd();

                //add them 2 cai Des
                String gDescKTT = models.get(position).getDescriptionKTT();
                String gDescMTKTT = models.get(position).getDescriptionMoTaKTT();

                BitmapDrawable bitmapDrawable = (BitmapDrawable)holder.dImageView.getDrawable(); //t kb la thay cai moi tao vo, nen no cu ra cai hinh cu ừa r bên cái thằng another thêm code vô thôi
                Bitmap bitmap = bitmapDrawable.getBitmap();
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] bytes = stream.toByteArray();
////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ///Đổi màu click
                row_index= position;
                notifyDataSetChanged();
                //
                Intent intent  = new Intent(c, AnotherActivity.class);
                intent.putExtra("iTitle", gTitle);
                intent.putExtra("iDesc", gDesc);
                intent.putExtra("iDescAdd", gDescAdd);
                //ad them 2 cai Des
                intent.putExtra("iDescKTT", gDescKTT);
                intent.putExtra("iDescMTKTT", gDescMTKTT);
                intent.putExtra("iImage", bytes);
                c.startActivity(intent);




            }
        });

        //Đổi màu click
        Random random = new Random();
        /*int color = Color.argb(255, random.nextInt(256),random.nextInt(256),
                random.nextInt(256) );*/
        if (row_index==position) {
            holder.linearLayout.setBackgroundColor(Color.argb(255, random.nextInt(256),random.nextInt(256),
                    random.nextInt(256) ));
        } else {
            holder.linearLayout.setBackgroundColor(Color.parseColor("#dddddd"));
        }





       /* //activity khac
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {

                if (models.get(position).getTitle().equals("Vai")){

                }
               *//* if (models.get(position).getTitle().equals("Dumbbell Bench Press")){

                }
                if (models.get(position).getTitle().equals("Standing Cable Crossover")){

                }
                if (models.get(position).getTitle().equals("Dumbbell Incline Press")){

                }
                if (models.get(position).getTitle().equals("Barbell Incline Press")){

                }*//*

                Intent intent  = new Intent(c, AnotherActivity.class);
               *//* intent.putExtra("iTitle", gTitle);
                intent.putExtra("iDesc", gDesc);
                intent.putExtra("iImage", bytes);*//*
                c.startActivity(intent);
            }
        });*/

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
