package ec.edu.uce.CuevaExamenRecuperacion;

import ec.edu.uce.CuevaExamenRecuperacion.controller.Container;
import ec.edu.uce.CuevaExamenRecuperacion.model.objects.Estado;
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

//		container.crearTarea("Tarea1", "TestTarea1", Estado.PENDIENTE, "2024-07-26");
//		container.crearTarea("Tarea2", "TestTarea2", Estado.PENDIENTE, "2024-07-27");
//		container.crearTarea("Tarea3", "TestTarea3", Estado.COMPLETADO, "2024-08-27");

		container.actualizarTarea(2L,"yI", "TestFunciona", Estado.COMPLETADO, "2023-05-24");
		container.listarTareas();

		container.eliminarTarea(3L);
		container.listarTareas();

	}
}
