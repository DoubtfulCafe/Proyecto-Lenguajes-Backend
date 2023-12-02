package com.example.proyectolenguajes.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.proyectolenguajes.Modelos.Edificio;
import com.example.proyectolenguajes.Servicios.EdificioService;
import com.example.proyectolenguajes.Servicios.Impl.AlumnoServiceImpl;
import com.example.proyectolenguajes.Servicios.Impl.EdificioServiceImpl;

import java.util.List;

@RestController
@RequestMapping("api/edificios")
public class EdificioController {

    @Autowired
    private EdificioServiceImpl edificioServiceImpl;
     
  
    @PostMapping("/guardar")
    public Edificio crearEdificio(@RequestBody Edificio edificio) {
        return edificioServiceImpl.guardarEdificio(edificio);
    }

    @PutMapping("/actualizar")
    public String actualizarEdificio(@RequestParam(name = "codigoEdificio") int codigoEdificio, @RequestBody Edificio edificio) {
        return this.edificioServiceImpl.actualizarEdificio(codigoEdificio, edificio);
    }

    @DeleteMapping("/eliminar/{codigoEdificio}")
    public String eliminarEdificio(@PathVariable(name = "codigoEdificio") int codigoEdificio) {
        return this.edificioServiceImpl.eliminarEdificio(codigoEdificio);
    }

    @GetMapping("/todos")
    public List<Edificio> obtenerTodosEdificios() {
        return edificioServiceImpl.obtenerTodosEdificios();
    }

    
   
}
