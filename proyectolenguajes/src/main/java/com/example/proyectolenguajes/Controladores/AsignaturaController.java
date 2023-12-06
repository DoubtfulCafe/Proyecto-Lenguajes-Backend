package com.example.proyectolenguajes.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.proyectolenguajes.Modelos.Asignatura;
import com.example.proyectolenguajes.Servicios.Impl.AsignaturaServiceImpl;

@RestController
@RequestMapping("/api/asignaturas")
public class AsignaturaController {

    @Autowired
    private AsignaturaServiceImpl asignaturaServiceImpl;

    @PostMapping("/guardar")
    public Asignatura guardarAsignatura(@RequestBody Asignatura asignatura) {
        return this.asignaturaServiceImpl.guardarAsignatura(asignatura);
    }

    @GetMapping("/todos")
    public List<Asignatura> obtenerTodasAsignaturas() {
        return this.asignaturaServiceImpl.obtenerTodasAsignaturas();
    }

    @GetMapping("/obtener/{codigoAsignatura}")
    public Asignatura obtenerPorId(@PathVariable(name = "codigoAsignatura") int codigoAsignatura){
        return this.asignaturaServiceImpl.obtenerPorId(codigoAsignatura);
    }

    @DeleteMapping("/eliminar/{codigoAsignatura}")
    public String eliminarAsignatura(@PathVariable(name = "codigoAsignatura") int codigoAsignatura) {
        return this.asignaturaServiceImpl.eliminarAsignatura(codigoAsignatura);
    }

    @PutMapping("/actualizar/{codigoAsignatura}")
    public String actualizarAsignatura(@PathVariable(name = "codigoAsignatura") int codigoAsignatura, @RequestBody Asignatura asignatura) {
        return this.asignaturaServiceImpl.actualizarAsignatura(codigoAsignatura, asignatura);
    }

    /*@GetMapping("/{codigoAsignatura}/alumnos")
    public List<Alumno> obtenerAlumnosPorCodigoAsignatura(@PathVariable int codigoAsignatura) {
        return asignaturaServiceImpl.obtenerAlumnosPorCodigoAsignatura(codigoAsignatura);
    }

    @GetMapping("/{codigoAsignatura}/cantidad-alumnos")
    public int obtenerCantidadAlumnosPorCodigoAsignatura(@PathVariable int codigoAsignatura) {
        return asignaturaServiceImpl.obtenerCantidadAlumnosPorCodigoAsignatura(codigoAsignatura);
    }*/
}

