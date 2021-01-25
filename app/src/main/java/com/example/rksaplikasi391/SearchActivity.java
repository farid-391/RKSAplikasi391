package com.example.rksaplikasi391;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SearchActivity extends AppCompatActivity {
    public ImageButton imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        imgBack = (ImageButton) findViewById(R.id.backbutt);
        imgBack.setOnClickListener(v -> {
            finish();
        });
    }
    public void opennext(View view){
        Intent intent = new Intent(getApplicationContext(), MerchantActivity.class);
        startActivity(intent);
    }
}