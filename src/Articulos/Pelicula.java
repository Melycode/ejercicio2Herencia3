package Articulos;


// creo la clase pelicula que es una extensión de articulo
public class Pelicula extends Articulo {
    private String director;
    private int duracion;

    //Constructores: todos y uno vacío

    public Pelicula(String titulo, int anyoLanzamiento, double precioPorDia, String director, int duracion) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula() {
    }


    // Getter y setters : todos

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //Metodos

    // creo el metodo getDuracionHorasYMinutos() que muestre por consola la duración de la película en formato “X horas y Y minutos”

    public void getDuracionHorasYMinutos() {
        int horas = this.duracion / 60;
        int minutos = this.duracion % 60;
    }

    // creo el metodo getDuracionSegundos() que devuelva la duración en segundos

    public int getDuracionSegundos() {
        return this.duracion * 60 ;
    }


    // To String : devuelve
    @Override
    public String toString() {
        return "Película " + this.getTitulo()  + " de " + this.director + " (" + this.getPrecioPorDia() + " €/día)";
    }






}
