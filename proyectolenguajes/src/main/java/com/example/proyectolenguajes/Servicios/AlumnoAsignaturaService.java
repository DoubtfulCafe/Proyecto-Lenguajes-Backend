package com.example.proyectolenguajes.Servicios;



import com.example.proyectolenguajes.Modelos.AlumnoAsignatura;

import java.util.List;

public interface AlumnoAsignaturaService {
    
    AlumnoAsignatura matricularAlumno(AlumnoAsignatura alumnoAsignatura);

    List<AlumnoAsignatura> obtenerAsignaturasDelAlumno(int numeroCuenta);

    List<AlumnoAsignatura> obtenerAlumnosDeAsignatura(int codigoAsignatura);

    int obtenerCantidadAlumnosPorAsignatura(int codigoAsignatura);
}

