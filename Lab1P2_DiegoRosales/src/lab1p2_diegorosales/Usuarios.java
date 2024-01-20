
package lab1p2_diegorosales;

import java.util.Date;

public class Usuarios {
    String nombre;
    String apellido;
    String fecha;
    String nombrecorreo;
    String dominio;
    String contrasena;
    String correo;
    public Usuarios(String nombreUsuario, String apellidoUsuario, String edad,  String contrasenaUsuario, String nombrecorreoUsuario, String dominioUsuario, String Correo){
        this.nombre = nombreUsuario;
        this.apellido = apellidoUsuario;
        this.fecha = edad;
        this.dominio = dominioUsuario;
        this.nombrecorreo = nombrecorreoUsuario;
        this.contrasena = contrasenaUsuario;
        this.correo = Correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombrecorreo() {
        return nombrecorreo;
    }

    public void setNombrecorreo(String nombrecorreo) {
        this.nombrecorreo = nombrecorreo;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contraseña) {
        this.contrasena = contraseña;
    }
    
    
}
