package com.example.fitnessm;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> implements Filterable {

    int row_index = -1;
    Context c;
    ArrayList<Model> models;
    ArrayList<Model> modelsFilterable;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
        this.modelsFilterable = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, null);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, final int position) {

        //animation
        holder.linearLayoutRe.setAnimation(AnimationUtils.loadAnimation(c, R.anim.fade_scale_animation));


        //mấy cái holder settext này là cho nó hiển thị ra ngay thằng trc khi click
        holder.mTitle.setText(modelsFilterable.get(position).getTitle());
        holder.mDes.setText(modelsFilterable.get(position).getDescription());
        holder.mImaeView.setImageResource(modelsFilterable.get(position).getImg());
        holder.dImageView.setImageResource(modelsFilterable.get(position).getImgAdd());
        holder.dDes.setText(modelsFilterable.get(position).getDescripAdd());
        //ad them
        holder.mDesKTT.setText(modelsFilterable.get(position).getDescriptionKTT());
        holder.mDesMTTTK.setText(modelsFilterable.get(position).getDescriptionMoTaKTT());


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


    }

    @Override
    public int getItemCount() {
        return modelsFilterable.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                String Key = constraint.toString();
                if(Key.isEmpty())
                {
                    modelsFilterable = models;
                }

                else
                {
                    List<Model> lstFiltered = new ArrayList<>();
                    for (Model rows: models) {
                        if (rows.getTitle().toLowerCase().contains(Key.toLowerCase())) {
                            lstFiltered.add(rows);
                        }

                    }

                    modelsFilterable = (ArrayList<Model>) lstFiltered;

                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = modelsFilterable;
                return filterResults;


            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {

                modelsFilterable = (ArrayList<Model>) results.values;
                notifyDataSetChanged();
            }
        };
    }
}
