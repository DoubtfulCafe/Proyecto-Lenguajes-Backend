package com.example.proyectolenguajes.Servicios;

import java.util.List;

import com.example.proyectolenguajes.Modelos.Alumno;
import com.example.proyectolenguajes.Modelos.Asignatura;

public interface AsignaturaService {
    
    public Asignatura guardarAsignatura(Asignatura asignatura);

    public String eliminarAsignatura(int codigoAsignatura);

    public List<Asignatura> obtenerTodasAsignaturas();

    public String actualizarAsignatura (int codigoAsignatura, Asignatura asignatura);

    List<Alumno> obtenerAlumnosPorCodigoAsignatura(int codigoAsignatura);

    int obtenerCantidadAlumnosPorCodigoAsignatura(int codigoAsignatura);

}
