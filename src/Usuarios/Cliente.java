package Usuarios;
import Articulos.Articulo;


// Creo la clase cliente que es una extensión de usuario
public class Cliente extends Usuario {
    private Articulo articulo;
    private int numSocio;

    // Constructores: todos y vacío

    public Cliente(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, Articulo articulo, int numSocio) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.articulo = articulo;
        this.numSocio = numSocio;
    }

    public Cliente() {
    }

    // Getter and setters: todos

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }


    //Metodo

    // Creo el metodo calcularPrecio(numArticulos, dias) que devuelva el precio total para un número de artículos y un número de días, teniendo en cuenta el artículo del cliente

    public double calcularPrecio( int numArticulos, int dias) {
        return this.getArticulo().calcularPrecio(numArticulos, dias);
    }


    // To string: : devuelve

    @Override
    public String toString() {
        return "Cliente " + this.getNombreUsuario() + "( " + this.getId() + ")" ;
    }
}