/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.openpay.restMarvel.service;

import com.openpay.restMarvel.entity.CharacterDataWrapper;
import java.io.IOException;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author danya
 */
public interface RestApiService {
    
    public ResponseEntity<String> getAllService(Long ts);
    
    
    public ResponseEntity<String> getByIdService(String id, Long ts);
}
