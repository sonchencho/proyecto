package com.example.layonet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cobro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobro);
    }
    public void Inicio (View view){
        Intent inicio = new Intent(this, pefil.class);
        startActivity(inicio);
    }
}
