package com.example.x16512066.recipeeze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.x16512066.recipeeze.R;

public class Glutenfree extends AppCompatActivity {
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glutenfree);

        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHarissaChicken();
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYorkshirePudding();
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuinoaTabbouleh();
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCarrotCake();
            }
        });

    }

    public void openHarissaChicken() {
        Intent intent = new Intent(this, HarissaChicken.class);
        startActivity(intent);
    }
    public void openYorkshirePudding() {
        Intent intent = new Intent(this, YorkshirePudding.class);
        startActivity(intent);
    }
    public void openQuinoaTabbouleh() {
        Intent intent = new Intent(this, QuinoaTabbouleh.class);
        startActivity(intent);
    }
    public void openCarrotCake() {
        Intent intent = new Intent(this, CarrotCake.class);
        startActivity(intent);
    }
}
