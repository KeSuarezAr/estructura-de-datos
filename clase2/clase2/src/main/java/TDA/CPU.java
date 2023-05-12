package TDA;

public class CPU {
    private int velocidad;
    private int nucleos;
    private String marca;
    private String modelo;

    public CPU(int velocidad, int nucleos, String marca, String modelo) {
        this.velocidad = velocidad;
        this.nucleos = nucleos;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "{" +
                "velocidad=" + velocidad + '\'' +
                ", nucleos=" + nucleos + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
