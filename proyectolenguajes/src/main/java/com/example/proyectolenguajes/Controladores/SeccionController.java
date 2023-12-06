package com.example.proyectolenguajes.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.proyectolenguajes.DTO.SeccionDTO;
import com.example.proyectolenguajes.Modelos.Asignatura;
import com.example.proyectolenguajes.Modelos.Aula;
import com.example.proyectolenguajes.Modelos.Seccion;
import com.example.proyectolenguajes.Servicios.Impl.AsignaturaServiceImpl;
import com.example.proyectolenguajes.Servicios.Impl.AulaServiceImpl;
import com.example.proyectolenguajes.Servicios.Impl.SeccionServiceImpl;

@RestController
@RequestMapping("/api/secciones")
public class SeccionController {
     @Autowired
    private AulaServiceImpl aulaServiceImpl;

    @Autowired
    private AsignaturaServiceImpl asignaturaServiceImpl;

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

     @PostMapping
    public ResponseEntity<String> crearSeccion(@RequestBody SeccionDTO seccionDTO) {
        try {
            Seccion seccion = convertirDTOaSeccion(seccionDTO);
            seccionServiceImpl.guardarSeccion(seccion);
            return new ResponseEntity<>("Sección creada con éxito", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al crear la sección: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Método para convertir el DTO a la entidad Seccion
    private Seccion convertirDTOaSeccion(SeccionDTO seccionDTO) {
        Seccion seccion = new Seccion();
        seccion.setCodigoSeccion(seccionDTO.getCodigoSeccion());
        seccion.setCupos(seccionDTO.getCupos());
        seccion.setAnio(seccionDTO.getAnio());
        seccion.setPeriodo(seccionDTO.getPeriodo());

        // Puedes manejar asignatura y aula aquí según tus necesidades
        int codigoAsignatura = seccionDTO.getCodigoAsignatura();
        if (codigoAsignatura != 0) {
            Asignatura asignatura = asignaturaServiceImpl.obtenerPorId(codigoAsignatura);
            seccion.setAsignatura(asignatura);
        }

        int codigoAula = seccionDTO.getCodigoAula();
        if (codigoAula != 0) {
            Aula aula =aulaServiceImpl.obtenerPorId(codigoAula);
            seccion.setAula(aula);
        }

        return seccion;
    }
    
}

