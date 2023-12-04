package com.example.proyectolenguajes.Modelos;




import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Asignatura")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Asignatura {

    @Id
    @Column(name = "codigoasignatura")
    private int codigoAsignatura;
    @Column(name = "nombreasignatura")
    private String nombreAsignatura;

    @ManyToOne
    @JoinColumn(name = "idtipoaula")
    private TipoAula tipoAula;

    @OneToOne
    @JoinColumn(name = "asignaturarequisito")
    private Asignatura asignaturaRequisito;

    @ManyToOne
    @JoinColumn(name = "codigoseccion")
    private Seccion seccion;

    /*@ManyToMany(mappedBy = "asignaturas")
    private List<Alumno> Alumnos;*/

}