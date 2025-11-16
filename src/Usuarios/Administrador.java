package Usuarios;
import Articulos.Articulo;

public class Administrador extends Usuario{
    public enum Rol { JEFE, VENDEDOR }
    private Rol rol;

    // Constructores : completo y vacío

    public Administrador(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, Rol rol) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
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
        return "Administrador " + getNombreUsuario() + " (" + getId() + ")";
    }
}
