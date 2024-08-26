package ec.edu.uce.CuevaExamenRecuperacion.controller;

import ec.edu.uce.CuevaExamenRecuperacion.model.objects.Estado;
import ec.edu.uce.CuevaExamenRecuperacion.model.objects.Tareas;
import ec.edu.uce.CuevaExamenRecuperacion.services.TareasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
@Component
public class Container {

    @Autowired
    TareasService tareasService;

    public Tareas tareas = new Tareas();
    List<Tareas> listaTareas = new ArrayList<>();

    public void crearTarea(String titulo, String descripcion, Estado estado, String fechaCreacion){
        listaTareas.add(new Tareas(titulo, descripcion, estado, fechaCreacion));
        tareasService.save(new Tareas(titulo, descripcion, estado, fechaCreacion));

    }

    public List<Tareas> actualizarTarea(Long id,String titulo, String descripcion, Estado estado, String fechaCreacion){
        for (Tareas tarea : listaTareas) {
            if(tarea.getTitulo().equals(titulo)){
                tarea.setDescripcion(descripcion);
                tarea.setEstado(estado);
                tarea.setFechaCreacion(fechaCreacion);
            }
        }
        tareasService.modificarPorTitulo(id, titulo, descripcion, estado, fechaCreacion);



        return listaTareas;
    }

    public List<Tareas> listarTareas(){
        listaTareas = tareasService.ListarTareas().stream().toList();
        listaTareas.stream().forEach(System.out::println);
        return listaTareas;
    }

    public void eliminarTarea(Long id){
        tareasService.eliminarTarea(id);
    }

}
