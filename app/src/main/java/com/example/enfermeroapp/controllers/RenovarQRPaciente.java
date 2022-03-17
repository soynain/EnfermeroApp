package com.example.enfermeroapp.controllers;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.POST;

public interface RenovarQRPaciente {
    @POST("renovar-qr")
    Call<ResponseBody>renovarCodigoQr();
}
