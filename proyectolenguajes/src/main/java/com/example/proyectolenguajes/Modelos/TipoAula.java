package com.example.proyectolenguajes.Modelos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipoaula")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoAula {

    @Id
    @Column(name = "idtipoaula")
    private int idTipoAula;
    private String descripcion;
}