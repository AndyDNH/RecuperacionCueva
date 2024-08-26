package ec.edu.uce.CuevaExamenRecuperacion.repositories;

import ec.edu.uce.CuevaExamenRecuperacion.model.objects.Estado;
import ec.edu.uce.CuevaExamenRecuperacion.model.objects.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TareaRepository extends JpaRepository<Tareas, Long>{

    @Query("DELETE FROM Tareas s WHERE s.titulo = ?1")
    Tareas deleteByTitulo(String titulo);

    @Query("SELECT s FROM Tareas s WHERE s.estado = ?1")
    List<Tareas> findByEstado(Estado estado);
    

    @Modifying
    @Transactional
    @Query("UPDATE Tareas s SET  s.titulo = ?2 ,s.descripcion = ?3, s.estado = ?4, s.fechaCreacion = ?5 WHERE s.id = ?1")
    void modifyById(Long id, String titulo, String descripcion, Estado estado, String fechaCreacion);


    @Query("SELECT s FROM Tareas s WHERE s.titulo = ?1")
    Tareas findByTitulo(String titulo);


}
