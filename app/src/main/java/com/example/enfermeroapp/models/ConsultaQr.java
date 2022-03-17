package com.example.enfermeroapp.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ConsultaQr {
    @SerializedName("InformacionPersonal")
    @Expose
    private InformacionPersonal informacionPersonal;
    @SerializedName("Contactos")
    @Expose
    private List<Contactos> contactos;
    @SerializedName("Privacidad")
    @Expose
    private Privacidad privacidad;

    public InformacionPersonal getInformacionPersonal() {
        return informacionPersonal;
    }

    public void setInformacionPersonal(InformacionPersonal informacionPersonal) {
        this.informacionPersonal = informacionPersonal;
    }

    public List<Contactos> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contactos> contactos) {
        this.contactos = contactos;
    }

    public Privacidad getPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(Privacidad privacidad) {
        this.privacidad = privacidad;
    }
}
