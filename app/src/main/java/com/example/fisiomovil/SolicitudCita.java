package com.example.fisiomovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;

public class SolicitudCita extends AppCompatActivity {

    EditText fechaCita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitud_cita);

        fechaCita = (EditText) findViewById(R.id.fechaCita);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.tipos_terapias);
    }*/
}