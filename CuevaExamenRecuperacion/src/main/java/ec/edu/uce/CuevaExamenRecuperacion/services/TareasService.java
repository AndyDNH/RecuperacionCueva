package ec.edu.uce.CuevaExamenRecuperacion.services;

import ec.edu.uce.CuevaExamenRecuperacion.model.objects.Estado;
import ec.edu.uce.CuevaExamenRecuperacion.model.objects.Tareas;
import ec.edu.uce.CuevaExamenRecuperacion.repositories.TareaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TareasService {
    @Autowired
    TareaRepository tareaRepository;

    public void save(Tareas tarea){
        tareaRepository.save(tarea);
    }

    public List<Tareas> ListarTareas(){
        return tareaRepository.findAll();
    }

    public void eliminarTarea(Long id){
        tareaRepository.deleteById(id);
    }

    public List<Tareas> listarTareasPorEstado(Estado estado) {
        return tareaRepository.findByEstado(estado);
    }

    public void modificarPorTitulo(Long id, String titulo, String descripcion, Estado estado, String fecha_creacion){
      tareaRepository.modifyById(id,titulo,descripcion,estado,fecha_creacion);

    }




}
