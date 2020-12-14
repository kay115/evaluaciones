package com.example.eva1_9_idiomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdgrplng, rdgrpgender;
    RadioButton rdbtnspan, rdbtneng, rdmucho, rdpoco, rdnada;
    TextView lblnombre, lblapellido, lblsexo;
    EditText txtnombre, txtapellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdgrplng = findViewById(R.id.rdgrplng);
        rdgrpgender = findViewById(R.id.rdgrogender);
        rdbtnspan = findViewById(R.id.rdbtnspan);
        rdbtneng = findViewById(R.id.rdbtneng);
        rdmucho = findViewById(R.id.rdbtnmucho);
        rdpoco = findViewById(R.id.rdbtnpoco);
        rdnada = findViewById(R.id.rdbtnno);
        lblnombre = findViewById(R.id.lblnombre);
        lblapellido = findViewById(R.id.lblapellido);
        lblsexo = findViewById(R.id.lblsexo);
        txtnombre = findViewById(R.id.txtnombre);
        txtapellido = findViewById(R.id.txtapellido);


        rdgrplng.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        if(i == R.id.rdbtnspan){
                            rdbtnspan.setText(R.string.btn_es_español);
                            rdbtneng.setText("Inglés");
                            rdmucho.setText("mucho");
                            rdpoco.setText("poco");
                            rdnada.setText("no hay sexo");
                            lblnombre.setText(R.string.btn_es_inglés);
                            lblapellido.setText(R.string.btn_es_inglés);
                            lblsexo.setText(R.string.btn_es_inglés);
                            txtnombre.setText(R.string.btn_es_inglés);
                            txtapellido.setText(R.string.btn_es_inglés);
                        }
                        else if(i == R.id.rdbtneng){
                            rdbtnspan.setText(R.string.btn_en_español);
                            rdbtneng.setText(R.string.btn_en_inglés);
                            rdmucho.setText(R.string.btn_en_inglés);
                            rdpoco.setText(R.string.btn_en_inglés);
                            rdnada.setText(R.string.btn_en_inglés);
                            lblnombre.setText(R.string.btn_en_inglés);
                            lblapellido.setText(R.string.btn_en_inglés);
                            lblsexo.setText(R.string.btn_en_inglés);
                            txtnombre.setText(R.string.btn_en_inglés);
                            txtapellido.setText(R.string.btn_en_inglés);
                        }
                    }
                }
        );



        rdgrpgender.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        RadioButton radiobutton = findViewById(i);
                        Toast.makeText(getApplicationContext(),radiobutton.getText(), Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}