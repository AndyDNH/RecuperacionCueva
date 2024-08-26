package ec.edu.uce.CuevaExamenRecuperacion.model.Interfaces;

public interface ITarea {
    void crearTarea(String titulo, String descripcion, boolean estado, String fechaCreacion);
    void actualizarTarea(String titulo, String descripcion, boolean estado, String fechaCreacion);
    void eliminarTarea(String titulo);
    void listarTareas();
    void buscarTarea(String titulo);

}
