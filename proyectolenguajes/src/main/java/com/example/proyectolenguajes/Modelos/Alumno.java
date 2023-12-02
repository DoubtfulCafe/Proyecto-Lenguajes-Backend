package com.example.proyectolenguajes.Modelos;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Alumno")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

    @Id
    @Column(name = "numerocuenta")
    private int numeroCuenta;
    private String nombre;
    private String apellido;
}
    
