package org.uide.clase2;

import TDA.Bateria;
import TDA.CPU;
import TDA.Computadora;
import TDA.DiscoDuro;
import TDA.FuenteDePoder;

public class Main {

    public static void main(String[] args) {
        CPU cpu = new CPU(300, 4, "Intel", "i7");
        DiscoDuro disco = new DiscoDuro(500, "Kignstone", "SSD");
        Bateria bateria = new Bateria(1, "Samsung", "Litio", "S10");
        FuenteDePoder fuente = new FuenteDePoder(400, "Samsung", "S10");

        Computadora computadora = new Computadora(cpu, disco, fuente);

        System.out.println(computadora);
    }

}
