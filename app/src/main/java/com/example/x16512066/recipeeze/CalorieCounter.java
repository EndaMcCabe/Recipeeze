package com.example.x16512066.recipeeze;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CalorieCounter extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_counter);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

}
