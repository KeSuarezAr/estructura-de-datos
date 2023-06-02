package org.uide.clase2;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class Clase2 {

    public static void main(String[] args) {
        ArrayListas();
    }

    public static void ArrayListas() {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        ListIterator<Integer> variable = lista.listIterator();
        System.out.println(variable.next());
    }
}