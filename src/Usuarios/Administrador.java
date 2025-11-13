package Usuarios;
import Articulos.Articulo;

public class Administrador {
    public enum Rol { JEFE, VENDEDOR }
    private Rol rol;

    // Constructor

    public Administrador(Rol rol) {
        this.rol = rol;
    }

    public Administrador() {
    }

    // Getters y setters

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }


    // Metodos
    public void asignarArticulo(Usuario usuario, Articulo articulo) {
        ((Cliente) usuario).setArticulo(articulo);
    }

    public void retirarArticulo(Usuario usuario) {
        ((Cliente) usuario).setArticulo(null);
    }


    // To String


    @Override
    public String toString() {
        return "Cliente " + this.getNombreUsuario() + "(" + this.getId() + ")";
    }
}
