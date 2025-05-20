package main.java.com.indra;

public class Ubicacion {
    private int id_ubicacion;
    private String tipo;
    private String direccion;
    private String url;
    
    public Ubicacion(int id_ubicacion, String tipo, String direccion, String url) {
        this.id_ubicacion = id_ubicacion;
        this.tipo = tipo;
        this.direccion = direccion;
        this.url = url;
    }
    @Override
    public String toString() {
        return "Ubicacion [id_ubicacion=" + id_ubicacion + ", tipo=" + tipo + ", direccion=" + direccion + ", url="
                + url + "]";
    }
    public int getId_ubicacion() {
        return id_ubicacion;
    }
    public void setId_ubicacion(int id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    
}
