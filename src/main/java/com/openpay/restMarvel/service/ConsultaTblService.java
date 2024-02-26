/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openpay.restMarvel.service;

import java.util.List;
import com.openpay.restMarvel.entity.ConsultaTbl;

/**
 *
 * @author danya
 */
public interface ConsultaTblService {
    
    public ConsultaTbl createRow (ConsultaTbl row);
    public ConsultaTbl getRowById(Long id);
    public List<ConsultaTbl> getAllRows();
    
}
