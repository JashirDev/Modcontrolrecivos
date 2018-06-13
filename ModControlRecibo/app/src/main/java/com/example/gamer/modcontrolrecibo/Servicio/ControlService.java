package com.example.gamer.modcontrolrecibo.Servicio;

import com.example.gamer.modcontrolrecibo.Modelo.PersonaRespuesta;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ControlService {

    @GET("recaudaciones")
    Call<PersonaRespuesta> obtenerlistapersona();

    @FormUrlEncoded
    @POST("recaudaciones/detallada")
    Call<PersonaRespuesta> postobtenerlistapersona(@Field("nombre") String nombre ,@Field("id_concepto") String id_concepto,
     @Field("voucher")String voucher,
    @Field("periodoI")String periodoI,
    @Field("periodoF")String periodoF,
    @Field("dni")String dni);

 
}
