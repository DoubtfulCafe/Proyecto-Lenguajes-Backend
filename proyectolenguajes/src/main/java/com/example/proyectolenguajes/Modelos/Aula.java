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
@Table(name = "Aula")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aula {

    @Id
    @Column(name = "codigoaula")
    private int codigoAula;

    @ManyToOne
    @JoinColumn(name = "codigoedificio")
    private Edificio edificio;

    @ManyToOne
    @JoinColumn(name = "idtipoaula")
    private TipoAula tipoAula;

    private int capacidad;
}