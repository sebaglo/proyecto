package com.example.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class agregarProducto extends AppCompatActivity {

    private EditText nombreProducto;
    private EditText cantidadProducto;
    private EditText precioProducto;
    private EditText ventaProducto;
    private Spinner Spinnertipo;
    private int contador=0, cantidad;
    private String nombre, tipo, seleccion;
    private double precio, venta;
    private ArrayList<Producto> productos = new ArrayList<Producto>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agregar_producto);

        nombreProducto = (EditText) findViewById(R.id.editnombreProductos);
        cantidadProducto = (EditText) findViewById(R.id.edit_cantidad);
        precioProducto = (EditText) findViewById(R.id.editprecio);
        ventaProducto = (EditText) findViewById(R.id.editventa);
        Spinnertipo = (Spinner) findViewById(R.id.spinner);
        String[] opciones = {"Ruedas", "Componentes", "Consumos"};
        ArrayAdapter<String> arreglo1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        Spinnertipo.setAdapter(arreglo1);
    }
    public void agregar(View view){
        nombre = nombreProducto.getText().toString();
        precio = Double.parseDouble(precioProducto.getText().toString());
        cantidad = Integer.parseInt(cantidadProducto.getText().toString());
        venta = Double.parseDouble(ventaProducto.getText().toString());
        seleccion = Spinnertipo.getSelectedItem().toString();

        productos.add(contador,new Producto(nombre, seleccion,cantidad,precio,venta));
        contador+=1;

    }
}
