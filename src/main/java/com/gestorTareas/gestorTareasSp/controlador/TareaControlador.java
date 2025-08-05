package com.gestorTareas.gestorTareasSp.controlador;

import com.gestorTareas.gestorTareasSp.modelo.Tarea;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/tareas")
public class TareaControlador {
    private final List<Tarea> tareas = new ArrayList<>();
    private final AtomicLong idContador = new AtomicLong(1);

    //obtener todas las tareas creadas
    @GetMapping
    public List<Tarea> obtenerTareas (){
        return tareas;
    }

    //Obtener tareas por id
    @GetMapping("/{id}")
    public Tarea buscarTareaId(@PathVariable Long id){
        Tarea tareaEncontrada = null;
        for(Tarea tar : this.tareas){
            if (tar.getId().equals(id)){
                tareaEncontrada = tar;
                break;
            }
        }
        return tareaEncontrada;
    }

    //Crear nueva tarea
    @PostMapping
    public Tarea crearTarea(@RequestBody Tarea tarea){
        tarea.setId(idContador.getAndIncrement());
        tareas.add(tarea);
        return tarea;
    }

    //Actualizar una tarea existente
    @PutMapping("/{id}")
    public Tarea actualizarTarea(@PathVariable Long id, @RequestBody Tarea actTarea){
        Tarea tarea = buscarTareaId(id);
        tarea.setTitulo(actTarea.getTitulo());
        tarea.setDescripcion(actTarea.getDescripcion());
        tarea.setCompletada(actTarea.isCompletada());
        return tarea;
    }

    //Eliminar una tarea
    @DeleteMapping("/{id}")
    public String eliminarTarea(@PathVariable Long id){
        Tarea tarea = buscarTareaId(id);
        if(tarea != null){
            this.tareas.remove(tarea);
            return "Tarea eliminada";
        }
        return "Tarea no encontrada";
    }
}