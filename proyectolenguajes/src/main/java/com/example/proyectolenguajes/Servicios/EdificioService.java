package com.example.proyectolenguajes.Servicios;

import java.util.List;

import com.example.proyectolenguajes.Modelos.Edificio;

public interface EdificioService {

    public Edificio guardarEdificio(Edificio edificio);

    public String actualizarEdificio(int codigoEdifico, Edificio edificio);

    public String eliminarEdificio(int codigoEdificio);

    public Edificio obtenerPorId(int codigoEdificio);

    public List<Edificio> obtenerTodosEdificios();
    
}
