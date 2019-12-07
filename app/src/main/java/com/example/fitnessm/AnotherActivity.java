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

    TextView mTitleTv, mDesTv, mDesTvAdd, mDesKTT, mDesMTKTT;  //de t thu lam m coi dung k nha
    ImageView mImaeView, mImaeViewAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        ActionBar actionBar = getSupportActionBar();

        mTitleTv = findViewById(R.id.titleAno);
        mDesTv = findViewById(R.id.description);
        mImaeView = findViewById(R.id.imageView);
        mDesTvAdd= findViewById(R.id.descriptionAdd);
        mImaeViewAdd= findViewById(R.id.imageView);
        //add them 2 Des
        mDesKTT= findViewById(R.id.descriptionKTT);
        mDesMTKTT= findViewById(R.id.descriptionMTKTT);

        //lấy dữ liệu từ intent và đưa dữ liệu ra
        Intent intent = getIntent();

        String mTitle = intent.getStringExtra("iTitle");
        String mDescription = intent.getStringExtra("iDesc");

        String mDescriptionAdd = intent.getStringExtra("iDescAdd");

        String mDescriptionKTT = intent.getStringExtra("iDescKTT");

        String mDescriptionMTKTT = intent.getStringExtra("iDescMTKTT");

        byte[] mBytes = getIntent().getByteArrayExtra("iImage");

        //decode image từ previous activity

        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes,0, mBytes.length);

        actionBar.setTitle(mTitle);

        mTitleTv.setText(mTitle);
        mDesTv.setText(mDescription);
        mDesTvAdd.setText(mDescriptionAdd);

        mDesKTT.setText(mDescriptionKTT);
        mDesMTKTT.setText(mDescriptionMTKTT);

        mImaeViewAdd.setImageBitmap(bitmap);
    }
}
