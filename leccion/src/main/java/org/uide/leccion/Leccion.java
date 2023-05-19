package org.uide.leccion;

public class Leccion {

    public static void main(String[] args) {
        Persona persona = new Persona("Kevin", "Suarez", 20, "Calle 1",
                "0959403201", "kevingunx@gmail.com");

        Jugador jugador = new Jugador("Lionel", "Messi", 35, "Bellamar de Castelldefels", "932055648",
                "info+support@messi.com", 30, "Delantero", "Argentina");

        Portero portero = new Portero("Marc-André", "ter Stegen", 29, "Calle 2", "932055648", "", 1, "Portero",
                "Alemania", "Derecha", "Ofensivo", 0, 0);

        Defensa defensa = new Defensa("Gelard", "Piqué", 34, "Calle 3", "932055648", "", 3, "Defensa", "España",
                "Derecha", "Ofensivo", 0, 0, 0);

        System.out.println(persona);
        System.out.println(jugador);
        System.out.println(portero);
        System.out.println(defensa);
    }
}
