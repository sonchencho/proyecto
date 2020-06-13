package com.example.layonet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class carrito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);
    }
    public void Pagar (View view){
        Intent pagar = new Intent(this, cobro.class);
        startActivity(pagar);
    }
    public void Atras (View view){
        Intent atras = new Intent(this, Ventas.class);
        startActivity(atras);
    }
}
