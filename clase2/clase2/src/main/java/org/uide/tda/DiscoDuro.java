package org.uide.tda;

public class DiscoDuro {
    protected int capacidad;
    protected String marca;
    protected String modelo;

    public DiscoDuro(int capacidad, String marca, String modelo) {
        this.capacidad = capacidad;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "{" +
                "Capacidad= " + capacidad + '\'' +
                ", Marca= " + marca + '\'' +
                ", Modelo= " + modelo + '\'' +
                "}";
    }
}
