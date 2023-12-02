package com.example.proyectolenguajes.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyectolenguajes.Modelos.Edificio;

public interface EdificioRepository extends JpaRepository<Edificio, Integer> {
    
}
