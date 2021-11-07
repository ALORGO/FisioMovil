package com.example.fisiomovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class IngresoPaciente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_paciente);

        getSupportActionBar().hide();

        TextView usernamePaciente = (TextView) findViewById(R.id.usernamePaciente);
        TextView passwordPaciente = (TextView) findViewById(R.id.passwordPaciente);

        MaterialButton loginbtnP = (MaterialButton) findViewById(R.id.loginbtnP);

        //Codigo del boton tipo login
        loginbtnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usernamePaciente.getText().toString().equals("admin") && passwordPaciente.getText().toString().equals("admin")){
                    Toast.makeText(IngresoPaciente.this,"Ingreso Exitoso", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(IngresoPaciente.this,"Usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show();}
            }
        });
    }
}