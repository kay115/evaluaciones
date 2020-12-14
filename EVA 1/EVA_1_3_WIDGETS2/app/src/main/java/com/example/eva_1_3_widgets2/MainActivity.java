package com.example.eva_1_3_widgets2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declarar un objeto del mismo tipo del widget a modificar
    TextView txtvwholamundo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //NO EXISTE LA INTERFAZ GRAFICA
        setContentView(R.layout.activity_main);
        //YA EXISTE LA INTERFAZ GRAFICA
        //VINCULAR COMPONENTE
        txtvwholamundo = findViewById(R.id.txtvwdatos);
        txtvwholamundo.setText("Primer widget de android");

    }
}