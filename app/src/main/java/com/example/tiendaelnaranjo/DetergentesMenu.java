package com.example.tiendaelnaranjo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DetergentesMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detergentes_menu);
    }

    public void Ace(View view) {
        Intent ace = new Intent(this, DetallePagoAce.class);
        startActivity(ace);
    }

    public void Axion(View view) {
        Intent axion = new Intent(this, DetallePagoAxion.class);
        startActivity(axion);
    }

    public void Roma(View view) {
        Intent roma = new Intent(this, DetallePagoRoma.class);
        startActivity(roma);
    }

    public void Salvo(View view) {
        Intent salvo = new Intent(this, DetallePagoSalvo.class);
        startActivity(salvo);
    }

    public void Regresar(View view){
        Intent regresar=new Intent(this, MenuPrincipal.class);
        startActivity(regresar);
    }
}