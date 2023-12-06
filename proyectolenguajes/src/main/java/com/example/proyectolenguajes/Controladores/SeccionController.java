package com.example.proyectolenguajes.Controladores;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.proyectolenguajes.Modelos.AlumnoAsignatura;
import com.example.proyectolenguajes.Modelos.Asignatura;
import com.example.proyectolenguajes.Modelos.Aula;
import com.example.proyectolenguajes.Modelos.Edificio;
import com.example.proyectolenguajes.Modelos.Seccion;
import com.example.proyectolenguajes.Modelos.TipoAula;
import com.example.proyectolenguajes.Servicios.Impl.AlumnoAsignaturaServiceImpl;
import com.example.proyectolenguajes.Servicios.Impl.AsignaturaServiceImpl;
import com.example.proyectolenguajes.Servicios.Impl.AulaServiceImpl;
import com.example.proyectolenguajes.Servicios.Impl.EdificioServiceImpl;
import com.example.proyectolenguajes.Servicios.Impl.SeccionServiceImpl;
import com.example.proyectolenguajes.Servicios.Impl.TipoAulaServiceImpl;

@RestController
@RequestMapping("/api/secciones")
public class SeccionController {

    @Autowired
    private AsignaturaServiceImpl asignaturaServiceImpl;

    @Autowired
    private AlumnoAsignaturaServiceImpl alumnoAsignaturaServiceImpl;

    @Autowired
    private SeccionServiceImpl seccionServiceImpl;

    @Autowired
    private EdificioServiceImpl edificioServiceImpl;

    @Autowired
    private AulaServiceImpl aulaServiceImpl;

    private TipoAulaServiceImpl tipoAulaServiceImpl;

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

    @PutMapping("/actualizar/{codigoSeccion}")
    public String actualizarSeccion(@PathVariable(name = "codigoSeccion") int codigoSeccion, @RequestBody Seccion seccion) {
        return this.seccionServiceImpl.actualizarSeccion(codigoSeccion, seccion);
    }

    @PostMapping("/simular")
    public String simularAsignacion(/*@PathVariable(name = "anio") int anio, @PathVariable(name = "periodo") String periodo*/){

        List<AlumnoAsignatura> alumnosAsignaturas = alumnoAsignaturaServiceImpl.obtenerTodos();

        Map<Integer, Integer> conteoPorAsignatura = contarAsignaturas(alumnosAsignaturas);

        List<Asignatura> listaAsignaturas = asignaturaServiceImpl.obtenerTodasAsignaturas();

        actualizarCantidadAlumnos(listaAsignaturas, conteoPorAsignatura);

        List<Edificio> listaEdificios = edificioServiceImpl.obtenerTodosEdificios();

        List<Aula> listaAulas = aulaServiceImpl.obtenerTodasAulas();

        //Aula aulaSeleccionada = 

        return "Se ha completado la simulacion";
    }

    public static Map<Integer, Integer> contarAsignaturas(List<AlumnoAsignatura> listaAlumnoAsignatura){

        Map<Integer, Integer> conteoPorAsignatura = new HashMap<>();

        for (AlumnoAsignatura alumnoAsignatura : listaAlumnoAsignatura){
            int codigoAsignatura = alumnoAsignatura.getCodigoasignatura();
            conteoPorAsignatura.put(codigoAsignatura, conteoPorAsignatura.getOrDefault(codigoAsignatura, 0) + 1);
        }

        return conteoPorAsignatura;
    }

    public static void actualizarCantidadAlumnos(List<Asignatura> listaAsignaturas, Map<Integer, Integer> conteoPorAsignatura){
        for (Asignatura asignatura : listaAsignaturas){
            int codigoAsignatura = asignatura.getCodigoAsignatura();
            int conteo = conteoPorAsignatura.getOrDefault(codigoAsignatura, 0);
            asignatura.setCantidadAlumnos(conteo);
        }
    }

    /*public static Aula seleccionarAula(Asignatura asignatura, List<Aula> listaAulas){
        TipoAula tipoAula = asignatura.getTipoAula();
        for (Aula aula : listaAulas){
            int tipoAVerificar = aula.getTipoAula().getIdTipoAula();
            if (tipoAula.getIdTipoAula() == tipoAVerificar) {
                return aula;
            }
        }
    }*/

}