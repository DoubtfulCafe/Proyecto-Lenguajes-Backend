package com.example.proyectolenguajes.Modelos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Seccion")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Seccion {

    @Id
    @Column(name = "codigoseccion")
    private int codigoSeccion;

    @ManyToOne
    @JoinColumn(name = "codigoasignatura")
    private Asignatura asignatura;

    @ManyToOne
    @JoinColumn(name = "codigoaula")
    private Aula aula;

    private int cupos;
    private int anio;
    private String periodo;
}
