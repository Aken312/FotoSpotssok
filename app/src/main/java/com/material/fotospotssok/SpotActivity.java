package com.material.fotospotssok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import afu.org.checkerframework.checker.igj.qual.I;

public class SpotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spots);
        Button Foto1 = findViewById(R.id.spot1);
        Button Foto2 = findViewById(R.id.spot2);
        Button Foto3 = findViewById(R.id.spot3);
        Button Foto4 = findViewById(R.id.spot4);
        Foto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SpotActivity.this,MapActivity.class);
                startActivity(intent);
            }
        });
        Foto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SpotActivity.this,MapActivity.class);
                startActivity(intent);
            }
        });
        Foto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SpotActivity.this,MapActivity.class);
                startActivity(intent);
            }
        });
        Foto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SpotActivity.this,MapActivity.class);
                startActivity(intent);
            }
        });

    }
}