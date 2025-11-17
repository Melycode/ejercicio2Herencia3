package Usuarios;
import Articulos.Articulo;


// creo la clase administrador que es una extensión de usuario
public class Administrador extends Usuario{
    public enum Rol { JEFE, VENDEDOR }
    private Rol rol;

    // Constructores: todos y vacío

    public Administrador(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, Rol rol) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.rol = rol;
    }

    public Administrador() {
    }

    // Getter and setters: todos

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }


    // Metodos

    // Creo el metodo asignarArticulo(cliente, articulo) que asigne un artículo a un usuario
    public void asignarArticulo(Usuario usuario, Articulo articulo) {
        ((Cliente) usuario).setArticulo(articulo);
    }

    // Creo el metodo retirarArticulo(cliente) que elimine el artículo del usuario
    public void retirarArticulo(Usuario usuario) {
        ((Cliente) usuario).setArticulo(null);
    }


    // To String : devuelve


    @Override
    public String toString() {
        return "Administrador " + getNombreUsuario() + " (" + getId() + ")";
    }
}
