package clase2;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class clase2 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        // ArrayListas();
        // LisString();
        MainList(myObj);
    }

    public static void ArrayListas() {
        List<Integer> lista = new ArrayList<Integer>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        System.out.println(lista.size());
        System.out.println(lista.get(2));
        System.out.println(lista.indexOf(2));
        System.out.println(lista.contains(2));
        System.out.println(lista.remove(2) + " removed");

        System.out.println(lista.toString());
    }

    public static void LisString() {
        String[] arreglo = { "a", "b", "c", "d", "e" };
        List<String> lista = new ArrayList<>();
        for (int i = 0; i < arreglo.length; i++) {
            lista.add(arreglo[i]);
        }
        System.out.println(lista);
        lista.remove("c");
        System.out.println(lista);
    }

    public static void MainList(Scanner myObj) {
        List<String> lista = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter line: ");
            String input = myObj.nextLine();
            lista.add(input);
        }
        String variable = Choice(myObj);

        if (variable.equals("e")) {
            System.out.println("Linea a eliminar: ");
            String input = myObj.nextLine();
            lista.remove(input);
        } else if (variable.equals("m")) {
            System.out.println("Linea a modificar: ");
            String input = myObj.nextLine();
            System.out.println("Enter new line: ");
            String input2 = myObj.nextLine();
            lista.set(lista.indexOf(input), input2);
        } else if (variable.equals("l")) {
            System.out.println("Linea a leer: ");
            String input = myObj.nextLine();
            System.out.println(lista.get(lista.indexOf(input)));
        } else {
            System.out.println("Invalid input");
            Choice(myObj);
        }

        System.out.println(lista);
    }

    public static String Choice(Scanner myObj) {
        System.out.println("Desea eliminar, modificar, o leer una linea? (e/m/l)");
        String input = myObj.nextLine();

        return input;
    }
}