package com.ingesoft.redsocial.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ingesoft.redsocial.modelo.SolicitudAmistad;

@Repository
public interface SolicitudAmistadRepository extends JpaRepository<SolicitudAmistad, Long> {

}
