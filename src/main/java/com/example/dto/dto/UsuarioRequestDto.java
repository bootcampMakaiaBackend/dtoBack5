package com.example.dto.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class UsuarioRequestDto {
    private Integer cedula;
    private String nombre;
    private String email;
    private String alias;
    private String edad;
    private String apellido;

    public UsuarioRequestDto(Integer cedula, String nombre, String email, String alias, String edad, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        this.alias = alias;
        this.edad = edad;
        this.apellido = apellido;
    }

    public Integer getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getAlias() {
        return alias;
    }

    public String getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }
}
