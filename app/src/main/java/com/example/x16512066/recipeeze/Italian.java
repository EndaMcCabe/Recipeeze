package com.example.x16512066.recipeeze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.x16512066.recipeeze.R;

public class Italian extends AppCompatActivity {
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian);

        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGrilledCheese();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomemadeMarinara();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRoastedMushroom();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpaghettiCarbonara();
            }
        });

    }

    public void openGrilledCheese() {
        Intent intent = new Intent(this, GrilledCheese.class);
        startActivity(intent);
    }
    public void openHomemadeMarinara() {
        Intent intent = new Intent(this, HomemadeMarinara.class);
        startActivity(intent);
    }
    public void openRoastedMushroom() {
        Intent intent = new Intent(this, RoastedMushroom.class);
        startActivity(intent);
    }
    public void openSpaghettiCarbonara() {
        Intent intent = new Intent(this, SpaghettiCarbonara.class);
        startActivity(intent);
    }



}





