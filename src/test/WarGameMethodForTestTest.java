
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class WarGameMethodForTestTest {    

    /**
     * Test of cardGeneratorMethod method, of class WarGameMethodForTest.
     */    
    @Test
    public void testCardGeneratorMethodGood() {
        System.out.println("cardGeneratorMethod");
        int a = 4;
        int b = 15;
        boolean expResult = true;
        boolean result = WarGameMethodForTest.cardGeneratorMethod(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCardGeneratorMethodBad() {
        System.out.println("cardGeneratorMethod");
        int a = 6;
        int b = 15;
        boolean expResult = false;
        boolean result = WarGameMethodForTest.cardGeneratorMethod(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCardGeneratorMethodBoundary() {
        System.out.println("cardGeneratorMethod");
        int a = 3;
        int b = 14;
        boolean expResult = false;
        boolean result = WarGameMethodForTest.cardGeneratorMethod(a, b);
        assertEquals(expResult, result);
        
    }
    
    
    /**
     * Test of cardCompare1bigger2 method, of class WarGameMethodForTest.
     */
    @Test
    public void testCardCompare1bigger2Good() {
        System.out.println("cardCompare1bigger2");
        WarGameMethodForTest.Card deck1 = new WarGameMethodForTest.Card(1,14);
        WarGameMethodForTest.Card deck2 = new WarGameMethodForTest.Card(0,9);
        boolean expResult = true;
        boolean result = WarGameMethodForTest.cardCompare1bigger2(deck1, deck2);
        assertEquals(expResult, result);        
    }
    @Test
    public void testCardCompare1bigger2Bad() {
        System.out.println("cardCompare1bigger2");
        WarGameMethodForTest.Card deck1 = new WarGameMethodForTest.Card(3,3);
        WarGameMethodForTest.Card deck2 = new WarGameMethodForTest.Card(1,9);
        boolean expResult = false;
        boolean result = WarGameMethodForTest.cardCompare1bigger2(deck1, deck2);
        assertEquals(expResult, result);        
    }
    @Test
    public void testCardCompare1bigger2Boundary() {
        System.out.println("cardCompare1bigger2");
        WarGameMethodForTest.Card deck1 = new WarGameMethodForTest.Card(2,6);
        WarGameMethodForTest.Card deck2 = new WarGameMethodForTest.Card(1,6);
        boolean expResult = false;
        boolean result = WarGameMethodForTest.cardCompare1bigger2(deck1, deck2);
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of cardCompare1smaller2 method, of class WarGameMethodForTest.
     */
    @Test
    public void testCardCompare1smaller2Good() {
        System.out.println("cardCompare1smaller2");
        WarGameMethodForTest.Card deck1 = new WarGameMethodForTest.Card(3,9);
        WarGameMethodForTest.Card deck2 = new WarGameMethodForTest.Card(1,12);
        boolean expResult = true;
        boolean result = WarGameMethodForTest.cardCompare1smaller2(deck1, deck2);
        assertEquals(expResult, result);        
    }
    @Test
    public void testCardCompare1smaller2Bad() {
        System.out.println("cardCompare1smaller2");
        WarGameMethodForTest.Card deck1 = new WarGameMethodForTest.Card(2,11);
        WarGameMethodForTest.Card deck2 = new WarGameMethodForTest.Card(1,8);
        boolean expResult = false;
        boolean result = WarGameMethodForTest.cardCompare1smaller2(deck1, deck2);
        assertEquals(expResult, result);        
    }
    @Test
    public void testCardCompare1smaller2Boudary() {
        System.out.println("cardCompare1smaller2");
        WarGameMethodForTest.Card deck1 = new WarGameMethodForTest.Card(3,5);
        WarGameMethodForTest.Card deck2 = new WarGameMethodForTest.Card(1,5);
        boolean expResult = false;
        boolean result = WarGameMethodForTest.cardCompare1smaller2(deck1, deck2);
        assertEquals(expResult, result);        
    }

    /**
     * Test of cardCompareWar method, of class WarGameMethodForTest.
     */
    @Test
    public void testCardCompareWarGood() {
        System.out.println("cardCompareWar");
        WarGameMethodForTest.Card deck1 = new WarGameMethodForTest.Card(1,11);
        WarGameMethodForTest.Card deck2 = new WarGameMethodForTest.Card(2,11);
        boolean expResult = true;
        boolean result = WarGameMethodForTest.cardCompareWar(deck1, deck2);
        assertEquals(expResult, result);        
    }
    @Test
    public void testCardCompareWarBad() {
        System.out.println("cardCompareWar");
        WarGameMethodForTest.Card deck1 = new WarGameMethodForTest.Card(1,6);
        WarGameMethodForTest.Card deck2 = new WarGameMethodForTest.Card(1,10);
        boolean expResult = false;
        boolean result = WarGameMethodForTest.cardCompareWar(deck1, deck2);
        assertEquals(expResult, result);        
    }
}
