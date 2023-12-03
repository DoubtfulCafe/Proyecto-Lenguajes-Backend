

package com.example.proyectolenguajes.Controladores;

import com.example.proyectolenguajes.Modelos.AlumnoAsignatura;
import com.example.proyectolenguajes.Servicios.AlumnoAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnoasignatura")
public class AlumnoAsignaturaController {

    @Autowired
    private AlumnoAsignaturaService alumnoAsignaturaService;

    @PostMapping("/matricular")
    public AlumnoAsignatura matricularAlumno(@RequestBody AlumnoAsignatura alumnoAsignatura) {
        return alumnoAsignaturaService.matricularAlumno(alumnoAsignatura);
    }

    @GetMapping("/asignaturas/{numeroCuenta}")
    public List<AlumnoAsignatura> obtenerAsignaturasDelAlumno(@PathVariable int numeroCuenta) {
        return alumnoAsignaturaService.obtenerAsignaturasDelAlumno(numeroCuenta);
    }

    @GetMapping("/alumnos/{codigoAsignatura}")
    public List<AlumnoAsignatura> obtenerAlumnosDeAsignatura(@PathVariable int codigoAsignatura) {
        return alumnoAsignaturaService.obtenerAlumnosDeAsignatura(codigoAsignatura);
    }

    @GetMapping("/cantidadalumnos/{codigoAsignatura}")
    public int obtenerCantidadAlumnosPorAsignatura(@PathVariable int codigoAsignatura) {
        return alumnoAsignaturaService.obtenerCantidadAlumnosPorAsignatura(codigoAsignatura);
    }
}
