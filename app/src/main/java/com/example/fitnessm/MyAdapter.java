package com.example.fitnessm;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.zip.Inflater;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

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
    public void onBindViewHolder(@NonNull final MyHolder holder, int position) {

        //mấy cái holder settext này là cho nó hiển thị ra ngay thằng trc khi click
        holder.mTitle.setText(models.get(position).getTitle());
        holder.mDes.setText(models.get(position).getDescription());
        holder.mImaeView.setImageResource(models.get(position).getImg());
        holder.dImageView.setImageResource(models.get(position).getImgAdd());
        holder.dDes.setText(models.get(position).getDescripAdd());
        ///

        //pass Activity

        //con cái hàm setitemclick này là m code lúc m click vào  hieu hiue,
        // may cai nay t hieu ,ok t chi mac cai cho nay ne
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {
                String gTitle = models.get(position).getTitle();
                String gDesc = models.get(position).getDescription();
                String gDescAdd = models.get(position).getDescripAdd();
                BitmapDrawable bitmapDrawable = (BitmapDrawable)holder.dImageView.getDrawable(); //t kb la thay cai moi tao vo, nen no cu ra cai hinh cu ừa r bên cái thằng another thêm code vô thôi
                Bitmap bitmap = bitmapDrawable.getBitmap();
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] bytes = stream.toByteArray();

                //
                Intent intent  = new Intent(c, AnotherActivity.class);
                intent.putExtra("iTitle", gTitle);
                intent.putExtra("iDesc", gDesc);
                intent.putExtra("iDescAdd", gDescAdd);
                intent.putExtra("iImage", bytes);
                c.startActivity(intent);
            }
        });


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
