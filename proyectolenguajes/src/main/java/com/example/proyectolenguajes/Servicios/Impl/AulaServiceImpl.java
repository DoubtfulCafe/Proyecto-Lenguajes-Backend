package com.example.proyectolenguajes.Servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.proyectolenguajes.Modelos.Aula;
import com.example.proyectolenguajes.Modelos.Aula;
import com.example.proyectolenguajes.Repositorios.AulaRepository;
import com.example.proyectolenguajes.Servicios.AulaService;


import java.util.List;

import com.example.proyectolenguajes.Modelos.Edificio;
import com.example.proyectolenguajes.Repositorios.EdificioRepository;
import com.example.proyectolenguajes.Servicios.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AulaServiceImpl implements AulaService {
    
    @Autowired
    private AulaRepository aulaRepository;
    
    @Override
    public Aula guardarAula(Aula aula) {
        return aulaRepository.save(aula);
    }
    
    @Override
    public String eliminarAula(int codigoAula) {
        Aula aulaEliminar = this.aulaRepository.findById(codigoAula).orElse(null);
    
        if (aulaEliminar != null) {
            this.aulaRepository.delete(aulaEliminar);
            return "Aula eliminada";
        }
    
        return "Aula a eliminar no encontrada";
    }
    
    @Override
    public List<Aula> obtenerTodasAulas() {
        return this.aulaRepository.findAll();
    }
    
    @Override
    public String actualizarAula(int codigoAula, Aula aula) {
        Aula aulaActualizar = this.aulaRepository.findById(codigoAula).orElse(null);
    
        if (aulaActualizar != null) {
           
            aulaActualizar.setTipoAula(aula.getTipoAula());
            aulaActualizar.setCapacidad(aula.getCapacidad());
            this.aulaRepository.save(aulaActualizar);
            return "Aula actualizada";
        }
    
        return "Aula a actualizar no encontrada";
    }
    
}