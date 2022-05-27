/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Task10_2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author munish
 */
public class ArrayTestTest {
   
    private ArrayTest arrayTest;
    
    public ArrayTestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        arrayTest = new ArrayTest();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of find method, of class ArrayTest.
     */
    @Test
    public void testFindMin() {
        System.out.println("find");
        int index = 1;
        int[] intArray = {1,2,3};
        double expResult = 1.0;
        double result = arrayTest.find(index, intArray);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testFindMax() {
        System.out.println("find");
        int index = 2;
        int[] intArray = {1,2,3};
        double expResult = 3.0;
        double result = arrayTest.find(index, intArray);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     @Test
    public void testFindLessThanZero() {
        System.out.println("find");
        int index = -2;
        int[] intArray = {-6,6,5,-8};
        arrayTest.find(index, intArray);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     @Test
    public void testFindLargerThanTwo() {
        System.out.println("find");
        int index = 3;
        int[] intArray = {9,11,3};
        double expResult = 0.0;
        double result = arrayTest.find(index, intArray);
        assertTrue(expResult == result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     @Test
    public void testFindNullArray() {
        System.out.println("find");
        int index = 2;
        int[] intArray = null;
        arrayTest.find(index, intArray);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
