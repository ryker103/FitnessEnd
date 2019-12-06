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
        m.setDescription("1 sets 12 reps khởi động với 45% trọng lượng  tạ lớn nhất bạn có thể thực hiện được chuẩn form (MW) trong 1reps. 1 sets 10 reps 55% MW. 3 sets chính với 70-80% MW, tập 8-10 reps.\n" +
                "\n" +
                "Nghỉ giữa các hiệp 60-90s (Tùy vào sức khỏe mỗi người). Cố gắng hoàn thành bài tập với chuẩn form nhất có thể. ");
        m.setImg(R.drawable.ngucchuan); //cai imgaeADd nay 0dp gio tao them 1 cai phai khong
        m.setDescripAdd("Quang Minh");
        m.setImgAdd(R.drawable.ngucduoi);
        models.add(m);

        m = new Model();
        m.setTitle("Nguc Giua");
        m.setDescription("cac");
        m.setImg(R.drawable.ngucgiuatadon);
        m.setImgAdd(R.drawable.chanb);
        models.add(m);



        return models;
    }
}
