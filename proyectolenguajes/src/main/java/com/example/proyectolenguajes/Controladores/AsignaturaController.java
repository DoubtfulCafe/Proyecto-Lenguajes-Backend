package com.example.proyectolenguajes.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.proyectolenguajes.DTO.AsignaturaDTO;
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


    @PostMapping
    public ResponseEntity<String> crearAsignatura(@RequestBody AsignaturaDTO asignaturaDTO) {
        try {
            // Aquí puedes realizar la validación necesaria y luego llamar al servicio
            // para crear la asignatura con los datos proporcionados.
            
            Asignatura asignatura = convertirDTOaAsignatura(asignaturaDTO);
            asignaturaServiceImpl.guardarAsignatura(asignatura);

            return new ResponseEntity<>("Asignatura creada con éxito", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al crear la asignatura: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Método para convertir el DTO a la entidad Asignatura
    private Asignatura convertirDTOaAsignatura(AsignaturaDTO asignaturaDTO) {
        Asignatura asignatura = new Asignatura();
        asignatura.setCodigoAsignatura(asignaturaDTO.getCodigoAsignatura());
        asignatura.setNombreAsignatura(asignaturaDTO.getNombreAsignatura());

        // Puedes manejar la asignaturaRequisito y otros campos aquí según tus necesidades
        if (asignaturaDTO.getIdAsignaturaRequisito() != 0) {
            Asignatura requisito = asignaturaServiceImpl.obtenerPorId(asignaturaDTO.getIdAsignaturaRequisito());
            asignatura.setAsignaturaRequisito(requisito);
        }

        // Puedes manejar otros campos como tipoAula y seccion aquí

        return asignatura;
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

