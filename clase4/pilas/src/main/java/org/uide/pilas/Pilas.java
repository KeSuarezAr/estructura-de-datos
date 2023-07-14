package org.uide.pilas;

import java.util.Scanner;

public class Pilas {

    public static void main(String[] args) {
        GestorHistorial gh = new GestorHistorial();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la url: ");
            String url = sc.nextLine();
            System.out.println("Ingrese el titulo: ");
            String titulo = sc.nextLine();
            System.out.println("Ingrese el dispositivo: ");
            String dispositivo = sc.nextLine();
            System.out.println("Ingrese la fecha de cierre: ");
            String fechaCierre = sc.nextLine();
            gh.visitarWeb(new PaginaWeb(url, titulo, dispositivo, fechaCierre));
        }

        PaginaWeb movil = gh.obtenerUltimoDispositivo();

        System.out.println(movil);

        sc.close();
    }
}
