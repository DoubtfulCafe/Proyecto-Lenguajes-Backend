package com.example.proyectolenguajes.Servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectolenguajes.Modelos.TipoAula;
import com.example.proyectolenguajes.Repositorios.TipoAulaRepository;
import com.example.proyectolenguajes.Servicios.TipoAulaService;

@Service
public class TipoAulaServiceImpl implements TipoAulaService{

    @Autowired
    private TipoAulaRepository tipoAulaRepository;

    public TipoAula guardarTipoAula(TipoAula tipoAula) {
        return tipoAulaRepository.save(tipoAula);
    }

    public String eliminarTipoAula(int idTipoAula) {
        TipoAula tipoAulaEliminar = this.tipoAulaRepository.findById(idTipoAula).orElse(null);

        if (tipoAulaEliminar != null) {
            this.tipoAulaRepository.delete(tipoAulaEliminar);
            return "Tipo de Aula eliminado";
        }

        return "Tipo de Aula a eliminar no encontrado";
    }

    public List<TipoAula> obtenerTodos() {
        return this.tipoAulaRepository.findAll();
    }

    public String actualizarTipoAula(int idTipoAula, TipoAula tipoAula) {
        TipoAula tipoAulaActualizar = this.tipoAulaRepository.findById(idTipoAula).orElse(null);

        if (tipoAulaActualizar != null) {
            tipoAulaActualizar.setDescripcion(tipoAula.getDescripcion());
            this.tipoAulaRepository.save(tipoAulaActualizar);
            return "Tipo de Aula actualizado";
        }

        return "Tipo de Aula a actualizar no encontrado";
    }

    @Override
    public TipoAula obtenerPorId(int idTipoAula) {
        return this.tipoAulaRepository.findById(idTipoAula).get();
    }
}

