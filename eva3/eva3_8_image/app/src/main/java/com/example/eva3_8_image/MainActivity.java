package com.example.eva3_8_image;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.renderscript.ScriptGroup;
import android.widget.ImageView;

import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    ImageView imgvw;
    Bitmap imgbit;

    Handler h = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            imgvw.setImageBitmap(imgbit);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgvw = findViewById(R.id.imgvw);

        Thread hi = new Thread() {
            @Override
            public void run() {
                super.run();
                imgbit = cargarimagen("https://www.mariowiki.com/images/thumb/2/21/Charizard_SSBU.png/1200px-Charizard_SSBU.png");
                Message msg = h.obtainMessage();
                h.sendMessage(msg);

            }
        };
        hi.start();

    }

    public Bitmap cargarimagen(String url) {
        try {
            InputStream is = (InputStream) new URL(url).getContent();
            Bitmap bitmap = BitmapFactory.decodeStream(is);
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}