package com.example.gamer.modcontrolrecibo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.gamer.modcontrolrecibo.Adaptadores.PersonaAdapter;
import com.example.gamer.modcontrolrecibo.Modelo.Persona;
import com.example.gamer.modcontrolrecibo.Modelo.PersonaRespuesta;
import com.example.gamer.modcontrolrecibo.Servicio.ControlService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ResultadoBusqueda extends AppCompatActivity {
    Retrofit retrofit;
    RecyclerView reciclador;
    static private final  String TAG="PERSONA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_busqueda);

        reciclador= (RecyclerView)findViewById(R.id.reciclador);
        reciclador.setLayoutManager(new LinearLayoutManager(this));

        retrofit = new Retrofit.Builder()
                .baseUrl("https://api-modulocontrol.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        recibirdatos();

    }

    private void recibirdatos() {
        Intent i = getIntent();
        String nombre=i.getStringExtra("pasarnombre");
        String concepto=i.getStringExtra("pasarconcepto");
        String perodo=i.getStringExtra("pasarperodo");
        String recibo=i.getStringExtra("pasarrecibo");

        ControlService controlService = retrofit.create(ControlService.class);
        PersonaRespuesta personaRespuesta = new PersonaRespuesta(nombre,concepto,"",perodo,"",recibo);
        Call<PersonaRespuesta> call = controlService.postobtenerlistapersona(personaRespuesta);
        call.enqueue(new Callback<PersonaRespuesta>() {
            @Override
            public void onResponse(Call<PersonaRespuesta> call, Response<PersonaRespuesta> response) {
                Log.e(TAG,"error "+response.message());
                Log.e(TAG,"error "+response.toString());
                if (response.isSuccessful()){

                    PersonaRespuesta personaRespuesta=response.body();
                    ArrayList<Persona> listapersona = personaRespuesta.getData();

                    PersonaAdapter adapter = new PersonaAdapter(listapersona);
                    Map<String, ArrayList<Persona>> nombreMap=new HashMap<String, ArrayList<Persona>>();

                    reciclador.setAdapter(adapter);

                }
            }

            @Override
            public void onFailure(Call<PersonaRespuesta> call, Throwable t) {

            }
        });
    }
}
