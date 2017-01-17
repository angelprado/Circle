package com.example.miempresa.circle;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainLoginActivity extends AppCompatActivity  {
   Button remenberpasswor;
   Button newaccoun;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);


        remenberpasswor =(Button) findViewById(R.id.recordao);
        newaccoun = (Button)findViewById(R.id.newusuario);


        newaccoun.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainLoginActivity.this, cuenta_nueva.class);
                startActivity(intent);
            }
        });



        remenberpasswor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainLoginActivity.this, remeberpasswor.class);
                startActivity(intent);
            }
        });
    }


}
