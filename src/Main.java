// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

package Main;

import Articulos.Articulo;
import Articulos.Libro;
import Articulos.Pelicula;
import Usuarios.Cliente;
import Usuarios.Administrador;
import Articulos.AlbumMusica;
import Articulos.Videojuego;

public class Main {
    public static void main(String[] args) {

        // 1. Crear 2 artículos de cada tipo
        Libro libro1 = new Libro("El amor en los tiempos del colera", 1985, "Gabriel García Márquez", 2.5, Libro.Genero.FANTASIA);
        Libro libro2 = new Libro("El Paraiso en la otra esquina", 2003, "Mario Vargas Llosa", 3.0, Libro.Genero.ACCION);

        Pelicula pelicula1 = new Pelicula("Amores materialistas", 2025, "James Cameron", 117, 4.0);
        Pelicula pelicula2 = new Pelicula("Titanic", 1997, "James Cameron", 194, 5.0);

        AlbumMusica album1 = new AlbumMusica("Don Juan", 2023, "Maluma", 9, false, 3.5);
        AlbumMusica album2 = new AlbumMusica("Grandes baladas", 2002, "David Bisbal", 10, false, 4.0);

        Videojuego juego1 = new Videojuego("The Witcher 3", 2015, "CD Projekt", "PC, PS4, Xbox", 18, 6.0);
        Videojuego juego2 = new Videojuego("Zelda: Tears of the Kingdom", 2025, "Nintendo", "Switch", 12, 5.5);

        // 2. Crear 2 clientes
        Cliente cliente1 = new Cliente("Julián", "contrasena123456", 1, 2004, libro1, 1001);
        Cliente cliente2 = new Cliente("Daniel", "claveSegu987654", 2, 1999, juego2, 1002);

        // 3. Crear 1 administrador
        Administrador admin = new Administrador("admin", "adminPass1234", 99, 1985, Administrador.Rol.JEFE);

        // Asignar un artículo a un cliente
        admin.asignarArticulo(cliente1, pelicula2);

        // Imprimir para comprobar
        System.out.println(cliente1);
        System.out.println("Artículo asignado a cliente1: " + cliente1.getArticulo().getTitulo());


        System.out.println(cliente2);
        System.out.println("Artículo asignado a cliente2: " + cliente2.getArticulo());

        System.out.println(admin);
    }
}
