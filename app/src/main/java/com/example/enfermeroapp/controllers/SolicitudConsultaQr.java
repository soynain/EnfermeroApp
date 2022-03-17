package com.example.enfermeroapp.controllers;

import com.example.enfermeroapp.models.ConsultaQr;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SolicitudConsultaQr {
    @GET("{id}")
    Call<ConsultaQr> obtenerDatosLecturaQr(@Path("id") String id);
}
