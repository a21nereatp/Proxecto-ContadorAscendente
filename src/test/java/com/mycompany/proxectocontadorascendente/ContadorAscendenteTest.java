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
    public void testIncrementar() {
        System.out.println("incrementar");
        ContadorAscendente instance = new ContadorAscendente(-500);
        int expResult = -499;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
    @Test
    public void testIncrementar1() {
        System.out.println("incrementar");
        ContadorAscendente instance = new ContadorAscendente(999);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
    @Test
    public void testIncrementar3() {
        System.out.println("incrementar");
        ContadorAscendente instance = new ContadorAscendente(1000);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
    @Test
    public void testIncrementar4() {
        System.out.println("incrementar");
        ContadorAscendente instance = new ContadorAscendente(3000);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
    @Test
    public void testIncrementar5() {
        System.out.println("incrementar");
        ContadorAscendente instance = new ContadorAscendente(500);
        int expResult = 501;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
    @Test
    public void testIncrementar6() {
        System.out.println("incrementar");
        ContadorAscendente instance = new ContadorAscendente(1500);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
    }
}
