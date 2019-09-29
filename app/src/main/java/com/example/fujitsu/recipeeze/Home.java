package com.example.x16512066.recipeeze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Home extends AppCompatActivity {
    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Buttons
        Button discBtn =(Button) findViewById(R.id.discBtn);
        Button countBtn =(Button) findViewById(R.id.countBtn);
        Button photoBtn =(Button) findViewById(R.id.photoBtn);
        Button forumBtn =(Button) findViewById(R.id.forumBtn);

        //Button functions
        discBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Discoveries.class));
            }
        });
        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CalorieCounter.class));
            }
        });
        photoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PhotoAnalyser.class));
            }
        });
        forumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Forum.class));
            }
        });

        //Slider code
        v_flipper = findViewById(R.id.v_flipper);
        int images[] = {R.drawable.slide1, R.drawable.slide2, R.drawable.slide3};
        for(int i = 0;1<images.length;i++){
            flipperImages(images[i]);
        }
        for(int image:images){
            flipperImages(image);
        }
    }


        //more slider code
    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.Sharing:
            Intent intent1= new Intent(this, Sharing.class);
            this.startActivity(intent1);
            return true;
            case R.id.Discoveries:
                Intent intent2 = new Intent(this, Discoveries.class);
                this.startActivity(intent2);
                return true;
            case R.id.CalorieCounter:
                Intent intent3 = new Intent(this, CalorieCounter.class);
                this.startActivity(intent3);
                return true;
            case R.id.Forum:
                Intent intent4 = new Intent(this, Forum.class);
                this.startActivity(intent4);
                return true;
            case R.id.PhotoAnalyser:
                Intent intent5 = new Intent(this, PhotoAnalyser.class);
                this.startActivity(intent5);
                return true;
                default:
                    return super.onOptionsItemSelected(item);

        }

    }
}
