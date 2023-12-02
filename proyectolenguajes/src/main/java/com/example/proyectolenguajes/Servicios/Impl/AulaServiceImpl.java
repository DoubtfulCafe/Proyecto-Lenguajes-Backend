package com.example.proyectolenguajes.Servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardarAula'");
    }

    @Override
    public Aula actualizarAula(Aula aula) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarAula'");
    }

    @Override
    public void eliminarAula(int codigoAula) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarAula'");
    }

    @Override
    public List<Aula> obtenerTodosAulas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerTodosAulas'");
    }

  
}
