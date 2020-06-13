package com.example.layonet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class accesos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accesos);
    }
    public void Menu (View view){
        Intent menu = new Intent(this, pefil.class);
        startActivity(menu);
    }
}
