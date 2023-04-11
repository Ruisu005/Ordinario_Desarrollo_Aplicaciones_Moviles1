package com.example.tiendaelnaranjo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DetallePagoRoma extends AppCompatActivity {

    private int cantidadProductos = 0;
    private double precioTotal = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pago_roma);

        Intent intent = getIntent();
        int cantidadProductos = intent.getIntExtra("cantidadProductos", 0);
        double precioTotal = intent.getDoubleExtra("precioTotal", 0.0);

        TextView tvProducto = findViewById(R.id.tv_producto);
        tvProducto.setText("Seleccionaste "+cantidadProductos+" Detergentes");

        TextView tvPrecioTotal = findViewById(R.id.tv_precio_total);
        tvPrecioTotal.setText("Precio Total: $" + precioTotal);

        TextView tvDetalle = findViewById(R.id.detalle);
        tvDetalle.setText("Producto: Detergente Roma" +
                "\nCantidad: "+cantidadProductos+"" +
                "\nPeso: 500g" +
                "\nMarca: Roma");
    }

    public void Mas(View view) {
        cantidadProductos++;
        precioTotal += 25.0;

        TextView tvCantidad = findViewById(R.id.tv_cantidad);
        tvCantidad.setText(Integer.toString(cantidadProductos));
    }

    public void Menos(View view) {
        if (cantidadProductos > 0) {
            cantidadProductos--;
            precioTotal -= 25.0;

            TextView tvCantidad = findViewById(R.id.tv_cantidad);
            tvCantidad.setText(Integer.toString(cantidadProductos));
        }
    }

    public void PagarTotal(View view) {
        Intent intent = new Intent(this, DetallePagoRoma.class);
        intent.putExtra("cantidadProductos", cantidadProductos);
        intent.putExtra("precioTotal", precioTotal);
        startActivity(intent);
        Toast.makeText(this, "Pago Realizado Con Exito" +
                "\nSe Le Enviaran su Producto", Toast.LENGTH_SHORT).show();
    }

    public void Regresar(View view){
        Intent regresar=new Intent(this, DetergentesMenu.class);
        startActivity(regresar);
    }

    public void Inicio(View view){
        Intent inicio=new Intent(this, MainActivity.class);
        startActivity(inicio);
    }
}