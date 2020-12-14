package com.example.eva3_3_runable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                    Log.wtf("runnable", i + "");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Thread thread = new Thread(runnable);
            thread.start();
            Mirunnable run2 = new Mirunnable();
            Thread thread1 = new Thread(run2);
            thread1.start();

        }
    }

class Mirunnable implements Runnable{
    @Override
    public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                    Log.wtf("runnable 2", i + "");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}