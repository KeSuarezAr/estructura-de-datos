package org.uide.leccion;

public class Delantero extends Jugador {
    private String piernaHabil;
    private String estiloJuego;
    private int asistencias;
    private int goles;
    private int pases;

    public Delantero(String nombre, String apellido, int edad, String direccion, String telefono, String correo,
            int numeroCamiseta, String[] posicion, String nacionalidad, String piernaHabil, String estiloJuego,
            int asistencias, int goles, int pases) {
        super(nombre, apellido, edad, direccion, telefono, correo, numeroCamiseta, posicion, nacionalidad);
        this.piernaHabil = piernaHabil;
        this.estiloJuego = estiloJuego;
        this.asistencias = asistencias;
        this.goles = goles;
        this.pases = pases;
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

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getGoles() {
        return goles;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getPases() {
        return pases;
    }

    @Override
    public String toString() {
        return super.toString() + "Pierna Hábil: " + piernaHabil + "Estilo de Juego: " + estiloJuego
                + "Asistencias: " + asistencias + "Goles: " + goles + "Pases: " + pases;
    }
}
