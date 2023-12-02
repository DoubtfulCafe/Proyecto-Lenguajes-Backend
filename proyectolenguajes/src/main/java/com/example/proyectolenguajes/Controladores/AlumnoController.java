package com.example.proyectolenguajes.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyectolenguajes.Modelos.Alumno;
import com.example.proyectolenguajes.Servicios.Impl.AlumnoServiceImpl;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {
    
    @Autowired
    private AlumnoServiceImpl alumnoServiceImpl;

    @PostMapping("/guardar")
    public Alumno guardarAlumno(@RequestBody Alumno nvoAlumno){
        return this.alumnoServiceImpl.guardarAlumno(nvoAlumno);
    }

    @GetMapping("/todos")
    public List<Alumno> obtenerTodos(){
        return this.alumnoServiceImpl.obtenerTodos();
    }

    @DeleteMapping("/eliminar/{numeroCuenta}")
    public String eliminarAlumno(@PathVariable(name = "numeroCuenta") int numeroCuenta){
        return this.alumnoServiceImpl.eliminarAlumno(numeroCuenta);
    }

    public String actualizarAlumno(@RequestParam(name = "numeroCuenta") int numeroCuenta, @RequestBody Alumno alumno){
        return this.alumnoServiceImpl.actualizarAlumno(numeroCuenta, alumno);
    }
}
