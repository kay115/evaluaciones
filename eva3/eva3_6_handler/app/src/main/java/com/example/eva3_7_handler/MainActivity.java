package com.example.eva3_7_handler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tx;
    Handler h = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            int i = (int) msg.obj;
            tx.append("hilo" + msg.what + "valor i=" + i + "\n");

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx = findViewById(R.id.txtvw);

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
                    Message msg = h.obtainMessage(1000, i);
                    h.sendMessage(msg);
                    Log.wtf("hilo", i + "");
                    i++;
                }
            }
        };
        hilo.start();
    }
}