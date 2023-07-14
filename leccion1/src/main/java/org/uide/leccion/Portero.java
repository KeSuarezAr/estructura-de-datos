package org.uide.leccion;

public class Portero extends Jugador {
    private String piernaHabil;
    private String estiloJuego;
    private int goles;
    private int penales;

    public Portero(String nombre, String apellido, int edad, String direccion, String telefono, String correo,
            int numeroCamiseta, String[] posicion, String nacionalidad, String piernaHabil, String estiloJuego,
            int goles, int penales) {
        super(nombre, apellido, edad, direccion, telefono, correo, numeroCamiseta, posicion, nacionalidad);
        this.piernaHabil = piernaHabil;
        this.estiloJuego = estiloJuego;
        this.goles = goles;
        this.penales = penales;
    }

    public void setPiernaHabil(String piernaHabil) {
        this.piernaHabil = piernaHabil;
    }

    public String getPiernaHabil() {
        return piernaHabil;
    }

    public void setEstiloJuego(String estiloJuego) {
        this.estiloJuego = estiloJuego;
    }

    public String getEstiloJuego() {
        return estiloJuego;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getGoles() {
        return goles;
    }

    public void setPenales(int penales) {
        this.penales = penales;
    }

    public int getPenales() {
        return penales;
    }

    @Override
    public String toString() {
        return super.toString() + ", Pierna Habil=" + piernaHabil + ", Estilo de Juego=" + estiloJuego
                + ", Goles Recibidos=" + goles + ", Penales Recibidos=" + penales;
    }

}
