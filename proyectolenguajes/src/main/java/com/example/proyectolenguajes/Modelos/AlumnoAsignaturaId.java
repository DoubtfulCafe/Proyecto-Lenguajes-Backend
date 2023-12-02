package com.example.proyectolenguajes.Modelos;
import lombok.*;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoAsignaturaId implements Serializable {

    private int numeroCuenta;
    private int codigoAsignatura;
}
