package com.example.proyectolenguajes.Servicios;

import java.util.List;

import com.example.proyectolenguajes.Modelos.TipoAula;

public interface TipoAulaService {
    public TipoAula guardarTipoAula(TipoAula tipoAula);

    public String eliminarTipoAula(int idTipoAula);

    public List<TipoAula> obtenerTodosTiposAula();

    public String actualizarTipoAula(int idTipoAula, TipoAula tipoAula);

}
