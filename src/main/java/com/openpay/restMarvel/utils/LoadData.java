/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openpay.restMarvel.utils;

import com.openpay.restMarvel.repository.AuthorityRepository;
import com.openpay.restMarvel.repository.UsuariosRepository;
import org.springframework.boot.CommandLineRunner;
import com.openpay.restMarvel.entity.Authority;
import com.openpay.restMarvel.entity.Usuarios;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Clase para agregar datos estaticos a la tabla de usuarios
 * @author danya
 */
@Component
public class LoadData implements CommandLineRunner {
    private final UsuariosRepository usuariosRepositorio;
    private final AuthorityRepository authorityRepositorio;

    public LoadData(UsuariosRepository usuariosRepositorio, AuthorityRepository authorityRepositorio) {
        this.usuariosRepositorio = usuariosRepositorio;
        this.authorityRepositorio = authorityRepositorio;
    }
    
    
    

    @Override
    public void run(String... args) throws Exception {
        if (this.authorityRepositorio.count() ==0 ) {
            this.authorityRepositorio.saveAll(List.of(
                    new Authority(AutorityRoles.ADMIN),
                    new Authority(AutorityRoles.READ),
                    new Authority(AutorityRoles.WRITE) 
            ));
        }
        if (this.usuariosRepositorio.count() ==0 ) {
            this.usuariosRepositorio.saveAll(List.of(
                    new Usuarios("danya", "1234", List.of(this.authorityRepositorio.findByName(AutorityRoles.ADMIN).get())),
                    new Usuarios("usuario02","1234", List.of(this.authorityRepositorio.findByName(AutorityRoles.READ).get()))
            ));
        }
        //throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
