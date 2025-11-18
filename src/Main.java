// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import articulos.Libro;
import articulos.Pelicula;
import usuarios.Cliente;
import usuarios.Administrador;
import articulos.AlbumMusica;
import articulos.Videojuego;

public class Main {
    public static void main(String[] args) {

        // 1. Creo 2 artículos de cada tipo
        Libro libro1 = new Libro("El amor en los tiempos del colera", 1985, 3.5, "Gabriel García Márquez", Libro.Genero.FANTASIA);
        Libro libro2 = new Libro("El Paraiso en la otra esquina", 2003, 3.0, "Mario Vargas Llosa", Libro.Genero.ACCION);

        Pelicula pelicula1 = new Pelicula("Amores materialistas", 2025, 3.0, "Celine Song", 117);
        Pelicula pelicula2 = new Pelicula("Titanic", 1997, 5.0, "James Cameron", 194);

        AlbumMusica album1 = new AlbumMusica("Don Juan", 2023, 3.0, "Maluma", 9, false);
        AlbumMusica album2 = new AlbumMusica("Grandes baladas", 2002, 6.0, "David Bisbal", 10, true);

        Videojuego juego1 = new Videojuego("The Witcher 3", 2015, 7, "CD Projekt", "PC, PS4, Xbox", 18);
        Videojuego juego2 = new Videojuego("Zelda: Tears of the Kingdom", 2025, 5, "Nintendo", "Switch", 12);


        // 2. Creo 2 clientes
        Cliente cliente1 = new Cliente("Julián", "contrasena123456", 1, 2004, libro1, 1001);
        Cliente cliente2 = new Cliente("Daniel", "claveSegu987654", 2, 1999, juego2, 1002);

        // 3. Creo 1 administrador
        Administrador admin = new Administrador("admin", "adminPass1234", 99, 1985, Administrador.Rol.JEFE);

        // Asigno un artículo a dos clientes
        admin.asignarArticulo(cliente1, pelicula2);

        // Imprimir para comprobar
        System.out.println("--------");
        System.out.println(cliente1);
        System.out.println("Artículo asignado a cliente1: " + cliente1.getArticulo().getTitulo());

        System.out.println("--------");
        System.out.println(cliente2);
        System.out.println("Artículo asignado a cliente2: " + cliente2.getArticulo());

        System.out.println("--------");
        System.out.println(admin);

        System.out.println("--------");
        pelicula2.getDuracionHorasYMinutos();
        System.out.println("--------");
        System.out.println(cliente1.esAdulto());
        System.out.println("--------");
        System.out.println(cliente2.esAdulto());


    }
}
