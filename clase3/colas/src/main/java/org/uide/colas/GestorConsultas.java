package org.uide.colas;

import java.util.LinkedList;
import java.util.Queue;

public class GestorConsultas {

    private final Queue<Consulta> cola;

    public GestorConsultas() {
        cola = new LinkedList<>();
    }

    public void nuevaConsulta(Consulta c) {
        cola.add(c);
    }

    public void atenderConsulta() {
        Consulta c = cola.poll();
        System.out.println("Atendiendo consulta: " + c);
    }

    public void imprimirConsultas() {
        System.out.println("Consultas pendientes: " + cola.size());
        for (Consulta c : cola) {
            System.out.println(c);
        }
    }
}
