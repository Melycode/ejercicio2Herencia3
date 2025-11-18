package articulos;

// creo la clase videojuegos que se extiende de articulo

public class Videojuego extends Articulo {
    private String director;
    private String plataformas;
    private int pegi;

    //Constructores: todos y vacío

    public Videojuego(String titulo, int anyoLanzamiento, double precioPorDia, String director, String plataformas, int pegi) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.director = director;
        this.plataformas = plataformas;
        this.pegi = pegi;
    }

    public Videojuego() {
    }

    // Getter y setters: todos

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }


    // Metodo

    // creo el metodo paraAdultos() que devuelva true si el PEGI es mayor o igual que 18
    public boolean paraAdultos(){
        return this.pegi >= 18;
    }

    // creo el metodo esApto(edad) que devuelva true si la edad es mayor o igual que el PEGI
    public boolean esApto(int edad){
        return edad >= this.pegi;
    }


    // To string : devuelve
    @Override
    public String toString() {
        return "Videojuego " + this.getTitulo() + " de " + this.director + " (" + this.getPrecioPorDia() + " €/día)";
    }
}