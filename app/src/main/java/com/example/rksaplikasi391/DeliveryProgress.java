package com.example.rksaplikasi391;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class DeliveryProgress extends AppCompatActivity {
    public ImageView imgProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_progress);

        imgProgress = (ImageView)findViewById(R.id.img_driver);
        imgProgress.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), ItemArrived.class);
            startActivity(intent);
        });

    }
}