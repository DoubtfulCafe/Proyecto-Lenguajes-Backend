package com.example.proyectolenguajes.Modelos;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "AlumnoAsignatura")
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