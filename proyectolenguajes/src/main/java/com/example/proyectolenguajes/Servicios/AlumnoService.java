package com.example.proyectolenguajes.Servicios;

import java.util.List;

import com.example.proyectolenguajes.Modelos.Alumno;

public interface AlumnoService {
    
    public Alumno guardarAlumno(Alumno alumno);

    public String eliminarAlumno(int numeroCuenta);

    public Alumno obtenerPorId(int numeroCuenta);

    public List<Alumno> obtenerTodos();

    public String actualizarAlumno (int numeroCuenta, Alumno alumno);

    /*void matricularAlumno(int numeroCuenta, int codigoAsignatura);

    List<Asignatura> obtenerAsignaturasPorNumeroCuenta(int numeroCuenta);*/

     

}
