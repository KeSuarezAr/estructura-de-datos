package org.uide.leccion;

public class Jugador extends Persona {

    private int numeroCamiseta;
    private String posicion;
    private String nacionalidad;

    public Jugador(String nombre, String apellido, int edad, String direccion, String telefono, String correo,
            int numeroCamiseta, String posicion, String nacionalidad) {
        super(nombre, apellido, edad, direccion, telefono, correo);
        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
        this.nacionalidad = nacionalidad;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de Camiseta=" + numeroCamiseta + ", Posicion=" + posicion
                + ", Nacionalidad="
                + nacionalidad;
    }
}
