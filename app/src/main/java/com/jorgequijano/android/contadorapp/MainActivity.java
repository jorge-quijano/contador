package com.jorgequijano.android.contadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button mBotoncontar;
    Button mBotonreiniciar;
    EditText mCampoconteo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBotoncontar = (Button) findViewById(R.id.boton_contar);
        mBotonreiniciar = (Button) findViewById(R.id.boton_reiniciar);
        mCampoconteo =(EditText) findViewById(R.id.campo_conteo);

    }
}
