package com.example.proyectolenguajes.Modelos;




import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
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


    //creando la tabla intermedia
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    @JoinTable(
        name="alumnoasignatura" , joinColumns = @JoinColumn(name="numerocuenta",referencedColumnName = "numerocuenta"),
        inverseJoinColumns = @JoinColumn(name="codigoasignatura",referencedColumnName = "codigoasignatura")
    )
    private List<Asignatura> asignaturas;

    @OneToOne(mappedBy = "alumno", cascade = CascadeType.ALL)
    private AlumnoAsignatura alumnoAsignatura;
}
    
