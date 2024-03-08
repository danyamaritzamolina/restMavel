/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openpay.restMarvel.entity;

import com.openpay.restMarvel.utils.AutorityRoles;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.Collection;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Clase para definir la entidad de usuarios para la base de datos
 *
 * @author danya
 */
@Getter
@Setter
@Entity
@Table(name = "usuarios")
//@Table(name="usuarios", uniqueContraints=@UniqueConstraint(columnNames="id"))
public class Usuarios {

    public Usuarios(String nombre, String contrasena, List<Authority> autorities) {
        this.username = nombre;
        this.contrasena = contrasena;
        this.autorities = autorities;
    }

    public Usuarios(int id, String nombre, String contrasena) {
        this.id = id;
        this.username = nombre;
        this.contrasena = contrasena;
    }

    public Usuarios(String nombre, String contrasena) {
        this.username = nombre;
        this.contrasena = contrasena;
    }

    public Usuarios() {
        super();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "username")
    private String username;
    
    
    @Column(name = "contrasena")
    private String contrasena;
    
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_autorities",
            joinColumns = @JoinColumn(name = "usuarios_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "aut_id", referencedColumnName = "id"))
    private List<Authority> autorities;

}
