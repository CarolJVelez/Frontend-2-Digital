package com.sg.gestion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.gestion.entities.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}
