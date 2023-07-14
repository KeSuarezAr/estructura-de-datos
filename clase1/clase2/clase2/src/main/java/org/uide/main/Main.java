package org.uide.main;

import org.uide.tda.Laptop;
import org.uide.tda.CPU;
import org.uide.tda.Bateria;
import org.uide.tda.DiscoDuro;
import org.uide.tda.Computadora;
import org.uide.tda.FuenteDePoder;

public class Main {

    public static void main(String[] args) {
        CPU cpu = new CPU(300, 4, "Intel", "i7");
        DiscoDuro disco = new DiscoDuro(500, "Kignstone", "SSD");
        Bateria bateria = new Bateria(1, "Samsung", "Litio", "S10");
        FuenteDePoder fuente = new FuenteDePoder(400, "Samsung", "S10");

        Computadora computadora = new Computadora(cpu, disco, fuente);
        Laptop laptop = new Laptop(bateria, cpu, disco, fuente);

        System.out.println(computadora);
        System.out.println(laptop);
    }

}
