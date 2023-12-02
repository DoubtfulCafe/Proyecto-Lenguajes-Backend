package com.example.proyectolenguajes.Servicios.Impl;

import java.util.List;

import com.example.proyectolenguajes.Modelos.Edificio;
import com.example.proyectolenguajes.Repositorios.EdificioRepository;
import com.example.proyectolenguajes.Servicios.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EdificionServiceImpl implements EdificioService {

    private  EdificioRepository edificioRepository;

   

    @Override
    public Edificio guardarEdificio(Edificio edificio) {
        return edificioRepository.save(edificio);
    }

    @Override
    public Edificio actualizarEdificio(Edificio edificio) {
        return edificioRepository.save(edificio);
    }

    @Override
    public void eliminarEdificio(int codigoEdificio) {
        edificioRepository.deleteById(codigoEdificio);
    }

    @Override
    public List<Edificio> obtenerTodosEdificios() {
        return edificioRepository.findAll();
    }

  
}