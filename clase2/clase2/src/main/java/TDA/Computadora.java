package TDA;

public class Computadora {
    protected CPU cpu;
    protected DiscoDuro disco;
    protected Bateria bateria;
    protected FuenteDePoder fuente;

    public Computadora(CPU cpu, DiscoDuro disco, FuenteDePoder fuente) {
        this.cpu = cpu;
        this.disco = disco;
        this.fuente = fuente;
    }

    public CPU getCpu() {
        return cpu;
    }

    public DiscoDuro getDisco() {
        return disco;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public FuenteDePoder getFuente() {
        return fuente;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setDisco(DiscoDuro disco) {
        this.disco = disco;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public void setFuente(FuenteDePoder fuente) {
        this.fuente = fuente;
    }

    @Override
    public String toString() {
        return "Computadora {" +
                "\nCPU= " + cpu +
                "\nDISCO= " + disco +
                "\nFUENTE= " + fuente +
                "\n}";
    }
}
