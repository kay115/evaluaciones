package com.example.eva3_5_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datos = findViewById(R.id.txtview);

        Thread hilo = new Thread(){
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    try {
                        Thread.sleep( 1000);
                        Log.wtf("runnable", i + "");
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                    Log.wtf("hilo",i+"");
                    datos.append(i+ "\n");
                    i++;
                }
            }
        };
        hilo.start();
    }
}