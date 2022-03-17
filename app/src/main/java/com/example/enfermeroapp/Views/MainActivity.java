package com.example.enfermeroapp.Views;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.enfermeroapp.DAOInterfacesImpl.PacienteApiHandler;
import com.example.enfermeroapp.DAOInterfacesImpl.QrAuxilioHandler;
import com.example.enfermeroapp.R;
import com.example.enfermeroapp.models.ConsultaQr;
import com.example.enfermeroapp.models.DatosPaciente;
import com.example.enfermeroapp.models.Login;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    public static Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("hola mundo chido");
        super.onCreate(savedInstanceState);
        context=getApplicationContext();
        setContentView(R.layout.activity_main);
    }
    public void iniciarSesionBtn(View view){
        Login user=new Login("maestrozahori","1234");
        Call<ResponseBody>iniciarSesion= PacienteApiHandler.obtenerInstancia().getCredenciales().iniciarSesion(user);

        iniciarSesion.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.isSuccessful()){
                    try {
                        System.out.println(response.body().string()+" login correcto");
                        System.out.println(response.headers());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("credenciales incorrectas");
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                System.out.println(t.getMessage()+" "+t.getCause());
            }
        });
    }

    public void obtenerInfoPaciente(View view){
        Call<DatosPaciente> getDatosPac= PacienteApiHandler.obtenerInstancia().getDatosPaciente().obtenerDatosPersonales();
        getDatosPac.enqueue(new Callback<DatosPaciente>() {
            @Override
            public void onResponse(Call<DatosPaciente> call, Response<DatosPaciente> response) {
                if(response.isSuccessful()){
                    System.out.println("Obtención éxitosa  -->"+response.body()+" "+response.body().getInformacionPersonal().getFullname());
                   DatosPaciente datosPaciente=response.body();
                    //System.out.println();
                }else{
                    System.out.println("no se encontro, aqui se programa alguna excepcion");
                    System.out.println(response.headers());
                }
            }

            @Override
            public void onFailure(Call<DatosPaciente> call, Throwable t) {
                System.out.println(t.getMessage()+" "+t.getCause());
            }
        });
    }


    public void cerrarSesionBtn(View view){
        Call<ResponseBody>cerrarSesion= PacienteApiHandler.obtenerInstancia().getCredenciales().CerrarSesion();
        cerrarSesion.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.isSuccessful()){
                    try {
                        System.out.println(response.body().string()+" logout correcto");
                        System.out.println(response.headers());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
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

    public void iniciarSegundoActivity(View view){
        Intent segAct=new Intent(this,SegundoActivity.class);
        startActivity(segAct);
    }
}