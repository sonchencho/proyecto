package com.example.layonet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etn, etp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn = (EditText)findViewById(R.id.usuario);
        etp = (EditText)findViewById(R.id.contraseña);
    }
    public void Registrar (View view) {

        String nombre = etn.getText().toString();
        String passward = etp.getText().toString();

        if (nombre.length() == 0){
            Toast.makeText(this,"Ingrese un usuario", Toast.LENGTH_LONG).show();
        }
        if (passward.length() == 0) {
            Toast.makeText(this, "Ingrese una contraseña", Toast.LENGTH_LONG).show();
        }
        //metodo para el boton iniciar.

            if (nombre.length()!= 0 && passward.length()!= 0){
                Intent siguiente = new Intent(this, accesos.class);
                startActivity(siguiente);
            }
    }
}
