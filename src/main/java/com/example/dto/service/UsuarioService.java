package com.example.dto.service;

import com.example.dto.dto.UsuarioRequestDto;
import com.example.dto.dto.UsuarioResponseDto;
import com.example.dto.model.Usuario;
import com.example.dto.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioResponseDto crearUsuario(UsuarioRequestDto usuario){
        // transformacion de DTO  a entiedad
        UUID contransena = UUID.randomUUID();
        Usuario usuarioEntidad = new Usuario(usuario.getCedula(),
                usuario.getNombre(), usuario.getEmail(),
                usuario.getAlias(), contransena.toString(),
                usuario.getEdad(), true, usuario.getApellido());
        this.usuarioRepository.save(usuarioEntidad);
        return new UsuarioResponseDto(usuarioEntidad.getCedula(), usuario.getNombre(), usuario.getEmail());
    }

    public List<UsuarioResponseDto> obtenerUsuarios(){
        // Transformacion de Entidad a DTO
        return usuarioRepository.findAll()
                .stream()
                .map(usuario -> new UsuarioResponseDto(
                        usuario.getCedula(),
                        usuario.getNombre(),
                        usuario.getEmail()
                )).collect(Collectors.toList());
    }
}
