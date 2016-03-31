/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Muhammet
 */
public class Part2Test {
    
    public Part2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of remove method, of class Part2.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Part2 instance = new Part2();
        instance.add("Ali");instance.add("Ahmet");instance.add("Fatih");instance.add("Ali");
        instance.add("Veli");instance.add("Ali");instance.add("Salih");
        boolean expResult = false;
        boolean result = instance.remove("Ali");
        /*5 eleamani linkedlistte 1 kere oldugu icin silme yapamayip false return eder.*/
        
        assertEquals(expResult, result);
    }
   
}