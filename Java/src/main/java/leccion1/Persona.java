package leccion1;

public class Persona {

    private String direccion;
    private String apellido;
    private String telefono;
    private String correo;
    private String nombre;
    private int edad;

    public Persona(String nombre, String apellido, int edad, String direccion, String telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Apellido=" + apellido + ", Direccion=" + direccion + ", Telefono=" + telefono
                + ", Correo=" + correo + ", Edad=" + edad;
    }
}
