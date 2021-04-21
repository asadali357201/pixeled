package com.pixeledapp.pixeled;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class resultActivity extends AppCompatActivity {
    ImageView resultimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resultimage=findViewById(R.id.resultImage);
        resultimage.setImageURI(getIntent().getData());
        Toast.makeText(this, "Image Saved Successfully", Toast.LENGTH_LONG).show();
    }
}