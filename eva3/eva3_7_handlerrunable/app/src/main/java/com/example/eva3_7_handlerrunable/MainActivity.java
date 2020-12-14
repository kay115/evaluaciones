package com.example.eva3_7_handlerrunable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tx;
    int i;

    Handler h = new Handler();
    Runnable g= new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                h.post(g2);
                Log.wtf("hilo", i + "");
                i++;
            }
        }
    };
    Runnable g2 = new Runnable() {
        @Override
        public void run() {
            tx.append("valor i=" + i + "\n");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx=findViewById(R.id.t);

        Thread h=new Thread(g);
        hz.start();
    }
}