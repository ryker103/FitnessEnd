package com.example.fitnessm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList()
    {
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Nguc Tren");
        m.setDescription("Kha nang do nha");
        m.setImg(R.drawable.ngucchuan);
        models.add(m);

        m = new Model();
        m.setTitle("Nguc Giua");
        m.setDescription("Kha nang do nha");
        m.setImg(R.drawable.ngucgiuatadon);
        models.add(m);

        m = new Model();
        m.setTitle("Nguc duoi");
        m.setDescription("Kha nang do nha");
        m.setImg(R.drawable.ngucduoi);
        models.add(m);

        m = new Model();
        m.setTitle("Nguc tren ngang");
        m.setDescription("Kha nang do nha");
        m.setImg(R.drawable.nguctrentangang);
        models.add(m);

        return models;
    }
}
