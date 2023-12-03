package com.example.proyectolenguajes.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.proyectolenguajes.Modelos.Aula;
import com.example.proyectolenguajes.Servicios.Impl.AulaServiceImpl;

@RestController
@RequestMapping("/api/aulas")
public class AulaController {

    @Autowired
    private AulaServiceImpl aulaServiceImpl;

    @PostMapping("/guardar")
    public Aula guardarAula(@RequestBody Aula aula) {
        return aulaServiceImpl.guardarAula(aula);
    }

    @GetMapping("/todos")
    public List<Aula> obtenerTodasAulas() {
        return aulaServiceImpl.obtenerTodasAulas();
    }

    @GetMapping("/obtener/{codigoAula}")
    public Aula obtenerPorId(@PathVariable(name = "codigoAula") int codigoAula){
        return aulaServiceImpl.obtenerPorId(codigoAula);
    }

    @DeleteMapping("/eliminar/{codigoAula}")
    public String eliminarAula(@PathVariable(name = "codigoAula") int codigoAula) {
        return aulaServiceImpl.eliminarAula(codigoAula);
    }

    @PutMapping("/actualizar/{codigoAula}")
    public String actualizarAula(@PathVariable(name = "codigoAula") int codigoAula, @RequestBody Aula aula) {
        return aulaServiceImpl.actualizarAula(codigoAula, aula);
    }
}
