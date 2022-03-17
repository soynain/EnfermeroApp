package com.example.enfermeroapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Agenda {
    @SerializedName("Contactos")
    @Expose
    private List<Contactos> contactos = null;

    public List<Contactos> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contactos> contactos) {
        this.contactos = contactos;
    }
}
