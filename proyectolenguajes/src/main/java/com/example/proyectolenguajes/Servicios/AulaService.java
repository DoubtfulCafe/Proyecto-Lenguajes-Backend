package com.example.proyectolenguajes.Servicios;

import java.util.List;

import com.example.proyectolenguajes.Modelos.Aula;

public interface AulaService {
    public Aula guardarAula(Aula aula);

    public String eliminarAula(int codigoAula);

    public List<Aula> obtenerTodasAulas();

    public String actualizarAula(int codigoAula, Aula aula);

    
}
