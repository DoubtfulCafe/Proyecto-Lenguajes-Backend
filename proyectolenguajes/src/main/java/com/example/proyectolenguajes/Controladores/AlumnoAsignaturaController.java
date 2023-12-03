package com.example.proyectolenguajes.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyectolenguajes.Modelos.AlumnoAsignatura;
import com.example.proyectolenguajes.Servicios.Impl.AlumnoAsignaturaServiceImpl;

@RestController
@RequestMapping("/api/alumnoasignatura")
public class AlumnoAsignaturaController {
    
    @Autowired
    private AlumnoAsignaturaServiceImpl alumnoAsignaturaServiceImpl;

    @PostMapping("/matricular/{numeroCuenta}/{codigoAsignatura}")
    public AlumnoAsignatura matricular(@PathVariable(name = "numeroCuenta") int numeroCuenta, @PathVariable(name = "codigoAsignatura") int codigoAsignatura){
        return this.alumnoAsignaturaServiceImpl.matricular(numeroCuenta, codigoAsignatura);
    }

}
