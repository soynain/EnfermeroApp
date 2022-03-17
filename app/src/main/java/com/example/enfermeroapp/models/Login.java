package com.example.enfermeroapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Login {
    @SerializedName("usuario")
    @Expose
    private String usuario;
    @SerializedName("contra")
    @Expose
    private String contra;

    public Login(String usuario, String contra) {
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getUsername() {
        return usuario;
    }

    public String getPass() {
        return contra;
    }
}
