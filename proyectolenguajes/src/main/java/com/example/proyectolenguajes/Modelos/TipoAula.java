package com.example.proyectolenguajes.Modelos;


import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TipoAula")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoAula {

    @Id
    private int idTipoAula;
    private String descripcion;
}