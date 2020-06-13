package com.example.layonet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pefil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pefil);
    }
    public void notas (View view){
        Intent nota = new Intent(this, Notas.class);
        startActivity(nota);
    }
    public void ventas (View view) {
        Intent venta = new Intent(this, Ventas.class);
        startActivity(venta);
    }
}
