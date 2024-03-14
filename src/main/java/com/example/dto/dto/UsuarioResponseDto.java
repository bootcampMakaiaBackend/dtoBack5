package com.example.dto.dto;

public class UsuarioResponseDto {
    private Integer cedula;
    private String nombre;
    private String email;

    public UsuarioResponseDto(Integer cedula, String nombre, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
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
}
