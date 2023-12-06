package com.example.proyectolenguajes.Servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectolenguajes.Modelos.Asignatura;
import com.example.proyectolenguajes.Repositorios.AsignaturaRepository;
import com.example.proyectolenguajes.Servicios.AsignaturaService;

@Service
public class AsignaturaServiceImpl implements AsignaturaService{

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    @Override
    public Asignatura guardarAsignatura(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    @Override
    public String eliminarAsignatura(int codigoAsignatura) {
        Asignatura asignaturaEliminar = this.asignaturaRepository.findById(codigoAsignatura).get();

        if (asignaturaEliminar != null) {
            this.asignaturaRepository.delete(asignaturaEliminar);
            return "Asignatura eliminada";
        }

        return "Asignatura a eliminar no encontrada";
    }

    @Override
    public List<Asignatura> obtenerTodasAsignaturas() {
        return this.asignaturaRepository.findAll();
    }

    @Override
    public String actualizarAsignatura(int codigoAsignatura, Asignatura asignatura) {
        Asignatura asignaturaActualizar = this.asignaturaRepository.findById(codigoAsignatura).get();

        if (asignaturaActualizar != null) {
            asignaturaActualizar.setNombreAsignatura(asignatura.getNombreAsignatura());
            asignaturaActualizar.setAsignaturaRequisito(asignatura.getAsignaturaRequisito());
            this.asignaturaRepository.save(asignaturaActualizar);
            return "Asignatura actualizada";
        }

        return "Asignatura a actualizar no encontrada";
    }
    

    /*@Override
    public List<Alumno> obtenerAlumnosPorCodigoAsignatura(int codigoAsignatura) {
        Asignatura asignatura = asignaturaRepository.findById(codigoAsignatura)
                .orElseThrow(() -> new RuntimeException("Asignatura no encontrada"));
        return asignatura.getAlumnos();
    }

    @Override
    public int obtenerCantidadAlumnosPorCodigoAsignatura(int codigoAsignatura) {
        Asignatura asignatura = asignaturaRepository.findById(codigoAsignatura)
                .orElseThrow(() -> new RuntimeException("Asignatura no encontrada"));
        return asignatura.getAlumnos().size();
    }*/

    @Override
    public Asignatura obtenerPorId(int codigoAsignatura) {
        return this.asignaturaRepository.findById(codigoAsignatura).get();
    }
}
