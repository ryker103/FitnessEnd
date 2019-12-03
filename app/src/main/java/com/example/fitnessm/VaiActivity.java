package com.example.fitnessm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class VaiActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vai);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }

        private ArrayList<Model> getMyList()
        {
            ArrayList<Model> models = new ArrayList<>();

            Model m = new Model();
            m.setTitle("Vai");
            m.setDescription("Kha nang do nha");
            m.setImg(R.drawable.vaia);
            models.add(m);

            m = new Model();
            m.setTitle("Nguc Giua");
            m.setDescription("Kha nang do nha");
            m.setImg(R.drawable.vaib);
            models.add(m);

            m = new Model();
            m.setTitle("Nguc duoi");
            m.setDescription("Kha nang do nha");
            m.setImg(R.drawable.vaic);
            models.add(m);

            m = new Model();
            m.setTitle("Nguc tren ngang");
            m.setDescription("Kha nang do nha");
            m.setImg(R.drawable.vaid);
            models.add(m);

            return models;
        }
    }