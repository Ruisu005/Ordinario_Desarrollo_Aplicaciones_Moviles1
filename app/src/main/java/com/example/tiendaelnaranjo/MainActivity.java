    package com.example.tiendaelnaranjo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

    public class MainActivity extends AppCompatActivity {

private EditText loginN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginN=(EditText)findViewById(R.id.loginN);
    }
    public void Ingresar(View view){
        Intent ingresar=new Intent(this, MenuPrincipal.class);
        ingresar.putExtra("nombre", loginN.getText().toString());
        startActivity(ingresar);
    }
}