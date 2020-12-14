
package com.example.eva3_2_cvlasethread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread h = new Thread(){
            @Override
            public void run() {
                super.run();
                for (int i = 0; 1 < 10; i++) {
                    try {
                        Thread.sleep(1000);
                        Log.wtf("h", i + "");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        h.start();

        Thread mihilote = new mihilote();
        mihilote.start();
    }
}
class mihilote extends Thread {
    @Override
    public void run() {
        super.run();

        for (int i = 0; 1 < 10; i++) {
            try {
                Thread.sleep(1000);
                Log.wtf("h", i + "");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
