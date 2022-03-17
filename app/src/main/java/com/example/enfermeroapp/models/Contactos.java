package com.example.enfermeroapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contactos {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("nombreCompleto")
    @Expose
    private String nombreCompleto;
    @SerializedName("relacion")
    @Expose
    private String relacion;
    @SerializedName("telefono")
    @Expose
    private String telefono;
    @SerializedName("id_Prim")
    @Expose
    private Integer idPrim;
    /*constructor para añadir contacto*/
    public Contactos(String nombreCompleto, String relacion, String telefono, Integer idPrim) {
        this.nombreCompleto = nombreCompleto;
        this.relacion = relacion;
        this.telefono = telefono;
        this.idPrim = idPrim;
    }
    /*constructor para borrar un contacto*/
    public Contactos(Integer id, String nombreCompleto, String relacion) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.relacion = relacion;
    }

    public Integer getIdPrim() {
        return idPrim;
    }

    public void setIdPrim(Integer idPrim) {
        this.idPrim = idPrim;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
