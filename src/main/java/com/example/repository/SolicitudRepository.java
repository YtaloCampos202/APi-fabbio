package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Solicitud;

public interface SolicitudRepository extends JpaRepository<Solicitud, Integer> {

}
