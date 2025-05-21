package main.java.com.indra;

public class Inscripcion {
    private Usuario usuario;
    private Evento evento;
    private int fecha_inscripcion;
    
   
   @Override
    public String toString() {
        return "Inscripcion: " + usuario + evento + ", fecha_inscripcion=" + fecha_inscripcion;
    }


   public Inscripcion(Usuario usuario, Evento evento, int fecha_inscripcion) {
        this.usuario = usuario;
        this.evento = evento;
        this.fecha_inscripcion = fecha_inscripcion;
    }
    
   
    public Usuario getUsuario() {
    return usuario;
}
   public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
   }
   public Evento getEvento() {
    return evento;
   }
   public void setEvento(Evento evento) {
    this.evento = evento;
   }
    public int getFecha_inscripcion() {
        return fecha_inscripcion;
    }
    public void setFecha_inscripcion(int fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }
}
