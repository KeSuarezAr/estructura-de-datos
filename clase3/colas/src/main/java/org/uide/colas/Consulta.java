package org.uide.colas;

public class Consulta {
    private String nombre;
    private String apellidos;
    private String descripcion;
    private String telefono;
    private String email;
    private String consulta;

    public Consulta(String nombre, String apellidos, String descripcion, String telefono, String email,
            String consulta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.email = email;
        this.consulta = consulta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellidos=" + apellidos + ", descripcion=" + descripcion + ", telefono="
                + telefono + ", email=" + email + ", consulta=" + consulta;
    }
}
