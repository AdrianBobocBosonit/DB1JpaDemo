package com.bosonit.DB1JpaDemo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Usuario {
    @Id
    private String id;

    private String nombreUsuario;
    private int edad;
    private String ciudad;
}
