package com.example.proyectolenguajes.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AsignaturaDTO {
    private int codigoAsignatura;
    private String nombreAsignatura;
    private String nombreTipoAula;
    private int idAsignaturaRequisito;
    private String nombreSeccion;
}

