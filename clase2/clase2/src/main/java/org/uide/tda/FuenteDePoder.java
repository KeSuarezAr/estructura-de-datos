package org.uide.tda;

public class FuenteDePoder {
    protected int watts;
    protected String marca;
    protected String modelo;

    public FuenteDePoder(int watts, String marca, String modelo) {
        this.watts = watts;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getWatts() {
        return watts;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "{" +
                "Watts" + watts + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
