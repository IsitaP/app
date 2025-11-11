package com.ingesoft.redsocial.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ingesoft.redsocial.modelo.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
