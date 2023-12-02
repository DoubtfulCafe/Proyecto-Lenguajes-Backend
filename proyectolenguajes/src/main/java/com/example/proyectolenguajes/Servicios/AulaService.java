package com.example.proyectolenguajes.Servicios;

import java.util.List;

import com.example.proyectolenguajes.Modelos.Aula;

public interface AulaService {
    Aula guardarAula(Aula aula);
    Aula actualizarAula(Aula aula);
    void eliminarAula(int codigoAula);
    List<Aula> obtenerTodosAulas();
    
}
