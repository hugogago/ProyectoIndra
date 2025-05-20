package main.java.com.indra;

public class Evento {
    private int id_evento;
    private String nombre;
    private int fecha;
    private int duracion;
    private String descripcion;
    private int id_categoria;
    private int id_ubicacion;
    private int id_organizador;
    
    public Evento(int id_evento, String nombre, int fecha, int duracion, String descripcion, int id_categoria,
            int id_ubicacion, int id_organizador) {
        this.id_evento = id_evento;
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.id_categoria = id_categoria;
        this.id_ubicacion = id_ubicacion;
        this.id_organizador = id_organizador;
    }
    
    @Override
    public String toString() {
        return "Evento [id_evento=" + id_evento + ", nombre=" + nombre + ", fecha=" + fecha + ", duracion=" + duracion
                + ", descripcion=" + descripcion + ", id_categoria=" + id_categoria + ", id_ubicacion=" + id_ubicacion
                + ", id_organizador=" + id_organizador + "]";
    }

    public int getId_evento() {
        return id_evento;
    }
    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getFecha() {
        return fecha;
    }
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getId_categoria() {
        return id_categoria;
    }
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    public int getId_ubicacion() {
        return id_ubicacion;
    }
    public void setId_ubicacion(int id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }
    public int getId_organizador() {
        return id_organizador;
    }
    public void setId_organizador(int id_organizador) {
        this.id_organizador = id_organizador;
    }


    
}
