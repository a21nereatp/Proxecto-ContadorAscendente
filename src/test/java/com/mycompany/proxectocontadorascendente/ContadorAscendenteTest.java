/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proxectocontadorascendente;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class ContadorAscendenteTest {
    
    public ContadorAscendenteTest() {
    }

    @Test
    public void testGetValorActual() {
        System.out.println("getValorActual");
        ContadorAscendente instance = null;
        int expResult = 0;
        int result = instance.getValorActual();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetValorActual() {
        System.out.println("setValorActual");
        int valorActual = 0;
        ContadorAscendente instance = null;
        instance.setValorActual(valorActual);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIncrementar() {
        System.out.println("incrementar");
        ContadorAscendente instance = null;
        int expResult = 0;
        int result = instance.incrementar();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testReiniciar() {
        System.out.println("reiniciar");
        ContadorAscendente instance = null;
        instance.reiniciar();
        fail("The test case is a prototype.");
    }

    @Test
    public void testCambiarValor() {
        System.out.println("cambiarValor");
        int modificador = 0;
        ContadorAscendente instance = null;
        int expResult = 0;
        int result = instance.cambiarValor(modificador);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        ContadorAscendente instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
