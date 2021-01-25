package com.example.rksaplikasi391;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MerchantActivity extends AppCompatActivity {
    String text1 = "<font color=#000000><b>4.9 &nbsp &nbsp 500 m &nbsp &nbsp</b>(10min)</font>";
    String text2 = "<font color=#1F981C><b>Buka </b></font><font color=#000000> hingga 22.00 hari ini</font>";
    public TextView ratingDist, timeOpen;
    public ImageView imgBack;
    public Button btnAdd1, btnAdd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchant);
        imgBack = (ImageView)findViewById(R.id.back);
        imgBack.setOnClickListener(v -> {
            finish();
        });

        ratingDist = (TextView) findViewById(R.id.rating_distance);
        ratingDist.setText(Html.fromHtml(text1));
        timeOpen = (TextView) findViewById(R.id.time_open);
        timeOpen.setText(Html.fromHtml(text2));
    }
    public void toCheckOut(View view){
        Intent intent = new Intent(getApplicationContext(), CheckOutActivity.class);
        startActivity(intent);
    }
}