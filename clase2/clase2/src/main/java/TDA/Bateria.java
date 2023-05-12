package TDA;

public class Bateria {
    private int capacidad;
    private String marca;
    private String tipo;
    private String modelo;

    public Bateria(int capacidad, String marca, String tipo, String modelo) {
        this.capacidad = capacidad;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "{" +
                "capacidad= " + capacidad + '\'' +
                ", marca= " + marca + '\'' +
                ", tipo= " + tipo + '\'' +
                ", modelo= " + modelo + '\'' +
                "}";
    }
}
