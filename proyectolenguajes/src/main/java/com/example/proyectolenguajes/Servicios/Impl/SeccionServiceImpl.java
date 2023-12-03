package com.example.proyectolenguajes.Servicios.Impl;

import com.example.proyectolenguajes.Servicios.SeccionService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectolenguajes.Modelos.Seccion;
import com.example.proyectolenguajes.Repositorios.SeccionRepository;

@Service
public class SeccionServiceImpl implements SeccionService {

    @Autowired
    private SeccionRepository seccionRepository;

    @Override
    public Seccion guardarSeccion(Seccion seccion) {
        return seccionRepository.save(seccion);
    }

    @Override
    public String eliminarSeccion(int codigoSeccion) {
        Seccion seccionEliminar = seccionRepository.findById(codigoSeccion).orElse(null);

        if (seccionEliminar != null) {
            seccionRepository.delete(seccionEliminar);
            return "Sección eliminada";
        }

        return "Sección a eliminar no encontrada";
    }

    @Override
    public List<Seccion> obtenerTodasSecciones() {
        return seccionRepository.findAll();
    }

    @Override
    public String actualizarSeccion(int codigoSeccion, Seccion seccion) {
        Seccion seccionActualizar = seccionRepository.findById(codigoSeccion).orElse(null);

        if (seccionActualizar != null) {
            seccionActualizar.setCupos(seccion.getCupos());
            seccionActualizar.setAnio(seccion.getAnio());
            seccionActualizar.setPeriodo(seccion.getPeriodo());
            // Actualiza otros campos según sea necesario
            seccionRepository.save(seccionActualizar);
            return "Sección actualizada";
        }

        return "Sección a actualizar no encontrada";
    }

    @Override
    public Seccion obtenerPorId(int codigoSeccion) {
        return this.seccionRepository.findById(codigoSeccion).get();
    }
}

