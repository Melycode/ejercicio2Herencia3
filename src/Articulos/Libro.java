package Articulos;

// Creo la clase libro que es una extensión de articulo

public class Libro extends Articulo {
    private String autor;
    private int numPaginas;
    public enum Genero { MISTERIO, TERROR, ACCION, FANTASIA}
    private Genero genero;

    //Constructores: todos, vacío y uno con titulo, anyoLanzamiento, autor, precioPorDia y genero, que ponga numPaginas a 100.

    public Libro(String titulo, int anyoLanzamiento, double precioPorDia, String autor, int numPaginas, Genero genero) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.genero = genero;
    }

    public Libro() {
    }

    public Libro(String titulo, int anyoLanzamiento, double precioPorDia, String autor, Genero genero) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.genero = genero;
        this.numPaginas = 100;
    }

    // Getter y setters: todos

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }


    // Metodo

    // Creo el metodo esLargo() que devuelva true si tiene más de 200 páginas

    public boolean esLargo() {

        return this.numPaginas > 200;
    }


    // To string : devuelve

    @Override
    public String toString() {
        return "Libro " + this.getTitulo() + " de " + this.autor + " (" + this.getPrecioPorDia() + " €/día)";
    }
}
