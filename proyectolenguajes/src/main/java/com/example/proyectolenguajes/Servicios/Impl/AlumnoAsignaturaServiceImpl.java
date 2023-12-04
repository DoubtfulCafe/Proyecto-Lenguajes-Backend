package com.example.proyectolenguajes.Servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectolenguajes.Modelos.Alumno;
import com.example.proyectolenguajes.Modelos.AlumnoAsignatura;
import com.example.proyectolenguajes.Modelos.Asignatura;
import com.example.proyectolenguajes.Repositorios.AlumnoAsignaturaRepository;
import com.example.proyectolenguajes.Repositorios.AlumnoRepository;
import com.example.proyectolenguajes.Repositorios.AsignaturaRepository;
import com.example.proyectolenguajes.Servicios.AlumnoAsignaturaService;

@Service
public class AlumnoAsignaturaServiceImpl implements AlumnoAsignaturaService {

    @Autowired
    private AlumnoServiceImpl alumnoServiceImpl;

    @Autowired
    private AsignaturaServiceImpl asignaturaServiceImpl;

    @Autowired
    private AlumnoAsignaturaRepository alumnoAsignaturaRepository;

    @Override
    public AlumnoAsignatura matricular(int numeroCuenta, int codigoAsignatura) {
        AlumnoAsignatura nvAlumnoAsignatura = new AlumnoAsignatura();
        nvAlumnoAsignatura.setNumerocuenta(numeroCuenta);
        nvAlumnoAsignatura.setCodigoasignatura(codigoAsignatura);
        return this.alumnoAsignaturaRepository.save(nvAlumnoAsignatura);
    }

    @Override
    public List<AlumnoAsignatura> obtenerTodos() {
        return this.alumnoAsignaturaRepository.findAll();
    }
    
}
