package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int cont;
    TextView numero = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cont=0;
        numero = findViewById(R.id.tx_numero);
    }

    public void mostrarMensaje(View view) {
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(this, "Bienvenidos",duration).show();
    }

    public void contarContador(View view) {
        cont++;
        numero.setText(String.valueOf(cont));
    }

    public void resetContador(View view) {
        cont = 0;
        numero.setText(String.valueOf(cont));
    }
}