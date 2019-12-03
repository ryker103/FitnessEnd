package com.example.fitnessm;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    TextView mTitleTv, mDesTv;
    ImageView mImaeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        ActionBar actionBar = getSupportActionBar();

        mTitleTv = findViewById(R.id.titleAno);
        mDesTv = findViewById(R.id.description);
        mImaeView = findViewById(R.id.imageView);

        //lấy dữ liệu từ intent và đưa dữ liệu ra
        Intent intent = getIntent();

        String mTitle = intent.getStringExtra("iTitle");
        String mDescription = intent.getStringExtra("iDesc");

        byte[] mBytes = getIntent().getByteArrayExtra("iImage");

        //decode image từ previous activity

        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes,0, mBytes.length);

        actionBar.setTitle(mTitle);

        mTitleTv.setText(mTitle);
        mDesTv.setText(mDescription);
        mImaeView.setImageBitmap(bitmap);
    }
}
