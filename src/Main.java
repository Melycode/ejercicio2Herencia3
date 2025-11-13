// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Articulos.AlbumMusica;
import Articulos.Libro;
import Articulos.Pelicula;
import Articulos.Videojuego;
import Usuarios.Administrador;

public class Main {
    public static void main(String[] args) {


        Administrador admi = new Administrador(Administrador.Rol.JEFE);
        System.out.println(admi);
        System.out.println(admi.asignarArticulo("Marco Gutiérrez", "maleta"));
        System.out.println("-------");

        System.out.println("-------");


        System.out.println("-------");


        System.out.println("-------");


        System.out.println("-------");


        Crear 2 artículos de cada tipo
        Crear 2 clientes
        Crear 1 administrador y asignar un artículo a un cliente

    }