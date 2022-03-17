package com.example.enfermeroapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Privacidad {
    @SerializedName("idvis")
    @Expose
    private Integer idvis;
    @SerializedName("inf_bas")
    @Expose
    private Integer infBas;
    @SerializedName("contactos")
    @Expose
    private Integer contactos;
    @SerializedName("alergias")
    @Expose
    private Integer alergias;
    @SerializedName("padecimientos")
    @Expose
    private Integer padecimientos;
    @SerializedName("medicamentos")
    @Expose
    private Integer medicamentos;
    @SerializedName("medico")
    @Expose
    private Integer medico;

    public Integer getIdvis() {
        return idvis;
    }

    public void setIdvis(Integer idvis) {
        this.idvis = idvis;
    }

    public Integer getInfBas() {
        return infBas;
    }

    public void setInfBas(Integer infBas) {
        this.infBas = infBas;
    }

    public Integer getContactos() {
        return contactos;
    }

    public void setContactos(Integer contactos) {
        this.contactos = contactos;
    }

    public Integer getAlergias() {
        return alergias;
    }

    public void setAlergias(Integer alergias) {
        this.alergias = alergias;
    }

    public Integer getPadecimientos() {
        return padecimientos;
    }

    public void setPadecimientos(Integer padecimientos) {
        this.padecimientos = padecimientos;
    }

    public Integer getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Integer medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Integer getMedico() {
        return medico;
    }

    public void setMedico(Integer medico) {
        this.medico = medico;
    }
}
