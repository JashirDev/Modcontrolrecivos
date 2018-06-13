package com.example.gamer.modcontrolrecibo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.gamer.modcontrolrecibo.Modelo.Persona;
import com.example.gamer.modcontrolrecibo.Modelo.PersonaRespuesta;
import com.example.gamer.modcontrolrecibo.Servicio.ControlService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    Retrofit retrofit;
    static private final  String TAG="PERSONA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofit = new Retrofit.Builder()
                .baseUrl("https://api-modulocontrol.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        obternerdatos();
    }

    public void obternerdatos() {




        ControlService controlService = retrofit.create(ControlService.class);
        Call<PersonaRespuesta> call= controlService.obtenerlistapersona();
        call.enqueue(new Callback<PersonaRespuesta>() {
            @Override
            public void onResponse(Call<PersonaRespuesta> call, Response<PersonaRespuesta> response) {
                Log.e(TAG,"error "+response.code());
                Log.e(TAG,"error "+response.toString());
                System.out.println(response.code());
                if (response.isSuccessful()){
                    PersonaRespuesta personaRespuesta=response.body();
                    ArrayList<Persona> listapersona = personaRespuesta.getData();
                    for(int i= 0 ; i< 5;i++){
                        Persona p= listapersona.get(i);
                        Toast.makeText(getApplicationContext(), "Mantén pulsada una imagen para guardarla", Toast.LENGTH_LONG).show();

                        Log.i("TAG","Persona"+p.getApe_nom()+p.getId_concepto());
                    }
                }
            }

            @Override
            public void onFailure(Call<PersonaRespuesta> call, Throwable t) {
                Log.i("TAG","Persona"+t.getMessage());
            }
        });
    }
}
