package TDA;

public class DiscoDuro {
    private int capacidad;
    private String marca;
    private String modelo;

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
