package main.java.com.indra;

public class Evento {
    private int id_evento;
    private String nombre;
    private int fecha;
    private int duracion;
    private String descripcion;
    private Categoria categoria;
    private Ubicacion ubicacion;
    private Organizador organizador;
    
    public Evento(int id_evento, String nombre, int fecha, int duracion, String descripcion, Categoria categoria,
            Ubicacion ubicacion, Organizador organizador) {
        this.id_evento = id_evento;
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.ubicacion = ubicacion;
        this.organizador = organizador;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    @Override
    public String toString() {
        return "Evento [id_evento=" + id_evento + ", nombre=" + nombre + ", fecha=" + fecha + ", duracion=" + duracion
                + ", descripcion=" + descripcion + ", id_categoria=" + categoria + ", id_ubicacion=" + ubicacion
                + ", id_organizador=" + organizador + "]";
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

    public String getResumen() {
       return id_evento + ": " + nombre + " (" + fecha + ")";
    }

    public String getDetalle() {
        return getResumen() + " | " + categoria.getNombre() + " | " +
               ubicacion.getDireccion() + " | Organizado por: " +
               organizador.getNombre();
    }
   


    
}
