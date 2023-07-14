package org.uide.recursividad;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursividad {
    ArrayList<String> lista = new ArrayList<>(
            Arrays.asList("Kevin", "Juan", "Nicolas", "Arlette", "Leonardo", "Santiago"));

    public static void main(String[] args) {
        Recursividad rec = new Recursividad();
        int v = rec.factorial(5);
        double p = rec.potencia(5);
        String n = rec.buscar_coincidencias("Juan", "Santiago");

        System.out.println("Potencia: " + p);
        System.out.println("Factorial: " + v);
        System.out.println("Coincidencia: " + n);
    }

    /**
     * Busca coincidencias en una lista de nombres
     * 
     * @param persona
     * @param nombre_companero
     * @return persona
     */
    String buscar_coincidencias(String persona, String nombre_companero) {
        if (persona.equals(nombre_companero)) {
            return persona;
        } else {
            for (String nombre : lista) {
                String encontrado = buscar_coincidencias(nombre, nombre_companero);
                if (encontrado != null) {
                    return encontrado;
                }
            }
            return null;
        }
    }

    /**
     * Calcula el factorial de un número
     * 
     * @param fact
     * @return fact
     */
    int factorial(int fact) {
        if (fact > 0) {
            int valor = fact * factorial(fact - 1);
            return valor;
        } else {
            return 1;
        }
    }

    /**
     * Calcula la potencia de un número
     * 
     * @param num
     * @return 2 * potencia(num - 1)
     */
    double potencia(int num) {
        if (num == 0) {
            return 1;
        } else {
            return 2 * potencia(num - 1);
        }
    }
}
