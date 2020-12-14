package com.example.eva__8_radioroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdgrpcomida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdgrpcomida = findViewById(R.id.rdgrpcomida);
        rdgrpcomida.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        RadioButton radiobutton = findViewById(i);
                        Toast.makeText(getApplicationContext(), radiobutton.getText()   , Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}