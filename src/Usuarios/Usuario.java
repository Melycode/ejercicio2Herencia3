package Usuarios;

public class Usuario {
    private String nombreUsuario;
    private String contrasenya;
    private int id;
    private int anyoNacimiento;

    // Constructores

    public Usuario(String nombreUsuario, String contrasenya, int id, int anyoNacimiento) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenya = contrasenya;
        this.id = id;
        this.anyoNacimiento = anyoNacimiento;
    }

    public Usuario() {
    }

    // Getter and setters
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

    public boolean esAdulto() {
        int edad = 2025 - anyoNacimiento;
        return  edad >= 18;
    }


    public boolean contrasenyaSegura() {
        return this.contrasenya.length() > 10;
    }

    // To string

    @Override
    public String toString() {
        return nombreUsuario + " (" + id + ")";
    }
}
