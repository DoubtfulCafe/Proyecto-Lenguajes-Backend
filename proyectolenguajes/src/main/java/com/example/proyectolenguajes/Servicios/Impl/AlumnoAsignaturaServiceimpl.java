package com.example.proyectolenguajes.Servicios.Impl;



import com.example.proyectolenguajes.Modelos.AlumnoAsignatura;
import com.example.proyectolenguajes.Repositorios.AlumnoAsignaturaRepository;
import com.example.proyectolenguajes.Servicios.AlumnoAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoAsignaturaServiceImpl implements AlumnoAsignaturaService {

    @Autowired
    private AlumnoAsignaturaRepository alumnoAsignaturaRepository;

    @Override
    public AlumnoAsignatura matricularAlumno(AlumnoAsignatura alumnoAsignatura) {
        return alumnoAsignaturaRepository.save(alumnoAsignatura);
    }

    @Override
    public List<AlumnoAsignatura> obtenerAsignaturasDelAlumno(int numeroCuenta) {
        return alumnoAsignaturaRepository.findAllByAlumnoNumeroCuenta(numeroCuenta);
    }

    @Override
    public List<AlumnoAsignatura> obtenerAlumnosDeAsignatura(int codigoAsignatura) {
        return alumnoAsignaturaRepository.findAllByAsignaturaCodigoAsignatura(codigoAsignatura);
    }

    @Override
    public int obtenerCantidadAlumnosPorAsignatura(int codigoAsignatura) {
        List<AlumnoAsignatura> alumnosEnAsignatura = obtenerAlumnosDeAsignatura(codigoAsignatura);
        return alumnosEnAsignatura.size();
    }
}

