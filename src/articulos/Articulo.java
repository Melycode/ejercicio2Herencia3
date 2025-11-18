package articulos;


// Creo la clase artìculo con sus atributos
public class Articulo {
    private String titulo;
    private int anyoLanzamiento;
    private double precioPorDia;

    // Constructores: todos y uno vacío

    public Articulo(String titulo, int anyoLanzamiento, double precioPorDia) {
        this.titulo = titulo;
        this.anyoLanzamiento = anyoLanzamiento;
        this.precioPorDia = precioPorDia;
    }

    public Articulo() {
    }


    // Getter y setters : todos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyoLanzamiento() {
        return anyoLanzamiento;
    }

    public void setAnyoLanzamiento(int anyoLanzamiento) {
        this.anyoLanzamiento = anyoLanzamiento;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {

        this.precioPorDia = precioPorDia;
    }

    // Metodo

    // creo el metodo calcularPrecio(numArticulos, dias) que devuelva el precio total para un número de artículos y un número de días
    public double calcularPrecio( int numArticulos,int dias) {

        return numArticulos * dias * precioPorDia;
    }


    // To string : devuelve
    @Override
    public String toString() {
        return "Artículo " + this.titulo + " (" + this.precioPorDia + " €/día)";
    }
}