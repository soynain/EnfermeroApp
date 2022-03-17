package com.example.enfermeroapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InformacionPersonal {
    @SerializedName("nombres")
    private String nombres;
    @SerializedName("apellidos")
    private String apellidos;
    @SerializedName("fechaNac")
    private String fechaNac;
    @SerializedName("sexo")
    private String sexo;
    @SerializedName("color_ojos")
    private String colorOjos;
    @SerializedName("altura")
    private String altura;
    @SerializedName("peso")
    private Integer peso;
    @SerializedName("numTelefono")
    private Long numTelefono;
    @SerializedName("image")
    private String image;
    @SerializedName("idPulsera")
    private String idPulsera;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Long getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(Long numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIdPulsera() {
        return idPulsera;
    }

    public void setIdPulsera(String idPulsera) {
        this.idPulsera = idPulsera;
    }
}
