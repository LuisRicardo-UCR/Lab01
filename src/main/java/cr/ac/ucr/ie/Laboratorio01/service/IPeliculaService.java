/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ucr.ie.Laboratorio01.service;

import cr.ac.ucr.ie.Laboratorio01.domain.Pelicula;
import java.util.List;

/**
 *
 * @author Laboratorio 2
 */
public class IPeliculaService {
    
    List<Pelicula> getAll();
    
    void save(Pelicula pelicula);
    
    void delete(int id);
    
}
