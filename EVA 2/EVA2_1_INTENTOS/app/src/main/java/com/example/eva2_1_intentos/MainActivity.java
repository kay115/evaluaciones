package com.example.eva2_1_intentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String stel="4456875";
        intent = new Intent(Intent.ACTION_DIAL, Uri.parse(stel));
    }

    public void
}