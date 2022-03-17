package com.example.enfermeroapp.controllers;

import com.example.enfermeroapp.models.Agenda;
import com.example.enfermeroapp.models.DatosPaciente;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SolicitarDatosPersonales {
    @GET("datosprincipales")
    Call<DatosPaciente> obtenerDatosPersonales();

    @GET("contactos")
    Call<Agenda> obtenerContactosPaciente();

}
