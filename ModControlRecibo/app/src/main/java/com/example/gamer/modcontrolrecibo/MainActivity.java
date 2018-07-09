package com.example.gamer.modcontrolrecibo;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextInputEditText etnombres,etConceptopago,etPeridos,etRecibos;
    Retrofit retrofit;
    static private final  String TAG="PERSONA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnombres=findViewById(R.id.etNombre);
        etConceptopago=findViewById(R.id.etConcepto_pago);
        etPeridos=findViewById(R.id.etPerido);
        etRecibos=findViewById(R.id.etRecibo);

    }


    public void busacar(View view) {
        String nombre="",concepto="",perodo="",recibo="";
        nombre=etnombres.getText().toString();
        concepto=etConceptopago.getText().toString();
        perodo=etPeridos.getText().toString();
        recibo=etRecibos.getText().toString();

        Intent i = new Intent(MainActivity.this,ResultadoBusqueda.class);
        i.putExtra("pasarnombre",nombre);
        i.putExtra("pasarconcepto",concepto);
        i.putExtra("pasarperodo",perodo);
        i.putExtra("pasarrecibo",recibo);
        startActivity(i);
    }

}
