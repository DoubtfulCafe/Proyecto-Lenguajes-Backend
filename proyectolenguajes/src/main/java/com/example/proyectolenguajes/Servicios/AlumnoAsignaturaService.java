package com.example.proyectolenguajes.Servicios;

import java.util.List;

import com.example.proyectolenguajes.Modelos.AlumnoAsignatura;

public interface AlumnoAsignaturaService {
    
    public AlumnoAsignatura matricular(int numeroCuenta, int codigoAsignatura);

    public List<AlumnoAsignatura> obtenerTodos();

}
