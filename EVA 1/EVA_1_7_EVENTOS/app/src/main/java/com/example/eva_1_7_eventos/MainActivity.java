package com.example.eva_1_7_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.concurrent.locks.Lock;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btninlistener,btnclaseanon;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btninlistener = findViewById(R.id.btninlistener);
        btninlistener.setOnClickListener(this);
        btnclaseanon = findViewById(R.id.btnclaseanon);
        //final Context context = getApplicationContext();
        btnclaseanon.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(/*context*/getApplicationContext(), "evento por clase anonima", Toast.LENGTH_SHORT).show();
                    }
                }
        );

    }

    //este evento vuelve a main activity un listener
    @Override
    public void onClick(View view) {
        Toast.makeText(this, "evento por interfaz", Toast.LENGTH_SHORT).show();
    }

    //evento click
    public void miClick(View v){
        Toast.makeText(this, "hola mundo", Toast.LENGTH_SHORT).show();
        Log.wtf("mensaje","falla catastrofica");

    }

}
