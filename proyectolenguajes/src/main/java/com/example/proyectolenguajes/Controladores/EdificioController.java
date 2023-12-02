package com.example.proyectolenguajes.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.proyectolenguajes.Modelos.Edificio;
import com.example.proyectolenguajes.Servicios.EdificioService;
import com.example.proyectolenguajes.Servicios.Impl.AlumnoServiceImpl;
import com.example.proyectolenguajes.Servicios.Impl.EdificionServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/edificios")
public class EdificioController {

    @Autowired
    private EdificionServiceImpl EdificioServiceImpl;
     
  
    @PostMapping("/guardar")
    public Edificio crearEdificio(@RequestBody Edificio edificio) {
        return EdificioServiceImpl.guardarEdificio(edificio);
    }

    @PutMapping("Actualizar")
    public Edificio actualizarEdificio(@RequestBody Edificio edificio) {
        return EdificioServiceImpl.actualizarEdificio(edificio);
    }

    @DeleteMapping("/{codigoEdificio}")
    public void eliminarEdificio(@PathVariable int codigoEdificio) {
        EdificioServiceImpl.eliminarEdificio(codigoEdificio);
    }

    @GetMapping("/obtenertodos")
    public List<Edificio> obtenerTodosEdificios() {
        return EdificioServiceImpl.obtenerTodosEdificios();
    }

    
   
}
