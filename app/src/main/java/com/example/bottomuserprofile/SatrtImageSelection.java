package com.example.bottomuserprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

public class SatrtImageSelection extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satrt_image_selection);


        imageView =findViewById(R.id.setImage);
        Bitmap bmp = this.getIntent().getParcelableExtra("image");
    }
}
