package com.example.gamer.modcontrolrecibo.Modelo;

import com.google.gson.annotations.SerializedName;

public class Persona {
    @SerializedName("ape_nom")
    private String ape_nom;
    @SerializedName("id_rec")
    private int id_rec ;
    @SerializedName("id_alum")
    private int  id_alum;
    @SerializedName("id_concepto")
    private int id_concepto ;
    @SerializedName("id_registro")
    private String  id_registro;
    @SerializedName("numero")
    private int numero;
    @SerializedName("id_facultad")
    private String  id_facultad ;


    @SerializedName("nombre")
    private String nombre;

    @SerializedName("concepto")
    private String  concepto;

    @SerializedName("recibo")
    private String  recibo;

    @SerializedName("codigo")
    private String  codigo;

    @SerializedName("importe")
    private double importe;
    @SerializedName("fecha")
    private String  fecha;


    public String getApe_nom() {
        return ape_nom;
    }

    public void setApe_nom(String ape_nom) {
        this.ape_nom = ape_nom;
    }

    public int getId_rec() {
        return id_rec;
    }

    public void setId_rec(int id_rec) {
        this.id_rec = id_rec;
    }

    public int getId_alum() {
        return id_alum;
    }

    public void setId_alum(int id_alum) {
        this.id_alum = id_alum;
    }

    public int getId_concepto() {
        return id_concepto;
    }

    public void setId_concepto(int id_concepto) {
        this.id_concepto = id_concepto;
    }

    public String getId_registro() {
        return id_registro;
    }

    public void setId_registro(String id_registro) {
        this.id_registro = id_registro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getId_facultad() {
        return id_facultad;
    }

    public void setId_facultad(String id_facultad) {
        this.id_facultad = id_facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getRecibo() {
        return recibo;
    }

    public void setRecibo(String recibo) {
        this.recibo = recibo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
