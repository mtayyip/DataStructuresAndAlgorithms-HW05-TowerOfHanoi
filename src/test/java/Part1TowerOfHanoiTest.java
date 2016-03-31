/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Stack;
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
public class Part1TowerOfHanoiTest {
    
    public Part1TowerOfHanoiTest() {
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
     * Test of TowerOfHanoi method, of class Part1TowerOfHanoi.
     */
    @Test
    public void testTowerOfHanoi() {
        System.out.println("TowerOfHanoi");
        int diskSize =4;
        Stack<Integer> src = null;
        Stack<Integer> dst = null;
        Stack<Integer> aux = null;
        Part1TowerOfHanoi instance = new Part1TowerOfHanoi();
        instance.TowerOfHanoi(diskSize, src, dst, aux);
    }
    
}
