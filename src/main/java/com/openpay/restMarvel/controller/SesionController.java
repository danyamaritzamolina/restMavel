/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openpay.restMarvel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller de prueba para implementacion de autenticacion
 * @author danya
 */
@RestController
public class SesionController {
    @GetMapping("/sesion")
    public String sesion(){
        return "Sesion";
    }
    
}
