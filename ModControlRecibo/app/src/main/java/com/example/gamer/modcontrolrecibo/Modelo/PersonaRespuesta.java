package com.example.gamer.modcontrolrecibo.Modelo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class PersonaRespuesta {
    ArrayList<Persona> data;
    @SerializedName("nombre")
    private String nombre;

    @SerializedName("id_concepto")
    private String concepto;

    @SerializedName("voucher")
    private String voucher;

    @SerializedName("periodoI")
    private String periodoInicial;

    @SerializedName("periodoF")
    private String periodoFInal;

    @SerializedName("dni")
    private String dni;

    public PersonaRespuesta() {
    }

    public PersonaRespuesta(String nombre, String concepto, String voucher, String periodoInicial, String periodoFInal, String dni) {
        this.nombre = nombre;
        this.concepto = concepto;
        this.voucher = voucher;
        this.periodoInicial = periodoInicial;
        this.periodoFInal = periodoFInal;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId_concepto() {
        return concepto;
    }

    public void setId_concepto(String concepto) {
        this.concepto = concepto;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public String getPeriodoInicial() {
        return periodoInicial;
    }

    public void setPeriodoInicial(String periodoInicial) {
        this.periodoInicial = periodoInicial;
    }

    public String getPeriodoFInal() {
        return periodoFInal;
    }

    public void setPeriodoFInal(String periodoFInal) {
        this.periodoFInal = periodoFInal;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Persona> getData() {
        return data;
    }

    public void setData(ArrayList<Persona> data) {
        this.data = data;
    }
}
