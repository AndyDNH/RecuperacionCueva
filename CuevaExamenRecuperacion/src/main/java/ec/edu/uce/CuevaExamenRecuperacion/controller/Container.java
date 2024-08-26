package ec.edu.uce.CuevaExamenRecuperacion.controller;

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

    public void crearTarea(String titulo, String descripcion, boolean estado, String fechaCreacion){
        listaTareas.add(new Tareas(titulo, descripcion, estado, fechaCreacion));
        tareasService.save(new Tareas(titulo, descripcion, estado, fechaCreacion));
//        return listaTareas;

    }

    public List<Tareas> actualizarTarea(String titulo, String descripcion, boolean estado, String fechaCreacion){
        for (Tareas tarea : listaTareas) {
            if(tarea.getTitulo().equals(titulo)){
                tarea.setDescripcion(descripcion);
                tarea.setEstado(estado);
                tarea.setFechaCreacion(fechaCreacion);
            }
        }
        tareasService.buscarPorTarea(titulo, descripcion, estado, fechaCreacion);



        return listaTareas;
    }

    public List<Tareas> listarTareas(){
        return tareasService.ListarTareas().stream().toList();
    }

    public void eliminarTarea(String titulo){
        listaTareas.removeIf(tarea -> tarea.getTitulo().equals(titulo));
        tareasService.eliminarTarea(titulo);
    }







}
