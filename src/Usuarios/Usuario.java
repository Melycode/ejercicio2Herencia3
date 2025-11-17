package Usuarios;

// Creo la clase usuario con sus atributos
public class Usuario {
    private String nombreUsuario;
    private String contrasenya;
    private int id;
    private int anyoNacimiento;

    // Constructores: todos y vacío

    public Usuario(String nombreUsuario, String contrasenya, int id, int anyoNacimiento) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenya = contrasenya;
        this.id = id;
        this.anyoNacimiento = anyoNacimiento;
    }

    public Usuario() {
    }

    // Getter and setters: todos
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    // Metodos

    // Creo el metodo esAdulto() que devuelva true si tiene 18 años o más (tomando 2025 como año actual)

    public boolean esAdulto() {
        int edad = 2025 - anyoNacimiento;
        return  edad >= 18;
    }


    // Creo el metodo contrasenyaSegura() que devuelva true si la contraseña tiene más de 10 caracteres
    public boolean contrasenyaSegura() {

        return this.contrasenya.length() > 10;
    }

    // To string : devuelve

    @Override
    public String toString() {
        return nombreUsuario + " (" + id + ")";
    }
}
