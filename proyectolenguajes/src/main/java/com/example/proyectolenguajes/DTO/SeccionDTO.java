package com.example.proyectolenguajes.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeccionDTO {
    private int codigoSeccion;
    private int codigoAsignatura;
    private int codigoAula;
    private int cupos;
    private int anio;
    private String periodo;
}

