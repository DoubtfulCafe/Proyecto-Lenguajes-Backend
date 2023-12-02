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

    @PutMapping("Actualizar")
    public Edificio actualizarEdificio(@RequestBody Edificio edificio) {
        return edificioServiceImpl.actualizarEdificio(edificio);
    }

    @DeleteMapping("/{codigoEdificio}")
    public void eliminarEdificio(@PathVariable int codigoEdificio) {
        edificioServiceImpl.eliminarEdificio(codigoEdificio);
    }

    @GetMapping("/obtenertodos")
    public List<Edificio> obtenerTodosEdificios() {
        return edificioServiceImpl.obtenerTodosEdificios();
    }

    
   
}
