package com.example.eva2_6_poermisos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:5554"));
    }
    public void onClick(View w){
        startActivity(intent);
    }
}