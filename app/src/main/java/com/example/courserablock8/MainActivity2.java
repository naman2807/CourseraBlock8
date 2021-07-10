package com.example.courserablock8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        float rating = getIntent().getFloatExtra("Value", 0);
        TextView textView = findViewById(R.id.text);
        textView.setText(String.format("Welcome to second activity. Your rating is: %s", rating));
    }
}