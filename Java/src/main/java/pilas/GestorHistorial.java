package pilas;

import java.util.Date;
import java.util.Stack;
import java.util.Scanner;

public class GestorHistorial {

    private Stack<PaginaWeb> pila;
    Scanner sc = new Scanner(System.in);

    public GestorHistorial() {
        pila = new Stack<PaginaWeb>();
    }

    public void visitarWeb(PaginaWeb pagina) {
        pila.push(pagina);
        System.out.println("Se agrego la pagina: " + pagina.getTitulo());
    }

    public void cerrarWeb() {
        PaginaWeb pg = (PaginaWeb) pila.peek();
        pg.setFechaCierre(new Date().toString());
        System.out.println("Se cerro la ultima pagina web");
    }

    public void eliminarWeb() {
        pila.pop();
        System.out.println("Se elimino la ultima pagina web");
    }

    public PaginaWeb obtenerUltimaVisita() {
        return pila.peek();
    }

    public PaginaWeb obtenerUltimoDispositivo() {
        System.out.println("Que dispositivo desea?");
        String preg = sc.nextLine();

        for (int i = pila.size() - 1; i >= 0; i--) {
            PaginaWeb pg = (PaginaWeb) pila.get(i);
            if (pg.getDispositivo().equals(preg)) {
                return pg;
            }
        }
        return null;
    }

    public void historial() {
        for (Object object : pila) {
            System.out.println(object);
            PaginaWeb p = (PaginaWeb) object;
            System.out.println(p.toString());
        }
    }
}
