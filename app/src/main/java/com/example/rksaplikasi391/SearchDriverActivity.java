package com.example.rksaplikasi391;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class SearchDriverActivity extends AppCompatActivity {
    public ImageView imgNotif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_driver);
        imgNotif = (ImageView) findViewById(R.id.img_gotnotif);
        imgNotif.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), DeliveryProgress.class);
            startActivity(intent);
        });
    }
}