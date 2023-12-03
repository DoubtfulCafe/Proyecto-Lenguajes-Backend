package com.example.proyectolenguajes.Servicios;

import java.util.List;

import com.example.proyectolenguajes.Modelos.TipoAula;

public interface TipoAulaService {
    public TipoAula guardarTipoAula(TipoAula tipoAula);

    public String eliminarTipoAula(int idTipoAula);

    public List<TipoAula> obtenerTodos();

    public TipoAula obtenerPorId(int idTipoAula);

    public String actualizarTipoAula(int idTipoAula, TipoAula tipoAula);

}
