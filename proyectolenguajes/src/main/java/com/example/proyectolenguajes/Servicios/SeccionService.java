package com.example.proyectolenguajes.Servicios;

import java.util.List;

import com.example.proyectolenguajes.Modelos.Seccion;

public interface SeccionService {

    Seccion guardarSeccion(Seccion seccion);

    String eliminarSeccion(int codigoSeccion);

    List<Seccion> obtenerTodasSecciones();

    String actualizarSeccion(int codigoSeccion, Seccion seccion);

    public Seccion obtenerPorId(int codigoSeccion);
}

