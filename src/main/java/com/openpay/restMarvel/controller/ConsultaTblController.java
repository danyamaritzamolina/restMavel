/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openpay.restMarvel.controller;

import java.util.List;
import com.openpay.restMarvel.entity.ConsultaTbl;
import com.openpay.restMarvel.service.ConsultaTblServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller para endpoint de peticiones para crud de tabla de bitacora 
 * la cual almacena las consultas a la api externa
 * @author danya
 */
@RestController
@RequestMapping("/restapi/tabla")
public class ConsultaTblController {
    @Autowired
    private ConsultaTblServiceImpl consultaTblService;
    
    public ConsultaTblController(ConsultaTblServiceImpl consultaTblService) {
        this.consultaTblService = consultaTblService;
    }
    
    @PostMapping
    public ConsultaTbl createRow(@RequestBody ConsultaTbl row){
        System.out.print(row.getHora());
        System.out.print(row.getUsuario());
        return consultaTblService.createRow(row);
    }
    
    
    @GetMapping
    public List<ConsultaTbl> getAllRows(){
        return consultaTblService.getAllRows();
    }
    
    
    @GetMapping("{id}")
    public ConsultaTbl getById(@PathVariable("id") Long id){
        return consultaTblService.getRowById(id);
    }
    
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") Long id){
        consultaTblService.deleteRow(id);
    }
    
}
