package com.example.proyectolenguajes.Servicios.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectolenguajes.Modelos.Alumno;
import com.example.proyectolenguajes.Modelos.AlumnoAsignatura;
import com.example.proyectolenguajes.Modelos.Asignatura;
import com.example.proyectolenguajes.Repositorios.AlumnoAsignaturaRepository;
import com.example.proyectolenguajes.Repositorios.AlumnoRepository;
import com.example.proyectolenguajes.Servicios.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService{

    @Autowired
    private  AlumnoAsignaturaRepository alumnoAsignaturaRepository;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public Alumno guardarAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public String eliminarAlumno(int numeroCuenta) {
        Alumno alumnoEliminar = this.alumnoRepository.findById(numeroCuenta).get();

        if(alumnoEliminar != null){
            this.alumnoRepository.delete(alumnoEliminar);
            return "Alumno eliminado";
        }

        return "Alumno a eliminar no encontrado";
    }

    @Override
    public List<Alumno> obtenerTodos() {
        return this.alumnoRepository.findAll();
    }

    @Override
    public String actualizarAlumno(int numeroCuenta, Alumno alumno) {
        Alumno alumnoActualizar = this.alumnoRepository.findById(numeroCuenta).get();

        if (alumnoActualizar != null) {
            alumnoActualizar.setNombre(alumno.getNombre());
            alumnoActualizar.setApellido(alumno.getApellido());
            this.alumnoRepository.save(alumnoActualizar);
            return "Alumno actualizado";
        }

        return "Alumno a actualizar no encontrado";
    }

    
    public AlumnoServiceImpl(AlumnoAsignaturaRepository alumnoAsignaturaRepository) {
        this.alumnoAsignaturaRepository = alumnoAsignaturaRepository;
    }

    @Override
    public List<AlumnoAsignatura> obtenerAsignaturasPorNumeroCuenta(int numeroCuenta) {
        return alumnoAsignaturaRepository.findByAlumnoNumeroCuenta(numeroCuenta);
    }
}

  

