/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ucr.ie.Laboratorio01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

/**
 *
 * @author Laboratorio 2
 */
@Entity
@Table(name = "reservacion")
public class Reservacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservacion; // 
    
    private Persona idPersona; // Llave Foránea -> Persona
    
    private Funcion idFuncion; // Llave Foránea -> Funcion
            
    private int cantidadEspacios = 0;
    
    private LocalDate fechaRegistro;
    
    private String estado;

    public Reservacion() {
    }

    public Reservacion(int idReservacion, Persona idPersona, Funcion idFuncion, LocalDate fechaRegistro, String estado) {
        this.idReservacion = idReservacion;
        this.idPersona = idPersona;
        this.idFuncion = idFuncion;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public Funcion getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(Funcion idFuncion) {
        this.idFuncion = idFuncion;
    }

    public int getCantidadEspacios() {
        return cantidadEspacios;
    }

    public void setCantidadEspacios(int cantidadEspacios) {
        this.cantidadEspacios = cantidadEspacios;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

}
