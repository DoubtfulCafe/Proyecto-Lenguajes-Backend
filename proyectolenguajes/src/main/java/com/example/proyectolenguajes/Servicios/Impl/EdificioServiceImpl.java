package com.example.proyectolenguajes.Servicios.Impl;

import java.util.List;

import com.example.proyectolenguajes.Modelos.Edificio;
import com.example.proyectolenguajes.Repositorios.EdificioRepository;
import com.example.proyectolenguajes.Servicios.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EdificioServiceImpl implements EdificioService {

    @Autowired
    private  EdificioRepository edificioRepository;

    @Override
    public Edificio guardarEdificio(Edificio edificio) {
        return edificioRepository.save(edificio);
    }

    @Override
    public String actualizarEdificio(int codigoEdifico, Edificio edificio) {
        Edificio edificioActualizar = this.edificioRepository.findById(codigoEdifico).get();

        if (edificioActualizar != null) {
            edificioActualizar.setNombre(edificio.getNombre());
            edificioActualizar.setCantidadAulas(edificio.getCantidadAulas());
            this.edificioRepository.save(edificioActualizar);
            return "Edificio actualizado";
        }

        return "Edificio a actualizar no encontrafo";
    }

    @Override
    public String eliminarEdificio(int codigoEdificio) {
        Edificio edificioEliminar = this.edificioRepository.findById(codigoEdificio).get();
        if (edificioEliminar != null) {
            this.edificioRepository.delete(edificioEliminar);
            return "Edificio eliminado";
        }

        return "Edificio a eliminar no encontrado";
    }

    @Override
    public List<Edificio> obtenerTodosEdificios() {
        return this.edificioRepository.findAll();
    }

    @Override
    public Edificio obtenerPorId(int codigoEdificio) {
        return this.edificioRepository.findById(codigoEdificio).get();
    }
  
}