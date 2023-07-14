package colas;

import java.util.Scanner;

public class Colas {

    public static void main(String[] args) {
        GestorConsultas gc = new GestorConsultas();

        Scanner scanner = new Scanner(System.in);

        String nombre;
        String apellidos;
        String descripcion;
        String telefono;
        String email;
        String consulta;

        for (int i = 0; i < 1; i++) {
            try {
                System.out.println("Ingrese su nombre: ");
                nombre = scanner.nextLine();

                System.out.println("Ingrese sus apellidos: ");
                apellidos = scanner.nextLine();

                System.out.println("Ingrese su descripción: ");
                descripcion = scanner.nextLine();

                System.out.println("Ingrese su teléfono: ");
                telefono = scanner.nextLine();

                System.out.println("Ingrese su email: ");
                email = scanner.nextLine();

                System.out.println("Ingrese su consulta: ");
                consulta = scanner.nextLine();

                gc.nuevaConsulta(new Consulta(nombre, apellidos, descripcion, telefono, email, consulta));
            } catch (Exception e) {
                System.out.println("Error al ingresar los datos");
                break;
            }

        }

        scanner.close();

        gc.imprimirConsultas();
    }
}
