/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cr.ac.ucr.ie.Laboratorio01.repository;

import cr.ac.ucr.ie.Laboratorio01.domain.Pelicula;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPeliculaRepository extends JpaRepository<Pelicula, Integer> {
    
    List<Pelicula>
            findByActivoTrue();
}
