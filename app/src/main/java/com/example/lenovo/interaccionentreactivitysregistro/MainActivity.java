package com.example.lenovo.interaccionentreactivitysregistro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
public final static String Informacion ="Texto que va a atra activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnEnviarInfo(View view){
    Intent intent = new Intent(this,Registro.class);

    EditText txtNombre =(EditText) findViewById(R.id.etNombre);
    EditText txtCorreo =(EditText) findViewById(R.id.etCorreo);
    EditText txtTelefono =(EditText) findViewById(R.id.etTelefono);
    String nombre = txtNombre.getText().toString();
    String telefono =txtTelefono.getText().toString();
    String correo = txtCorreo.getText().toString();
    String informacion ="Nombre: "+nombre+"\nTelefono: "+telefono+"\nCorreo: "+correo;

   intent.putExtra(Informacion, informacion);
    startActivity(intent);}
}

