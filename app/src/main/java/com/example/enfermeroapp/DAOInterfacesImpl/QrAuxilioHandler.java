package com.example.enfermeroapp.DAOInterfacesImpl;


import com.example.enfermeroapp.Views.MainActivity;
import com.example.enfermeroapp.controllers.SolicitudConsultaQr;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class QrAuxilioHandler {
    private static final String BASE_URL = "http://192.168.100.6:3000/show_public_profile/";
    private static QrAuxilioHandler instancia=null;
    private static OkHttpClient okHttpClient;
    private static Retrofit retrofit;
    private SolicitudConsultaQr lecturaQr;

    public QrAuxilioHandler(){
        iniciarRetrofit();
        this.lecturaQr=retrofit.create(SolicitudConsultaQr.class);
    }
    public static synchronized QrAuxilioHandler obtenerInstancia(){
        if(instancia==null){
            instancia=new QrAuxilioHandler();
        }
        return instancia;
    }

    private static void iniciarRetrofit(){
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public SolicitudConsultaQr getLecturaQr() {
        return lecturaQr;
    }
}
