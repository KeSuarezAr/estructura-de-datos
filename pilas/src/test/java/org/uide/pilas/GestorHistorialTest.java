/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.uide.pilas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author MsiComputer
 */
public class GestorHistorialTest {

    public GestorHistorialTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of visitarWeb method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testVisitarWeb() {
        System.out.println("visitarWeb");
        PaginaWeb pagina = new PaginaWeb("Google", "Google", "Google", "Google");
        GestorHistorial instance = new GestorHistorial();
        instance.visitarWeb(pagina);
    }

    /**
     * Test of cerrarWeb method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testCerrarWeb() {
        System.out.println("cerrarWeb");
        GestorHistorial instance = new GestorHistorial();
        instance.cerrarWeb();
    }

    /**
     * Test of eliminarWeb method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testEliminarWeb() {
        System.out.println("eliminarWeb");
        GestorHistorial instance = new GestorHistorial();
        instance.eliminarWeb();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUltimaVisita method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testObtenerUltimaVisita() {
        System.out.println("obtenerUltimaVisita");
        GestorHistorial instance = new GestorHistorial();
        PaginaWeb expResult = null;
        PaginaWeb result = instance.obtenerUltimaVisita();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUltimoDispositivo method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testObtenerUltimoDispositivo() {
        System.out.println("obtenerUltimoDispositivo");
        GestorHistorial instance = new GestorHistorial();
        PaginaWeb expResult = null;
        PaginaWeb result = instance.obtenerUltimoDispositivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of historial method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testHistorial() {
        GestorHistorial instance = new GestorHistorial();
        PaginaWeb pagina1 = new PaginaWeb("Google", "https://www.google.com", "PC", "Windows");
        PaginaWeb pagina2 = new PaginaWeb("Facebook", "https://www.facebook.com", "PC", "Windows");
        PaginaWeb pagina3 = new PaginaWeb("Twitter", "https://www.twitter.com", "PC", "Windows");
        instance.visitarWeb(pagina1);
        instance.visitarWeb(pagina2);
        instance.visitarWeb(pagina3);
        instance.eliminarWeb();
        PaginaWeb ultimaVisita = instance.obtenerUltimaVisita();
        assertEquals(pagina2, ultimaVisita);
        PaginaWeb visitaDispositivo = instance.obtenerUltimoDispositivo();
        assertNull(visitaDispositivo);
    }

}
