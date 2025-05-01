/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package gui;

import database.transaction.HesapBilgileri;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author berat
 */
public class OdemeEkranıTest {
    
    public OdemeEkranıTest() {
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
     * Test of getEdits method, of class OdemeEkranı.
     */
    @Test
    public void testGetEdits() {
        System.out.println("getEdits");
        OdemeEkranı instance = new OdemeEkranı();
        instance.getEdits();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bilgilerGecerliMi method, of class OdemeEkranı.
     */
    @Test
    public void testBilgilerGecerliMi() {
        System.out.println("bilgilerGecerliMi");
        OdemeEkranı instance = new OdemeEkranı();
        boolean expResult = false;
        boolean result = instance.bilgilerGecerliMi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHesapBilgileri method, of class OdemeEkranı.
     */
    @Test
    public void testGetHesapBilgileri() {
        System.out.println("getHesapBilgileri");
        OdemeEkranı instance = new OdemeEkranı();
        HesapBilgileri expResult = null;
        HesapBilgileri result = instance.getHesapBilgileri();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class OdemeEkranı.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        OdemeEkranı.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
