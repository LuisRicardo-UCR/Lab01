/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cr.ac.ucr.ie.Laboratorio01.service;

import cr.ac.ucr.ie.Laboratorio01.domain.Reservacion;
import java.util.List;

/**
 *
 * @author Laboratorio 2
 */
public interface IReservacionService {

    List<Reservacion> getAll();

    void save(Reservacion reservacion);

    void delete(int Id);

    Reservacion getById(int id);
}
