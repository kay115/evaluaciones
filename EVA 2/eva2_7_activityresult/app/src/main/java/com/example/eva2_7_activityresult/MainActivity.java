package com.example.eva2_7_activityresult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final int INFO_ACTIVITY = 100;
    final int INFO_CONTACTOS = 200;
    final int INFO_IMAGENES = 300;
    ImageView ivimage;
    Intent intent;
    Intent intentContact;
    Intent intentImage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivimage = (R.id.iv1);
        intent = new Intent(this, infoactivity.class);
        intentContact = new Intent(intent.ACTION_PICK, android.provider.ContactsContract.Contacts.CONTENT_URI);
        intentImage = new Intent(intent.ACTION_PICK, xandroid.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    }

    public void onClick(View w) {
        startActivityForResult(intent, INFO_ACTIVITY);
    }

    public void onClickContent(View w){
        startActivityForResult(intentContact, INFO_CONTACTOS);
    }

    public void onClickImage(View w)   {
        startActivityForResult(intentImage,INFO_IMAGENES);
    }


    @Override   
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode) {
            case INFO_ACTIVITY:
                if(resultCode == Activity.RESULT_OK) {
                    Toast.makeText(this, data.getStringExtra("DATOS"), Toast.LENGTH_LONG).show());
                }
                break;

            case INFO_CONTACTOS:
                if(resultCode == Activity.RESULT_OK){
                    Toast.makeText(this,data.getDataString(),Toast.LENGTH_LONG).show();
                }
                break;

            case INFO_IMAGENES:
                if(resultCode == Activity.RESULT_OK) {
                    Toast.makeText(this, data.getDataString(), Toast.LENGTH_LONG).show();
                    iv1.setImageURI(Uri.parse(data.getDataString());
                }
                break;
            default:
                
        }
    }

    public void onClickContact(View w)
    {

    }
}