package com.example.gamer.modcontrolrecibo.Servicio;

import com.example.gamer.modcontrolrecibo.Modelo.PersonaRespuesta;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ControlService {

    @GET("recaudaciones")
    Call<PersonaRespuesta> obtenerlistapersona();


    @POST("recaudaciones/detallada/")
    Call<PersonaRespuesta> postobtenerlistapersona(@Body PersonaRespuesta personaRespuesta);

 
}
