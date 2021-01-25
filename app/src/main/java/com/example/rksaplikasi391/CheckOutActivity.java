package com.example.rksaplikasi391;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class CheckOutActivity extends AppCompatActivity {
    int minteger = 0;
    public ImageButton imgBack;
    public Button btnOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
        btnOrder = (Button)findViewById(R.id.btnorder);
        btnOrder.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), SearchDriverActivity.class);
            startActivity(intent);
        });

        imgBack = (ImageButton) findViewById(R.id.backbutt);
        imgBack.setOnClickListener(v -> {
            finish();
        });
    }
    public void increaseInteger(View view) {
        minteger = minteger + 1;
        display(minteger);

    }public void decreaseInteger(View view) {
        minteger = minteger - 1;
        display(minteger);
    }
    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number);
        displayInteger.setText("" + number);
    }

}