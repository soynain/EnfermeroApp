package com.example.enfermeroapp.controllers;

import com.example.enfermeroapp.models.Login;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CredencialesPaciente {
 //   @Headers("Content-type:text/plain")
    @POST("login")
    Call<ResponseBody> iniciarSesion(@Body Login user);

  //  @Headers("Content-type:text/plain")
    @GET("logout")
    Call<ResponseBody> CerrarSesion();
}
