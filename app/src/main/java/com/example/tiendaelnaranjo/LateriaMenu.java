package com.example.tiendaelnaranjo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LateriaMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lateria_menu);
    }

    public void AtunLata(View view) {
        Intent atunlata = new Intent(this, DetallePagoAtun.class);
        startActivity(atunlata);
    }

    public void EloteLata(View view) {
        Intent elotelata = new Intent(this, DetallePagoElote.class);
        startActivity(elotelata);
    }

    public void FrijolLata(View view) {
        Intent frijollata = new Intent(this, DetallePagoFrijol.class);
        startActivity(frijollata);
    }

    public void RajasLata(View view) {
        Intent rajaslata = new Intent(this, DetallePagoRajas.class);
        startActivity(rajaslata);
    }

    public void Regresar(View view){
        Intent regresar=new Intent(this, MenuPrincipal.class);
        startActivity(regresar);
    }
}