/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openpay.restMarvel.security;

import com.openpay.restMarvel.entity.Authority;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author danya
 */
@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority{
    
    private final Authority autority;

    @Override
    public String getAuthority() {
        return autority.getName().toString();
    }
    
}
