package com.example.proyectolenguajes.Modelos;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    private int codigoSeccion;

    @ManyToOne
    @JoinColumn(name = "codigo_asignatura")
    private Asignatura asignatura;

    @ManyToOne
    @JoinColumn(name = "codigo_aula")
    private Aula aula;

    private int cupos;
    private int anio;
    private String periodo;
}
