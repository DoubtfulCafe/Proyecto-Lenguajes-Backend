package com.example.proyectolenguajes.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyectolenguajes.Modelos.AlumnoAsignatura;

public interface AlumnoAsignaturaRepository extends JpaRepository<AlumnoAsignatura, Integer> {

   public  List<AlumnoAsignatura> findByAlumnoNumeroCuenta(int numeroCuenta);
    
}
