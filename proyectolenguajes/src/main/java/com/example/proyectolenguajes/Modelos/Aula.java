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
@Table(name = "Aula")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aula {

    @Id
    private int codigoAula;

    @ManyToOne
    @JoinColumn(name = "codigo_edificio")
    private Edificio edificio;

    @ManyToOne
    @JoinColumn(name = "id_tipo_aula")
    private TipoAula tipoAula;

    private int capacidad;
}