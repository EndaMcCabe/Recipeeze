package com.example.x16512066.recipeeze;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static android.app.Activity.RESULT_OK;
import static android.os.Environment.getExternalStoragePublicDirectory;
import static android.provider.MediaStore.ACTION_IMAGE_CAPTURE;

public class vision_camera extends AppCompatActivty{

    private Object Bitmap;

    protected void onCreate(Bundle savedInstanceState) {

        Button btnTakePic;
        ImageView imageView;
        String pathToFile;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.vision_camera);
        btnTakePic = findViewById(R.id.btnTakePic);
        btnTakePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dispatchPictΩureTakenAction();
            }
        });
        imageView = findViewById(R.id.image);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        String pathToFile = null;
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            if(requestCode == 1){
                android.graphics.Bitmap bitmap = BitmapFactory.decodeFile(pathToFile);
                ImageView.setImageBitmap(Bitmap);
            }
        }
    }


    private void dispatchPictΩureTakenAction() {
        String pathToFile;
        Intent takePic = new Intent(ACTION_IMAGE_CAPTURE);
        if(takePic.resolveActivity(getPackageManager()) != null){
            File photoFile = null;
            photoFile = createPhotoFile();

            if(null != photoFile){
                pathToFile = photoFile.getAbsolutePath();
                Uri photoUri = FileProvider.getUriForFile(MainActivity.this, "fssdfs", photoFile);
                takePic.putExtra(MediaStore.EXTRA_OUTPUT, photoUri);

            }
        }
    }

    private File createPhotoFile() {
        String name = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File storageDir = getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        File image = null;
        try {
            image = File.createTempFile(name, ".jpg", storageDir);
        } catch (IOException e) {
            Log.d("mylog", "Excep : " + e.toString());
        }
        return image;
    }
}
