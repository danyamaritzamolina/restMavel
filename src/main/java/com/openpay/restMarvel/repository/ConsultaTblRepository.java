/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.openpay.restMarvel.repository;

import com.openpay.restMarvel.entity.ConsultaTbl;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author danya
 */
@Repository
public interface ConsultaTblRepository extends JpaRepository<ConsultaTbl, Long>{
    
    //Optional<ConsultaTbl> findById();
}
