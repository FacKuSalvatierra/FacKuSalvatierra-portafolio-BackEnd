package com.fackusalvatierra.wfs.service;

import com.fackusalvatierra.wfs.exception.UserNotFoundExecption;
import com.fackusalvatierra.wfs.models.Educacion;
import com.fackusalvatierra.wfs.models.Usuario;
import com.fackusalvatierra.wfs.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class UsuarioService {
    private final UsuarioRepo usuarioRepo;

    @Autowired
    public UsuarioService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    //Agregar nueva persona
    public Usuario addUser(Usuario usuario){
        return usuarioRepo.save(usuario);
    }

    public List<Usuario> buscarUsuario(){
        return usuarioRepo.findAll();
    }

    //Actualizacion de usuario
    public Usuario editarUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }

    //Borrar usuario a traves del ID
    public void borrarusuario(Long id){
        usuarioRepo.deleteById(id);
    }

    public Usuario buscarUsuarioPorId(Long id){
        return usuarioRepo.findById(id).orElseThrow(() ->new UserNotFoundExecption("Usuario no encontrado"));
    }
}
