package com.fackusalvatierra.wfs.repository;

import com.fackusalvatierra.wfs.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}
