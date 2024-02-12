package Mundo;

/**
 *
 * @author Nicolas Maya
 */
public class Tarea {
private int idTarea;
private String descripcion;
private int prioridad;

//metodos

    public Tarea() {
    }

    public Tarea(int idTarea, String descripcion, int prioridad) {
        this.idTarea = idTarea;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    

}
