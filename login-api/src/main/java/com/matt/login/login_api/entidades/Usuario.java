package com.matt.login.login_api.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity  // Marca esta clase como una entidad de base de datos
@Data  // Genera automáticamente getters, setters, toString, etc. (gracias a Lombok)
public class Usuario {
    @Id  // Marca el campo como clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Autogenera el ID incremental
    private Long id;  // ID único generado automáticamente

    @Column(unique = true)  // El email debe ser único
    private String email;  // Campo de email

    private String password;  // Campo para guardar la contraseña (encriptada)
}
