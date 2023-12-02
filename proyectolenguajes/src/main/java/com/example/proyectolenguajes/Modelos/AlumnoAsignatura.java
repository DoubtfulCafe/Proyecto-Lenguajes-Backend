package com.example.proyectolenguajes.Modelos;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "alumnoasignatura")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoAsignatura {

    @EmbeddedId
    private AlumnoAsignaturaId id;

    @ManyToOne
    @MapsId("numeroCuenta")
    @JoinColumn(name = "numero_cuenta")
    private Alumno alumno;

    @ManyToOne
    @MapsId("codigoAsignatura")
    @JoinColumn(name = "codigo_asignatura")
    private Asignatura asignatura;
}