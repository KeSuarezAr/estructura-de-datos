package org.uide.recursividad;

public class Recursividad {

    public static void main(String[] args) {
        imprimir(0);
    }

    static void imprimir(int x) {
        if (x > 5) {
            return;
        } else {
            System.out.println(x);
            imprimir(x + 1);
        }
    }

}
