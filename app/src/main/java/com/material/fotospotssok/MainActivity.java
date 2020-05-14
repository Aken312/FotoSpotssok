package com.material.fotospotssok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    Button BotonIniciarSesion =findViewById(R.id.BotonIniciarSesion);
    Button buttonregistrarse = findViewById(R.id.BotonRegistro);


    BotonIniciarSesion.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,MapActivity.class);
            startActivity(intent);
        }
    });
        buttonregistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SingupActivity.class);
                startActivity(intent);
            }
        });
}
}
