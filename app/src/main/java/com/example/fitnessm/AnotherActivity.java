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

    TextView mTitleTv, mDesTv, mDesTvAdd;  //de t thu lam m coi dung k nha
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
        mImaeViewAdd= findViewById(R.id.imageView); //phai cai nay k ta đúng r

        //lấy dữ liệu từ intent và đưa dữ liệu ra
        Intent intent = getIntent();

        String mTitle = intent.getStringExtra("iTitle");
        String mDescription = intent.getStringExtra("iDesc");

        String mDescriptionAdd = intent.getStringExtra("iDescAdd");

        byte[] mBytes = getIntent().getByteArrayExtra("iImage");

        //decode image từ previous activity

        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes,0, mBytes.length);

        actionBar.setTitle(mTitle);

        mTitleTv.setText(mTitle);
        mDesTv.setText(mDescription);
        mDesTvAdd.setText(mDescriptionAdd); //chay dc chua ta description add co string gi m tao chua
        mImaeViewAdd.setImageBitmap(bitmap);
    }
}
