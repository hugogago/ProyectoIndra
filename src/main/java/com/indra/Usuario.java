package main.java.com.indra;

public class Usuario {
    private int id_usuario;
    private String nombre;
    private String correo;
    private String contraseña;

    
    @Override
    public String toString() {
        return "Usuario [id_usuario=" + id_usuario + ", nombre=" + nombre + ", correo=" + correo + ", contraseña="
                + contraseña + "]";
    }
    
    public Usuario(int id_usuario, String nombre, String correo, String contraseña) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public int getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
