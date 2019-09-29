package com.example.x16512066.recipeeze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.x16512066.recipeeze.R;

public class Vegan extends AppCompatActivity {
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegan);
        button13 = (Button) findViewById(R.id.button13);
        button14= (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRoastedBrocolli();
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSesameSoyNoodles();
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMashedCauliflower();
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRoastedBrussels();
            }
        });

    }

    public void openRoastedBrocolli() {
        Intent intent = new Intent(this, RoastedBrocolli.class);
        startActivity(intent);
    }
    public void openSesameSoyNoodles() {
        Intent intent = new Intent(this, SesameSoyNoodles.class);
        startActivity(intent);
    }
    public void openMashedCauliflower() {
        Intent intent = new Intent(this, MashedCauliflower.class);
        startActivity(intent);
    }
    public void openRoastedBrussels() {
        Intent intent = new Intent(this, RoastedBrussels.class);
        startActivity(intent);
    }
}
