package VectoresDinamicos.ToDoList;

public class Tarea {
    private String nombre;
    private String autor;
    private String descripcion;
    private int duracion;
    private String estado;

    public Tarea(String nombre, String autor, String descripcion, int duracion, String estado) {
        this.nombre = nombre;
        this.autor = autor;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.estado = estado;
    }


    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getEstado() {
        return estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
