/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cr.ac.ucr.ie.Laboratorio01.repository;

import cr.ac.ucr.ie.Laboratorio01.domain.Reservacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservacionRepository extends JpaRepository<Reservacion, Integer>{
    
}
