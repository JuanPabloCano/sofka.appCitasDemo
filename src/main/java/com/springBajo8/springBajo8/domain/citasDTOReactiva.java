package com.springBajo8.springBajo8.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "consult")
public class citasDTOReactiva {

    @Id
    private String id;
    private String idPaciente;
    private String nombrePaciente;
    private String apellidosPaciente;
    private String nombreMedico;
    private String apellidosMedico;
    private String fechaReservaCita;
    private String horaReservaCita;
    private Boolean estadoReservaCita;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidosPaciente() {
        return apellidosPaciente;
    }

    public void setApellidosPaciente(String apellidosPaciente) {
        this.apellidosPaciente = apellidosPaciente;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getApellidosMedico() {
        return apellidosMedico;
    }

    public void setApellidosMedico(String apellidosMedico) {
        this.apellidosMedico = apellidosMedico;
    }

    public String getFechaReservaCita() {
        return fechaReservaCita;
    }

    public void setFechaReservaCita(String fechaReservaCita) {
        this.fechaReservaCita = fechaReservaCita;
    }

    public String getHoraReservaCita() {
        return horaReservaCita;
    }

    public void setHoraReservaCita(String horaReservaCita) {
        this.horaReservaCita = horaReservaCita;
    }

    public Boolean getEstadoReservaCita() {
        return estadoReservaCita;
    }

    public void setEstadoReservaCita(Boolean estadoReservaCita) {
        this.estadoReservaCita = estadoReservaCita;
    }

}
