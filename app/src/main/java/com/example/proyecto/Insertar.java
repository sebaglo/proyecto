package com.example.proyecto;

import android.icu.text.Normalizer2;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Insertar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.acttivity_registrarse);

        Button btnInsertar = findViewById(R.id.button2);
        btnInsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Modelo obj = new Modelo();
                Usuarios usr = new Usuarios();
                usr.setNombre("SEBASTIAN");
                usr.getEmail("sebastian@gmail.com");
                usr.getContraseña("1234");
                int resInsert = obj.insertarUsuarios(Insertar.this, usr);
                if(resInsert==1){
                    Toast.makeText(Insertar.this,"", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Insertar.this,"", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
