# Actividad 2

Un cliente quiere desarrollar una aplicación para la gestión de una biblioteca, en la que, además de libros, también se alquilan videojuegos, películas y música.

## Ejercicios: 

1.- Hacer un paquete articulos con las siguientes clases:

a.- Articulo, con los siguientes elementos: 
- Atributos: 
  * titulo (cadena de texto) 
  * anyoLanzamiento (número entero) 
  * precioPorDia (número decimal) 
- Constructores: Completo y Vacío 
- Métodos: Todos los getters y setters; calcularPrecio(numArticulos, dias) que devuelva el precio total para un número de artículos y un número de días toString() que devuelva “[Artículo] <titulo> (<precioPorDia> €/día)” 

b.- Libro, que hereda de Articulo, con los siguientes elementos: 
- Atributos:
  * autor (cadena de texto)
  * numPaginas (número entero)
  * genero (enumerado que puede ser Misterio, Terror, Acción, Historia o Fantasía)
- Constructores: Completo Vacío Con titulo, anyoLanzamiento, autor, precioPorDia y genero, que ponga numPaginas a **100**.
- Métodos: Todos los getters y setters esLargo() que devuelva true si tiene más de **200** páginas toString() que devuelva “[Libro] <titulo>, de <autor> (<precioPorDia> €/día)” Pelicula, que hereda de Articulo, con los siguientes elementos: Atributos: director (cadena de texto) duracion (número entero, en minutos) Constructores: Completo Vacío Métodos: Todos los getters y setters getDuracionHorasYMinutos() que muestre por consola la duración de la película en formato “X horas y Y minutos” getDuracionSegundos() que devuelva la duración en segundos toString() que devuelva “[Película] <titulo>, de <director> (<precioPorDia> €/día)”

c.- AlbumMusica, que hereda de Articulo, con los siguientes elementos:
- Atributos:
  * autor (cadena de texto)
  * numCanciones (número entero)
  * single (booleano)
- Constructores: Completo Vacío Métodos: Todos los getters y setters getDuracionTotal(duracion) que, dada una duración media en minutos, devuelva la duración total del álbum toString() que devuelva “[Álbum] <titulo>, de <autor> (<precioPorDia> €/día)”

d.- Videojuego, que hereda de Articulo, con los siguientes elementos:
- Atributos:
  * director (cadena de texto)
  * plataformas (cadena de texto)
  * pegi (número entero)
- Constructores: Completo Vacío
- Métodos: Todos los getters y setters paraAdultos() que devuelva true si el **PEGI** es mayor o igual que 18 esApto(edad) que devuelva true si la edad es mayor o igual que el **PEGI** toString() que devuelva “[Videojuego] <titulo>, de <director> (<precioPorDia> €/día)”

2.- Hacer un paquete usuarios con las siguientes clases: 

a.- Usuario, con los siguientes elementos: 
- Atributos:
  * nombreUsuario (cadena de texto) 
  * contrasenya (cadena de texto) id (número entero)
  * anyoNacimiento (número entero)
- Constructores: Completo Vacío
- Métodos: Todos los getters y setters esAdulto() que devuelva true si tiene 18 años o más (tomando **2025** como año actual) contrasenyaSegura() que devuelva true si la contraseña tiene más de 10 caracteres toString() que devuelva “<nombreUsuario> (<id>)”

b.- Cliente, que hereda de Usuario, con los siguientes elementos: 
-Atributos: 
  * articulo (de tipo Articulo)
  * numSocio (número entero)
- Constructores: Completo Vacío
- Métodos: Todos los getters y setters calcularPrecio(numArticulos, dias) que devuelva el precio total para un número de artículos y un número de días, teniendo en cuenta el artículo del cliente toString() que devuelva “Cliente <nombreUsuario> (<id>)”

c.- Administrador, que hereda de Usuario, con los siguientes elementos: 
- Atributos:
  * rol (enumerado que puede ser Jefe o Vendedor)
- Constructores: Completo Vacío
- Métodos: Todos los getters y setters asignarArticulo(cliente, articulo) que asigne un artículo a un usuario retirarArticulo(cliente) que elimine el artículo del usuario toString() que devuelva “Administrador <nombreUsuario> (<id>)”

3.- En la clase Main: Crear 2 artículos de cada tipo Crear 2 clientes Crear 1 administrador y asignar un artículo a un cliente

4.- Crear el diagrama **UML** de todas las clases

<img width="1237" height="492" alt="articulos" src="https://github.com/user-attachments/assets/49b4e9c0-5c9d-4c7f-83dd-aea4f1289234" />
<img width="812" height="485" alt="usuario" src="https://github.com/user-attachments/assets/4b0221df-e732-4173-9fca-cd139e85a18e" />
