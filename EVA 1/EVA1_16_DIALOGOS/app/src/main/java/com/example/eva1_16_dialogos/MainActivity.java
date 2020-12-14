package com.example.eva1_16_dialogos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.util.LogPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onShowAlertDialog(View v){
        new AlertDialog.Builder(this)
        .setTitle("Cuadro de dialogo android")
                .setMessage("Cuadro del sistema")
                .setIcon(R.drawable.ic_launcher_foreground)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.wtf("Alert Dialog","Yes");
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.wtf("Alert Dialog","No");
                    }
                })
                .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.wtf("Alert Dialog","Cancel");
                    }
                });

    }

   public void onShowAlertDialog(View v){
        final Dialog cd = new Dialog("This");
        cd.setContentView(R.layout.mi_dialogo);
       TextView txtvw;
       txtvw = cd.findViewById(R.id.txtvwtit);
       Button btnk;
       btnk = cd.findViewById(R.id.btnk);
   }
}