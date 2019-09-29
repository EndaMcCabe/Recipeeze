package com.example.x16512066.recipeeze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chinese extends AppCompatActivity {
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);

        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSzechuanStirFry();
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChowMein();
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKungPaoChicken();
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHoisinPorkRibs();
            }
        });

    }

    public void openSzechuanStirFry() {
        Intent intent = new Intent(this, SzechaunStirFry.class);
        startActivity(intent);
    }
    public void openChowMein() {
        Intent intent = new Intent(this, ChowMein.class);
        startActivity(intent);
    }
    public void openKungPaoChicken() {
        Intent intent = new Intent(this, KungPaoChicken.class);
        startActivity(intent);
    }
    public void openHoisinPorkRibs() {
        Intent intent = new Intent(this, HoisinPorkRibs.class);
        startActivity(intent);
    }
}
