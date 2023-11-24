package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer>{

}
