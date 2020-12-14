package com.example.eva2_5_bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list =;
        String[] datos ={
                "delicias",
                "delicias",
                "delicias",
                "delicias",
                "delicias",
                "delicias",
                "delicias",
                "delicias",
                "delicias",
        };
         list = findViewById(R.id.d);
         list.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datos ));

         list.setOnItemLongClickListener(new adapter);
    }
}