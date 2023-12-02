package com.example.proyectolenguajes.Modelos;




import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
    private int codigoAsignatura;
    private String nombreAsignatura;

    @ManyToOne
    @JoinColumn(name = "id_tipo_aula")
    private TipoAula tipoAula;

    @OneToOne
    @JoinColumn(name = "asignatura_requisito")
    private Asignatura asignaturaRequisito;

    @ManyToOne
    @JoinColumn(name = "codigo_seccion")
    private Seccion seccion;
}