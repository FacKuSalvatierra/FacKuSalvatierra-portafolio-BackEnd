package com.fackusalvatierra.wfs.controller;

import com.fackusalvatierra.wfs.models.Usuario;
import com.fackusalvatierra.wfs.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost4200")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    //traer Usuario
    @GetMapping("/id/{id}")

    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id") Long id){
        Usuario  usuario=usuarioService.buscarUsuarioPorId(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
        Usuario updateUsuario=usuarioService.editarUsuario(usuario);
        return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
    }


}
