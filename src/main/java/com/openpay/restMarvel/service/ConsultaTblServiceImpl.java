/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openpay.restMarvel.service;

import java.util.List;
import java.util.Optional;
import com.openpay.restMarvel.entity.ConsultaTbl;
import com.openpay.restMarvel.repository.ConsultaTblRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Service para las funciones de la tabla de bitacora
 * @author danya
 */
@Service
@Component
public class ConsultaTblServiceImpl implements ConsultaTblService{
    @Autowired
    private ConsultaTblRepository consultaTblRepository;
    
    @Override
    public ConsultaTbl createRow (ConsultaTbl row) {
        return consultaTblRepository.save(row);
    }
    @Override
    public ConsultaTbl getRowById(Long id){
        Optional<ConsultaTbl> optionalRow = consultaTblRepository.findById(id);
        return optionalRow.get();
    }
    @Override
    public List<ConsultaTbl> getAllRows(){
        return consultaTblRepository.findAll();
    }
    
    public void deleteRow(Long id){
        consultaTblRepository.deleteById(id);
    }
}
