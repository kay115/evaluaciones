package com.example.eva3_6_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx = findViewById(R.id.t);

        Thread hilo = new Thread() {
            @Override
            public void run() {
                super.run();
                int i = 0;
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Log.wtf("hilo", i + "");
                    tx.append(i + "\n");
                    i++;
                }
            }
        };
        hilo.start();
    }
}