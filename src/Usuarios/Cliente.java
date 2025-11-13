package Usuarios;
import Articulos.Articulo;

public class Cliente extends Usuario {
    private Articulo articulo;
    private int numSocio;

    // Constructores

    public Cliente(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, Articulo articulo, int numSocio) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.articulo = articulo;
        this.numSocio = numSocio;
    }

    public Cliente() {
    }

    // Getter y setters

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

    public double calcularPrecio( int numArticulos, int dias) {
        return this.getArticulo().calcularPrecio(numArticulos, dias);
    }



    // To string

    @Override
    public String toString() {
        return "Cliente " + this.getNombreUsuario() + "( " + this.getId() + ")" ;
    }
}
