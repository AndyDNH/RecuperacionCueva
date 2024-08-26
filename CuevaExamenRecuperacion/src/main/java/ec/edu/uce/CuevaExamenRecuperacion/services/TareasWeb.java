package ec.edu.uce.CuevaExamenRecuperacion.services;


import ec.edu.uce.CuevaExamenRecuperacion.model.objects.Tareas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Service
@RestController
public class TareasWeb {

    @Autowired
    TareasService tareasService;

    @GetMapping("/tareas")
    public List<Tareas> ListarTareas(){
        return tareasService.ListarTareas().stream().toList();
    }



}
