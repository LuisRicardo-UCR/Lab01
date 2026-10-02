/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ucr.ie.Laboratorio01.controller;

import cr.ac.ucr.ie.Laboratorio01.domain.Reservacion;
import cr.ac.ucr.ie.Laboratorio01.service.IReservacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Laboratorio 2
 */
@Controller
@RequestMapping("/reservation")
public class ReservacionController {
    
    @Autowired
    private IReservacionService service;
    
    //LocalHost:8080/reservation/index
   @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("reservation_list", service.getAll());
        return "reservation/index";
    }
    
    @GetMapping("/create")
    public String create(Model model) {
     
        model.addAttribute("reservation", new Reservacion());
        return "reservation/create";
    }
    
    @PostMapping("/create")
    public String save(@Validated Reservacion reservacion) {
     
        service.save(reservacion);
        return "redirect:/reservation/index";
    }
    
    //LocalHost:8080/products/delete?productId=1
    @GetMapping("/deleteById")
    public String delete(@RequestParam int reservacionId) {
     
        service.delete(reservacionId);
        return "redirect:/reservation/index";
    }
    
     @GetMapping("/edit")
    public String edit(Model model, @RequestParam int reservacionId) {
     
        model.addAttribute("reservation", service.getById(reservacionId));
        return "reservation/edit";
    }
    
    @GetMapping("/findById")
    @ResponseBody
    public Reservacion find(Model model, @RequestParam int reservacionId) {

        return service.getById(reservacionId);
    }
    

    
}
