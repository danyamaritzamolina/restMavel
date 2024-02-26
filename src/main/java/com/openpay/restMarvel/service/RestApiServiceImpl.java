/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openpay.restMarvel.service;

//import com.open.pay.restMarvelJar.controller.CharactersController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.openpay.restMarvel.controller.ConsultaTblController;
//import com.open.pay.restMarvelJar.RestMarvelJarApplication;
//import com.open.pay.restMarvelJar.service.CharactersServiceImpl;
import com.openpay.restMarvel.service.CharactersService;
import com.openpay.restMarvel.entity.CharacterDataWrapper;
import com.openpay.restMarvel.entity.ConsultaTbl;
import jakarta.transaction.Transactional;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
//import org.springframework.boot.ApplicationArguments;

/**
 * Clase service para consulta de peticiones en la api
 * @author danya
 */
@Service
@ComponentScan(basePackages = "com.open.pay.restMarvelJar.service")
public class RestApiServiceImpl implements RestApiService{
    private final ConsultaTblService consultaTblService;
    private final ConsultaTblController consultaTblController;
    private final CharactersService charactersService;
    private final ConsultaTbl consultaTbl;
    private long ts ;
    ObjectMapper objectMapper = new ObjectMapper();
    CharacterDataWrapper characterDataWrapper;
    
    
    
    public RestApiServiceImpl(CharactersServiceImpl charactersService,
                              ConsultaTblService consultaTblService1, 
                              ConsultaTblController consultaTblController1,
                              ConsultaTbl consultaTbl1) {
        this.charactersService = charactersService;
        this.consultaTblService = consultaTblService1;
        this.consultaTbl =  consultaTbl1;
        this.consultaTblController = consultaTblController1;
    }
    
    
    @Override
    public ResponseEntity<String> getAllService(Long ts) {
        String result = "";
        result = charactersService.getAllService(ts).getBody();
        return ResponseEntity.ok(result);
    }
    
    
    
    @Override
    @Transactional
    public ResponseEntity<String> getByIdService(String id, Long ts) {
        String result = "";
        result = charactersService.getByIdService(id,ts).getBody();
        return ResponseEntity.ok(result);
    }
    
}
