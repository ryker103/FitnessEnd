package com.example.fitnessm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BackgroudActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backgroud);
    }
    public void list(View View)
    {
        Intent intent = new Intent(BackgroudActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
