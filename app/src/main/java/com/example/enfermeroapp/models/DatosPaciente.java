package com.example.enfermeroapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DatosPaciente {
    @SerializedName("InformacionPersonal")
    @Expose
    private InformacionPersonal informacionPersonal;

    public InformacionPersonal getInformacionPersonal() {
        return informacionPersonal;
    }

    public void setInformacionPersonal(InformacionPersonal informacionPersonal) {
        this.informacionPersonal = informacionPersonal;
    }
}
