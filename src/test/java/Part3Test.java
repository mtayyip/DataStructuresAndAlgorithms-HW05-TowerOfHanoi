/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
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
public class Part3Test {

    public List<String> list1=new ArrayList<>();    
    public List<String> list2=new ArrayList<>();    
    public Part3Test() 
    {}
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() 
    {
        list1.add("Ali");list1.add("Ahmet");list1.add("Kamil");
        list1.add("Veli");list1.add("Tayyip");list1.add("Hasan");

        list2.add("Suat");list2.add("Tayyip");list2.add("YÄ±lmaz");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of intersectionOfLists method, of class Part3.
     */
    @Test
    public void testIntersectionOfLists() {
        System.out.println("intersectionOfLists test");
        Part3 instance = new Part3();
        List expResult =new ArrayList();
        
        expResult.add("Ali");expResult.add("Ahmet");expResult.add("Kamil");
        expResult.add("Veli");expResult.add("Tayyip");expResult.add("Hasan");
        expResult.add("Suat");expResult.add("YÄ±lmaz");
        
        List result = instance.intersectionOfLists();
        assertEquals(expResult,result);

    }

    /**
     * Test of unionOfLists method, of class Part3.
     */
    @Test
    public void testUnionOfLists() {
        System.out.println("unionOfLists test");
        Part3 instance = new Part3();
        List expResult =new ArrayList();
        expResult.add("Tayyip");
        List result = instance.unionOfLists();
        assertEquals(expResult, result);
    }

    /**
     * Test of isSubset method, of class Part3.
     */
    @Test
    public void testIsSubset() {
        System.out.println("isSubset test");
        Part3 instance = new Part3();
        boolean expResult = false;
        boolean result = instance.isSubset();
        assertEquals(expResult, result);
    }
    
}
