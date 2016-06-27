package com.example.gerardomd.formulario;


import android.content.Intent;
import android.os.PersistableBundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

import android.widget.Button;
import android.widget.DatePicker;


public class MainActivity extends AppCompatActivity{


    private static final String TAG = "MAIN ACTIVITY";
    private TextInputLayout nombre;
    private TextInputLayout telefono;
    private TextInputLayout email;
    private TextInputLayout direccion;
    private DatePicker fecha;
    private String snombre;



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        nombre = (TextInputLayout) findViewById(R.id.nombre);
        fecha = (DatePicker) findViewById(R.id.fecha);
        telefono = (TextInputLayout) findViewById(R.id.telefono);
        email = (TextInputLayout) findViewById(R.id.email);
        direccion = (TextInputLayout) findViewById(R.id.direccion);



        Button siguiente = (Button) findViewById(R.id.siguiente);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, VerificarRegistro.class);
                intent.putExtra("nombre", nombre.getEditText().getText().toString());
                intent.putExtra("dia", fecha.getDayOfMonth());
                intent.putExtra("mes", fecha.getMonth());
                intent.putExtra("año", fecha.getYear());
                intent.putExtra("telefono", telefono.getEditText().getText().toString());
                intent.putExtra("email", email.getEditText().getText().toString());
                intent.putExtra("direccion", direccion.getEditText().getText().toString());
                startActivity(intent);

            }
        });


    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);




    }

    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putString(snombre, "");

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }


}
