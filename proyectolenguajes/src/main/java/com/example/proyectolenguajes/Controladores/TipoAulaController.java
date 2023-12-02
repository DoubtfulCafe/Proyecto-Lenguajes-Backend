package com.example.proyectolenguajes.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.proyectolenguajes.Modelos.TipoAula;
import com.example.proyectolenguajes.Servicios.Impl.TipoAulaServiceImpl;

@RestController
@RequestMapping("/api/tipoaulas")
public class TipoAulaController {

    @Autowired
    private TipoAulaServiceImpl tipoAulaServiceImpl;

    @PostMapping("/guardar")
    public TipoAula guardarTipoAula(@RequestBody TipoAula tipoAula) {
        return this.tipoAulaServiceImpl.guardarTipoAula(tipoAula);
    }

    @GetMapping("/todos")
    public List<TipoAula> obtenerTodos() {
        return this.tipoAulaServiceImpl.obtenerTodos();
    }

    @DeleteMapping("/eliminar/{idTipoAula}")
    public String eliminarTipoAula(@PathVariable(name = "idTipoAula") int idTipoAula) {
        return this.tipoAulaServiceImpl.eliminarTipoAula(idTipoAula);
    }

    @PutMapping("/actualizar")
    public String actualizarTipoAula(@RequestParam(name = "idTipoAula") int idTipoAula, @RequestBody TipoAula tipoAula) {
        return this.tipoAulaServiceImpl.actualizarTipoAula(idTipoAula, tipoAula);
    }
}

