package com.example.proyectolenguajes.Servicios;

import java.util.List;

import com.example.proyectolenguajes.Modelos.Alumno;
import com.example.proyectolenguajes.Modelos.AlumnoAsignatura;
import com.example.proyectolenguajes.Modelos.Asignatura;

public interface AlumnoService {
    
    public Alumno guardarAlumno(Alumno alumno);

    public String eliminarAlumno(int numeroCuenta);

    public List<Alumno> obtenerTodos();

    public String actualizarAlumno (int numeroCuenta, Alumno alumno);

     public List<AlumnoAsignatura> obtenerAsignaturasPorNumeroCuenta(int numeroCuenta);

}
