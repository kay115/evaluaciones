package com.example.eva2_8_permisos;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Intent intent;
    final int PERMISO_LLAMAR=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.editTextTextPersonName2);

    if(ContextCompat.checkSelfPermission(this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
        ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CALL_PHONE}, PERMISO_LLAMAR);
    }
    }

    public void llamar(View v){
        String stel="tel" + et.getText().toString();
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(stel));
        startActivity(intent);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        
    }
}