package main.java.com.indra;

public class Inscripcion {
    private int id_usuario;
    private int id_evento;
    private int fecha_inscripcion;
    
    @Override
    public String toString() {
        return "inscripcion [id_usuario=" + id_usuario + ", id_evento=" + id_evento + ", fecha_inscripcion="
                + fecha_inscripcion + "]";
    }
   public Inscripcion(int id_usuario, int id_evento, int fecha_inscripcion) {
        this.id_usuario = id_usuario;
        this.id_evento = id_evento;
        this.fecha_inscripcion = fecha_inscripcion;
    }
    
    public int getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    public int getId_evento() {
        return id_evento;
    }
    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }
    public int getFecha_inscripcion() {
        return fecha_inscripcion;
    }
    public void setFecha_inscripcion(int fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }
}
