package com.example.dto.controller;

import com.example.dto.dto.UsuarioRequestDto;
import com.example.dto.dto.UsuarioResponseDto;
import com.example.dto.model.Usuario;
import com.example.dto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/usuarios")
    public UsuarioResponseDto crearUsuario(@RequestBody UsuarioRequestDto usuarioRequestDto){
        return this.usuarioService.crearUsuario(usuarioRequestDto);
    }

    @GetMapping("/usuarios")
    public List<UsuarioResponseDto> obtenerUsuarios(){
        return this.usuarioService.obtenerUsuarios();
    }
}
