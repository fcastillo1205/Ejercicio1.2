package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class ActivityResult extends AppCompatActivity {
    EditText txtNombre,txtApellido,txtEdad,txtCorreo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        txtNombre = (EditText) findViewById(R.id.txtResultNombre);
        txtApellido = (EditText) findViewById(R.id.txtResultApellidos);
        txtEdad = (EditText) findViewById(R.id.txttxtResultEdad);
        txtCorreo = (EditText) findViewById(R.id.txtResultMail);

        Intent intent = this.getIntent();
        Bundle extra = intent.getExtras();

        txtNombre.setText(extra.getString("nombre"));
        txtApellido.setText(extra.getString("apellido"));
        txtEdad.setText(extra.getString("edad"));
        txtCorreo.setText(extra.getString("correo"));

        inahabilitarCampos();
    }

    private void inahabilitarCampos() {
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtEdad.setEnabled(false);
        txtCorreo.setEnabled(false);
    }
}