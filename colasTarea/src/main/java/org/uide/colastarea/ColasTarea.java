
package org.uide.colastarea;

public class ColasTarea {

    public static void main(String[] args) {
        GestorBanco gc = new GestorBanco();

        // gc.llegadaCliente(new Cliente("Kevin", "Andres", "1100444809", "0959403201",
        // "Test"));
        // gc.atencionCliente();
        gc.simulacion(5000);
    }
}
