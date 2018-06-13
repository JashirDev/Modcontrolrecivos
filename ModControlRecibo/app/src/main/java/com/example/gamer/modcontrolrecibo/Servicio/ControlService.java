package com.example.gamer.modcontrolrecibo.Servicio;

import com.example.gamer.modcontrolrecibo.Modelo.PersonaRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ControlService {

    @GET("recaudaciones")
    Call<PersonaRespuesta> obtenerlistapersona();
}
