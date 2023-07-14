package org.uide.leccion;

public class Leccion {

    public static void main(String[] args) {

        Persona persona = new Persona("Kevin", "Suarez", 20, "Calle 1",
                "0959403201", "kevingunx@gmail.com");

        Jugador jugador = new Jugador("Lionel", "Messi", 35, "Bellamar de Castelldefels", "932055648",
                "", 30, new String[] { "Delantero", "Medio", "Defensa" }, "Argentina");

        Portero portero = new Portero("Marc-André", "ter Stegen", 29, "Calle 2", "932055648", "", 1,
                new String[] { "Delantero", "Medio", "Defensa" }, "Alemania", "Derecha", "Ofensivo", 0, 0);

        Defensa defensa = new Defensa("Gelard", "Piqué", 34, "Calle 3", "932055648",
                "", 3, new String[] { "Delantero", "Medio", "Defensa" }, "España", "Derecha", "Ofensivo", 0, 0, 0);

        Delantero delantero = new Delantero("Antoine", "Griezmann", 30, "Calle 4",
                "932055648", "", 7, new String[] { "Delantero", "Medio", "Defensa" }, "Francia", "Derecha", "Ofensivo",
                0, 0, 0);

        System.out.println(persona);
        System.out.println(jugador);
        System.out.println(portero);
        System.out.println(defensa);
        System.out.println(delantero);
    }
}
