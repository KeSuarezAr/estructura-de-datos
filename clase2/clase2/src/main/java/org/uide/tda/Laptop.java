package org.uide.tda;



public class Laptop extends Computadora {

    protected Bateria bateria;

    public Laptop(Bateria bateria, CPU cpu, DiscoDuro disco, FuenteDePoder fuente) {
        super(cpu, disco, fuente);
        this.bateria = bateria;
        this.cpu = cpu;
        this.disco = disco;
        this.fuente = fuente;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "\nBATERIA= " + bateria +
                "\nCPU= " + cpu +
                "\nDISCO= " + disco +
                "\nFUENTE= " + fuente +
                "\n}";
    }
}
