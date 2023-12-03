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
        Alumno alumnoMatricular = alumnoServiceImpl.obtenerPorId(numeroCuenta);
        Asignatura asignaturaMatricular = asignaturaServiceImpl.obtenerPorId(codigoAsignatura);
        AlumnoAsignatura alumnoAsignaturaMatricular = new AlumnoAsignatura();

        if (alumnoMatricular != null && asignaturaMatricular != null){
            alumnoAsignaturaMatricular.setAlumno(alumnoMatricular);
            alumnoAsignaturaMatricular.setAsignatura(asignaturaMatricular);
        }
        
        return alumnoAsignaturaRepository.save(alumnoAsignaturaMatricular);

    }

    @Override
    public List<AlumnoAsignatura> obtenerTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerTodos'");
    }
    
}
