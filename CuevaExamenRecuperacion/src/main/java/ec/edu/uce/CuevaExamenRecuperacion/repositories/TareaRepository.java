package ec.edu.uce.CuevaExamenRecuperacion.repositories;

import ec.edu.uce.CuevaExamenRecuperacion.model.objects.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TareaRepository extends JpaRepository<Tareas, Long>{

    @Query("SELECT s FROM Tareas s WHERE s.titulo = ?1")
    Tareas deleteByTitulo(String titulo);

    @Query("SELECT s FROM Tareas s WHERE s.estado = ?1")
    Tareas findByEstado(String estado);

    @Query("UPDATE Tareas s SET s.titulo = ?1, s.descripcion = ?2, s.estado = ?3, s.fecha_creacion = ?4 WHERE s.titulo = ?1")
    Tareas modifyByTitulo(String titulo, String descripcion, boolean estado, String fecha_creacion);

    @Query("SELECT s FROM Tareas s WHERE s.titulo = ?1")
    Tareas findByTitulo(String titulo);


}
