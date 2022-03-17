package com.example.enfermeroapp.serializer;

import com.example.enfermeroapp.models.Agenda;
import com.example.enfermeroapp.models.DatosPaciente;
import com.example.enfermeroapp.models.Privacidad;

public class PacienteSerializerGetter {
    private Agenda agenda;
    private DatosPaciente datosPaciente;
    private Privacidad privacidad;

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public DatosPaciente getDatosPaciente() {
        return datosPaciente;
    }

    public void setDatosPaciente(DatosPaciente datosPaciente) {
        this.datosPaciente = datosPaciente;
    }

    public Privacidad getPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(Privacidad privacidad) {
        this.privacidad = privacidad;
    }
}
