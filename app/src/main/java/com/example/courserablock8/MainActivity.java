package com.example.courserablock8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enter(View v){
        RatingBar ratingBar = findViewById(R.id.rating);
        float rating = ratingBar.getRating();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("Value","Rating is: " + rating);
        startActivity(intent);
    }
}