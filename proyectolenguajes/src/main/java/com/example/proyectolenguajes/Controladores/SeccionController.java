package com.example.proyectolenguajes.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.proyectolenguajes.Modelos.Seccion;
import com.example.proyectolenguajes.Servicios.Impl.SeccionServiceImpl;

@RestController
@RequestMapping("/api/secciones")
public class SeccionController {

    @Autowired
    private SeccionServiceImpl seccionServiceImpl;

    @PostMapping("/guardar")
    public Seccion guardarSeccion(@RequestBody Seccion seccion) {
        return this.seccionServiceImpl.guardarSeccion(seccion);
    }

    @GetMapping("/obtener/{codigoSeccion}")
    public Seccion obtenerPorId(@PathVariable(name = "codigoSeccion") int codigoSeccion){
        return this.seccionServiceImpl.obtenerPorId(codigoSeccion);
    }

    @GetMapping("/todos")
    public List<Seccion> obtenerTodasSecciones() {
        return this.seccionServiceImpl.obtenerTodasSecciones();
    }

    @DeleteMapping("/eliminar/{codigoSeccion}")
    public String eliminarSeccion(@PathVariable(name = "codigoSeccion") int codigoSeccion) {
        return this.seccionServiceImpl.eliminarSeccion(codigoSeccion);
    }

    @PutMapping("/actualizar")
    public String actualizarSeccion(@RequestParam(name = "codigoSeccion") int codigoSeccion, @RequestBody Seccion seccion) {
        return this.seccionServiceImpl.actualizarSeccion(codigoSeccion, seccion);
    }

}

