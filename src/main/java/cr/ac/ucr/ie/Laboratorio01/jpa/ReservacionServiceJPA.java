/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ucr.ie.Laboratorio01.jpa;

import cr.ac.ucr.ie.Laboratorio01.domain.Reservacion;
import cr.ac.ucr.ie.Laboratorio01.repository.IReservacionRepository;
import cr.ac.ucr.ie.Laboratorio01.service.IReservacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservacionServiceJPA implements IReservacionService{

    @Autowired
    private IReservacionRepository repo;
    
    @Override
    public List<Reservacion> getAll() {
        return repo.findAll();
    }

    @Override
    public void save(Reservacion reservacion) {
        repo.save(reservacion);
    }

    @Override
    public void delete(int Id) {
        repo.deleteById(Id);
    }

    @Override
    public Reservacion getById(int id) {
        return repo.findById(id).get();
    }
    
}
