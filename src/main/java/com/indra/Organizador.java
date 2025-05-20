package main.java.com.indra;

public class Organizador {
    private int id_organizador;
    private String nombre;
    private String contacto;
    
    @Override
    public String toString() {
        return "Organizador [id_organizador=" + id_organizador + ", nombre=" + nombre + ", contacto=" + contacto + "]";
    }
    public Organizador(int id_organizador, String nombre, String contacto) {
        this.id_organizador = id_organizador;
        this.nombre = nombre;
        this.contacto = contacto;
    }
    public int getId_organizador() {
        return id_organizador;
    }
    public void setId_organizador(int id_organizador) {
        this.id_organizador = id_organizador;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContacto() {
        return contacto;
    }
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
}
