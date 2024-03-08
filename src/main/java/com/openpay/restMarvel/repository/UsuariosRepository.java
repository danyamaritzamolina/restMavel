/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openpay.restMarvel.repository;

import com.openpay.restMarvel.entity.Usuarios;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author danya
 */
@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long>{
    Optional<Usuarios> findByUsername(String name);
    
}
