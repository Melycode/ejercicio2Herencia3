package Articulos;

// creo la clase albummusica que es una extensión de artìculo con sus atributos
public class AlbumMusica extends Articulo {
    private String autor;
    private int numCanciones;
    private boolean single;

    // Constructores: todos y vacío

    public AlbumMusica(String titulo, int anyoLanzamiento, double precioPorDia, String autor, int numCanciones, boolean single) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numCanciones = numCanciones;
        this.single = single;
    }

    public AlbumMusica() {
    }


    // Getter y setters: todos

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }

    //Metodos

    // Creo el metodo getDuracionTotal(duracion) que, dada una duración media en minutos, devuelva la duración total del álbum

    public int getDuracionTotal(int duracion) {
        return duracion * this.numCanciones;
    }


    // To string : devuelve
    @Override
    public String toString() {
        return "Álbum " + this.getTitulo() + " de " + this.autor + " (" + this.getPrecioPorDia() +  " €/día)";
    }
}