/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openpay.restMarvel.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.openpay.restMarvel.entity.Authority;
import com.openpay.restMarvel.utils.AutorityRoles;
import java.util.Optional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author danya
 */
@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Optional<Authority> findByName(AutorityRoles name);
}
