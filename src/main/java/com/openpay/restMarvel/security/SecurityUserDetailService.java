/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openpay.restMarvel.security;

import com.openpay.restMarvel.security.SecurityUser;
import com.openpay.restMarvel.repository.UsuariosRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author danya
 */
@Service
public class SecurityUserDetailService implements UserDetailsService{
    private final UsuariosRepository usuariosRepository;

    public SecurityUserDetailService(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var usuario = this.usuariosRepository.findByUsername(username);
        if (usuario.isPresent()) {
            return new SecurityUser(usuario.get());
        }
        throw new UsernameNotFoundException("Usuario no encontrado: "+username);
    }
    
    
    
}
