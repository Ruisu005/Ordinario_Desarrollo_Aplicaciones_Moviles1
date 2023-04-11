package com.example.tiendaelnaranjo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LechesMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leches_menu);
    }

    public void Alpura(View view) {
        Intent alpura = new Intent(this, DetallePagoAlpura.class);
        startActivity(alpura);
    }

    public void Deslactosada(View view) {
        Intent deslac = new Intent(this, DetallePagoDeslactosada.class);
        startActivity(deslac);
    }

    public void Proteina(View view) {
        Intent proteina = new Intent(this, DetallePagoProteina.class);
        startActivity(proteina);
    }

    public void Lechera(View view) {
        Intent lechera = new Intent(this, DetallePagoLechera.class);
        startActivity(lechera);
    }

    public void Regresar(View view){
        Intent regresar=new Intent(this, MenuPrincipal.class);
        startActivity(regresar);
    }
}