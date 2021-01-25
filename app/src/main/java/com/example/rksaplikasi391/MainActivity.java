package com.example.rksaplikasi391;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText searchInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchInput = (EditText)findViewById(R.id.inp_search);
        searchInput.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                Intent i = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(i);
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

    }
    public void openSearchActivity(View view) {
        Intent i = new Intent(getApplicationContext(), SearchActivity.class);
        startActivity(i);
    }
}