package ec.edu.uce.CuevaExamenRecuperacion;

import ec.edu.uce.CuevaExamenRecuperacion.controller.Container;
import ec.edu.uce.CuevaExamenRecuperacion.model.objects.Tareas;
import ec.edu.uce.CuevaExamenRecuperacion.services.TareasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CuevaExamenRecuperacionApplication implements CommandLineRunner {

	@Autowired
	Container container;
	public static void main(String[] args) {
		SpringApplication.run(CuevaExamenRecuperacionApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
//		tareas.save(new Tareas("Tarea1", "TestTarea", true, "2024-07-26"));
		container.crearTarea("Tarea1", "TestTarea2", true, "2024-07-26");
		container.actualizarTarea("Tarea2", "TestTareaModifi", true, "2024-07-26");


	}
}
