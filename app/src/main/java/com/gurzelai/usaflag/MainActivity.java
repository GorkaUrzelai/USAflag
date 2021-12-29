package com.gurzelai.usaflag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button boton;
    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.buton);
        boton.setOnClickListener(v -> abrirIntent());
        nombre = findViewById(R.id.nombre);
    }

    private void abrirIntent() {
        Intent intent = new Intent(this, Flag.class);
        intent.putExtra("nombre", String.valueOf(nombre.getText()) );
        startActivity(intent);
    }
}