package org.uide.tarea1;

import java.util.Random;
import java.util.Scanner;

public class Tarea1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arreglo = generarArreglo(scanner);
        contieneValor(arreglo, scanner);
        calcularPromedio(arreglo);
        encontrarMinimo(arreglo);
        encontrarMaximo(arreglo);
        contarMayoresAlPromedio(arreglo);
        estaOrdenado(arreglo);
    }

    private static int[] generarArreglo(Scanner scanner) {
        System.out.println("Ingrese el arreglo separado por comas: ");
        String[] arregloString = scanner.nextLine().split(",");
        int[] arreglo = new int[arregloString.length];

        if (arregloString.length > 0) {
            for (int i = 0; i < arregloString.length; i++) {
                arreglo[i] = Integer.parseInt(arregloString[i]);
            }
        } else {
            arreglo = new int[10];
            Random random = new Random();
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = random.nextInt(10);
            }
            System.out.println("Arreglo: " + java.util.Arrays.toString(arreglo));
            return arreglo;
        }

        System.out.println("Arreglo: " + java.util.Arrays.toString(arreglo));
        return arreglo;
    }

    private static double calcularPromedio(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        double promedio = suma / arreglo.length;
        System.out.println("Promedio: " + promedio);
        return promedio;
    }

    private static boolean contieneValor(int[] arreglo, Scanner scanner) {

        System.out.println("Ingrese un valor: ");
        int valor = scanner.nextInt();

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                System.out.println("El valor si existe: " + valor);
                return true;
            }
        }
        System.out.println("El valor no existe: " + valor);
        return false;
    }

    private static int encontrarMinimo(int[] arreglo) {
        int minimo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }
        System.out.println("Minimo: " + minimo);
        return minimo;
    }

    private static int encontrarMaximo(int[] arreglo) {
        int maximo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }
        System.out.println("Maximo: " + maximo);
        return maximo;
    }

    private static int contarMayoresAlPromedio(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        double promedio = suma / (double) arreglo.length;
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > promedio) {
                contador++;
            }
        }
        System.out.println("Mayores al promedio: " + contador);
        return contador;
    }

    private static boolean estaOrdenado(int[] arreglo) {
        boolean ascendente = true;
        boolean descendente = true;
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < arreglo[i - 1]) {
                ascendente = false;
            }
            if (arreglo[i] > arreglo[i - 1]) {
                descendente = false;
            }
        }
        boolean ordenado = ascendente || descendente;
        if (ordenado) {
            System.out.println("Esta ordenado: " + (ascendente ? "Ascendente" : "Descendente"));
        } else {
            System.out.println("No esta ordenado");
        }
        return ordenado;
    }
}
