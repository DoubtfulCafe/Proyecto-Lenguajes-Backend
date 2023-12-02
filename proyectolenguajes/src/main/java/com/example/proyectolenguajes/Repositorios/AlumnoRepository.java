package com.example.proyectolenguajes.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyectolenguajes.Modelos.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
    
}
