package ec.edu.uce.CuevaExamenRecuperacion.services;

import ec.edu.uce.CuevaExamenRecuperacion.model.objects.Tareas;
import ec.edu.uce.CuevaExamenRecuperacion.repositories.TareaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TareasService {
    @Autowired
    TareaRepository tareaRepository;

    public void save(Tareas tarea){
        tareaRepository.save(tarea);
    }

    public Optional<Tareas> ListarTareas(){
        return Optional.ofNullable((Tareas) tareaRepository.findAll());
    }

    public void eliminarTarea(String titulo){
        tareaRepository.deleteByTitulo(titulo);
    }

    public Optional<Tareas> buscarPorEstado(String estado){
        return Optional.ofNullable((Tareas) tareaRepository.findByEstado(estado));
    }

    public Optional<Tareas> buscarPorTarea(String titulo, String descripcion, boolean estado, String fechaCreacion){
        return Optional.ofNullable((Tareas) tareaRepository.findByEstado(titulo));
    }

    public Optional<Tareas> modificarPorTitulo(String titulo, String descripcion, boolean estado, String fecha_creacion){
        return Optional.ofNullable((Tareas) tareaRepository.modifyByTitulo(titulo,descripcion,estado,fecha_creacion));
    }




}
