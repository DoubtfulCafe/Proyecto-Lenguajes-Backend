package com.example.proyectolenguajes.Modelos;




import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Edificio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Edificio {

    @Id
    private int codigoEdificio;
    private String nombre;
    private int cantidadAulas;
}