package com.example.eva2_7_activityresult;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class infoactivity extends AppCompatActivity {

    EditText eddatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoactivity);
        eddatos = findViewById(R.id.eddatos);
    }

    public void onClick2(View w){
        Intent intent = new Intent();
        String scade = eddatos.getText().toString();
        intent.putExtra("datos",scade);
        setResult(Activity.RESULT_OK,intent);
        finish();

    }
}