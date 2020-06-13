package com.example.layonet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ventas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventas);
    }
    public void Carrito (View view){
        Intent carrito = new Intent(this, carrito.class);
        startActivity(carrito);
    }
    public void Menu (View view){
        Intent menu = new Intent(this, pefil.class);
        startActivity(menu);
    }
}
