package com.example.lenovo.interaccionentreactivitysregistro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Registro extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registro2);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.Informacion);
        TextView tvInformacion =(TextView) findViewById(R.id.tvInformacion);
        tvInformacion.setText(message);

    }
    public void abrir(View view){
        Intent intent1 = new Intent(this,MainActivity.class);
        startActivity(intent1);}
    }

