package com.material.fotospotssok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import afu.org.checkerframework.checker.igj.qual.I;

public class SingupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);

        Button buttonregistrarse = findViewById(R.id.BotonRegistrooo);


        buttonregistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingupActivity.this,MapActivity.class);
                startActivity(intent);
            }
        });
    }

}
