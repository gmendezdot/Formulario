package com.example.gerardomd.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VerificarRegistro extends AppCompatActivity {


    private TextView nombre;
    private TextView telefono;
    private TextView email;
    private TextView direccion;
    private TextView dia;
    private Button editar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificar_registro);

        Bundle details = getIntent().getExtras();
        String nombremostrar = details.getString("nombre");
        int diamostrar = details.getInt("dia");
        int mesmostrar = details.getInt("mes");
        mesmostrar++;
        int añomostrar = details.getInt("año");
        String telefonomostrar = details.getString("telefono");
        String emailmostrar = details.getString("email");
        String direccionmostrar = details.getString("direccion");

    nombre = (TextView) findViewById(R.id.nombre);
    nombre.setText(nombremostrar);

    telefono = (TextView) findViewById(R.id.telefono);
    telefono.setText(telefonomostrar);

    email = (TextView) findViewById(R.id.email);
    email.setText(emailmostrar);

    direccion = (TextView) findViewById(R.id.direccion);
    direccion.setText(direccionmostrar);

    dia = (TextView) findViewById(R.id.fechanac);
    dia.setText(String.valueOf(diamostrar)+"/"+String.valueOf(mesmostrar)+"/"+String.valueOf(añomostrar));

    editar = (Button) findViewById(R.id.editar);
    editar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    });


    }











}










