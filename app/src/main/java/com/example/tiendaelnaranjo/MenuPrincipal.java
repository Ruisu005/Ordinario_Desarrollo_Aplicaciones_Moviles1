package com.example.tiendaelnaranjo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity {

    private TextView loginN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        loginN=(TextView)findViewById(R.id.saludo);
        String nombre=getIntent().getStringExtra("nombre");
        loginN.setText("Hola "+nombre+"" +
                "\nBienvenido a la Tienda El Naranjo" +
                "\nSelecciona Tu Producto");
    }

    public void LateriasMenu(View view){
        Intent laterias=new Intent(this, LateriaMenu.class);
        startActivity(laterias);
    }
    public void MensajeLateria(View view){
        Toast.makeText(this, "Haz Escogido Laterias", Toast.LENGTH_SHORT).show();
    }

    public void LechesMenu(View view){
        Intent leches=new Intent(this, LechesMenu.class);
        startActivity(leches);
    }
    public void MensajeLeche(View view){
        Toast.makeText(this, "Haz Escogido Leches", Toast.LENGTH_SHORT).show();
    }

    public void DetergentesMenu(View view){
        Intent detergentes=new Intent(this, DetergentesMenu.class);
        startActivity(detergentes);
    }
    public void MensajeDetergente(View view){
        Toast.makeText(this, "Haz Escogido Detergentes", Toast.LENGTH_SHORT).show();
    }

    public void Regresar(View view){
        Intent regresar=new Intent(this, MainActivity.class);
        startActivity(regresar);
    }
}