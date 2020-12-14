package com.example.eva3_8_banner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    int ind = 0;
    int[] imgs = {R.drawable.f1,R.drawable.f2,R.drawable.f3};
    Handler h= new Handler();
    Runnable r = new Runnable() {
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                h.post(r2);
            }
        }
    };
    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            img.setImageResource(imgs[ind]);
            if(ind==3){
                ind=0;
            }else{
                ind++;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=findViewById(R.id.imageView);

        Thread t= new Thread(r2);
        t.start();
    }
}