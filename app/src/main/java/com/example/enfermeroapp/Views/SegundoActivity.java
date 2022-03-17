package com.example.enfermeroapp.Views;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.enfermeroapp.DAOInterfacesImpl.PacienteApiHandler;
import com.example.enfermeroapp.DAOInterfacesImpl.QrAuxilioHandler;
import com.example.enfermeroapp.R;
import com.example.enfermeroapp.models.Agenda;
import com.example.enfermeroapp.models.ConsultaQr;
import com.example.enfermeroapp.models.Contactos;
import com.example.enfermeroapp.serializer.PacienteSerializerGetter;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

public class SegundoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }

    public void cerrarSessionSeg(View view){
        Call<ResponseBody>call= PacienteApiHandler.obtenerInstancia().getCredenciales().CerrarSesion();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.isSuccessful()){
                    System.out.println(" logout correcto");
                }else{
                    System.out.println("No se puede cerrar sesion, fallo del server");
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                System.out.println(t.getMessage()+" "+t.getCause());
            }
        });
    }



    public void consultaQr(View view){
        Call<ConsultaQr>lecturaAObtener=QrAuxilioHandler.obtenerInstancia().getLecturaQr().obtenerDatosLecturaQr("wD51nscO");
        lecturaAObtener.enqueue(new Callback<ConsultaQr>() {
            @Override
            public void onResponse(Call<ConsultaQr> call, Response<ConsultaQr> response) {
                if(response.isSuccessful()){
                   ConsultaQr datosObtenidos= response.body();
                    System.out.println(datosObtenidos.getInformacionPersonal().getFullname());
                   // System.out.println(response.body());
                }else{
                    System.out.println("no existe");
                }
            }

            @Override
            public void onFailure(Call<ConsultaQr> call, Throwable t) {
                System.out.println(t.getMessage()+" sadas "+t.getCause());
            }
        });
    }

    public void añadirNuevoContacto(View view){
        Call<ResponseBody> contactoAAñadir=PacienteApiHandler
                .obtenerInstancia()
                .getInsertarContacto()
                .InsertarNuevoContacto(
                        new Contactos("Mamerto Vazques","Tio","2288909090",1)
                );
        contactoAAñadir.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.isSuccessful()){
                    try {
                        System.out.println("exito"+response.body().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("Algo salio mal en el servidor");
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                System.out.println(t.getMessage()+" "+t.getCause());
            }
        });
    }

    public void borrarContactoExistente(View view){
        Call<ResponseBody> contactoABorrar=PacienteApiHandler
                .obtenerInstancia()
                .getBorrarContacto()
                .borrarContactoExistente(new Contactos(17,"Mamerto Vazques","Tio")
                );
        contactoABorrar.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.isSuccessful()){
                    try {
                        System.out.println("Contacto borrao "+response.body().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("error del servidor");
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                System.out.println(t.getMessage()+" "+t.getCause());
            }
        });
    }

    public void renovarQRPaciente(View view){
        Call<ResponseBody>qrPulseraARenovar=PacienteApiHandler.obtenerInstancia().getRenovarQRPaciente().renovarCodigoQr();
        qrPulseraARenovar.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.isSuccessful()){
                    try {
                        System.out.println("exito, pulsera renovada"+response.body().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("Error del servidor");
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                System.out.println(t.getMessage()+" "+t.getCause());
            }
        });
    }

    public void obtenerContactos(View view){
        Call<Agenda>agendaPorObtener=PacienteApiHandler.obtenerInstancia().getDatosPaciente().obtenerContactosPaciente();
        agendaPorObtener.enqueue(new Callback<Agenda>() {
            @Override
            public void onResponse(Call<Agenda> call, Response<Agenda> response) {
                if(response.isSuccessful()){
                    Agenda agenda=response.body();
                    System.out.println(agenda.getContactos().get(0).getNombreCompleto());
                }else{
                    System.out.println("error del servidor");
                }
            }

            @Override
            public void onFailure(Call<Agenda> call, Throwable t) {
                System.out.println(t.getMessage()+" "+t.getCause());
            }
        });
    }

}