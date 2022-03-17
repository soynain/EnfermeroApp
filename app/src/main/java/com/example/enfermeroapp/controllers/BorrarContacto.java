package com.example.enfermeroapp.controllers;

import com.example.enfermeroapp.models.Contactos;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface BorrarContacto {
    @POST("delete-contacto")
    Call<ResponseBody> borrarContactoExistente(@Body Contactos contactoABorrar);
}
