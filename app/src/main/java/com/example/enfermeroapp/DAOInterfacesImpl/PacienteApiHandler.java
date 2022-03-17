package com.example.enfermeroapp.DAOInterfacesImpl;

import com.example.enfermeroapp.Views.MainActivity;
import com.example.enfermeroapp.controllers.*;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*clase singleton, no creas un objeto, solo invocas a la clase we*/
public class PacienteApiHandler {
    private static final String BASE_URL = "http://192.168.100.6:3000/mobile/";
    private static PacienteApiHandler instancia=null;

    private CredencialesPaciente convertidorAJson;
    private SolicitarDatosPersonales datosPaciente;
    private InsertarContacto insertarContacto;
    private BorrarContacto borrarContacto;
    private RenovarQRPaciente renovarQRPaciente;

    private static OkHttpClient okHttpClient;
    private static Retrofit retrofit;

    public PacienteApiHandler(){
        activarInterceptors();
        iniciarRetrofit();
        this.convertidorAJson=retrofit.create(CredencialesPaciente.class);
        this.datosPaciente=retrofit.create(SolicitarDatosPersonales.class);
        this.insertarContacto=retrofit.create(InsertarContacto.class);
        this.borrarContacto=retrofit.create(BorrarContacto.class);
        this.renovarQRPaciente=retrofit.create(RenovarQRPaciente.class);
    }
    /*singleton protegido para que no haya pedos con los hilos we, podrás
    * invocarlo en todos tus activities sin tener que iniciar sesion
    * a cada rato o asi*/
    public static synchronized PacienteApiHandler obtenerInstancia(){
        if(instancia==null){
            instancia=new PacienteApiHandler();
        }
        return instancia;
    }

    private static void activarInterceptors(){
        okHttpClient=new OkHttpClient.Builder()
                .addInterceptor(new ReceivedCookiesInterceptor(MainActivity.context))
                .addInterceptor(new AddCookiesInterceptor(MainActivity.context))
                .build();
    }

    private static void iniciarRetrofit(){
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()))
                .build();
    }

    public CredencialesPaciente getCredenciales(){
        return convertidorAJson;
    }

    public SolicitarDatosPersonales getDatosPaciente() {
        return datosPaciente;
    }

    public InsertarContacto getInsertarContacto() {
        return insertarContacto;
    }

    public BorrarContacto getBorrarContacto() {
        return borrarContacto;
    }

    public RenovarQRPaciente getRenovarQRPaciente() {
        return renovarQRPaciente;
    }
}
