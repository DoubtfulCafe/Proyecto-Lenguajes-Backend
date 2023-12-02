package com.example.proyectolenguajes.Servicios;

import java.util.List;

import com.example.proyectolenguajes.Modelos.Edificio;

public interface EdificioService {
    Edificio guardarEdificio(Edificio edificio);
    Edificio actualizarEdificio(Edificio edificio);
    void eliminarEdificio(int codigoEdificio);
    List<Edificio> obtenerTodosEdificios();
    
}
