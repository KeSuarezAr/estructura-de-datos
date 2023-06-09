package org.uide.colastarea;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class GestorBanco {

    private final Queue<Cliente> cola;

    public GestorBanco() {
        cola = new LinkedList<>();
    }

    public void llegadaCliente(Cliente c) {
        cola.add(c);
        System.out.println("Llegada de cliente: " + c);
    }

    public void atencionCliente() {
        if (cola.size() > 0) {
            Cliente c = cola.poll();
            System.out.println("Atendiendo cliente: " + c);
            System.out.println("Cliente atendido: " + c);
        } else {
            System.out.println("No hay clientes en cola");
        }
    }

    public void simulacion(int tiempo) {
        double prob_cliente = 0.5;
        int atendidos = 0;
        int no_atendidos = 0;
        int totales = 0;

        for (int i = 0; i < tiempo; i++) {
            double random = Math.random();
            if (random < prob_cliente) {
                llegadaCliente(new Cliente(randomSequence(), randomSequence(), randomSequence(), randomSequence(),
                        randomSequence()));
                totales++;
            }

            if (cola.size() > 0) {
                atencionCliente();
                atendidos++;
            } else {
                no_atendidos++;
            }
        }

        System.out.println("Clientes atendidos: " + atendidos);
        System.out.println("Clientes no atendidos: " + no_atendidos);
        System.out.println("Clientes totales: " + totales);
    }

    public String randomSequence() {
        final String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        final int length = 5;

        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }

        String randomString = sb.toString();
        return randomString;
    }
}
