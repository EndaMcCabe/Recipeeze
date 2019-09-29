package com.example.x16512066.recipeeze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.x16512066.recipeeze.R;

public class Discoveries extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openItalian();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCh();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVe();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGf();
            }
        });

    }

    public void openItalian() {
        Intent intent = new Intent(this, Italian.class);
        startActivity(intent);
    }
    public void openCh() {
        Intent intent = new Intent(this, Chinese.class);
        startActivity(intent);
    }
    public void openVe() {
        Intent intent = new Intent(this, Vegan.class);
        startActivity(intent);
    }
    public void openGf() {
        Intent intent = new Intent(this, Glutenfree.class);
        startActivity(intent);
    }



}