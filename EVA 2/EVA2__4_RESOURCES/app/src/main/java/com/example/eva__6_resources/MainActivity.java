package com.example.eva__6_resources;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtvwdatos;
    ImageView imgvwclima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgvwclima = findViewById(R.id.imgvwclima);
        imgvwclima.setImageResource(R.drawable.cloudy);
        txtvwdatos = findViewById(R.id.txtvwdatos);
        txtvwdatos.setText(R.string.mis_Datos);

    }
}