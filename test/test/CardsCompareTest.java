/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author seanz
 */
public class CardsCompareTest {
    
    //TEST card1 bigger than card2
    @Test
    public void testCardCompare1bigger2Good() {
        System.out.println("cardCompare1bigger2");
        String deck1 = "HEARTS:ace";
        String deck2 = "CLUBS:4";
        boolean expResult = true;
        boolean result = CardsCompare.cardCompare1bigger2(deck1, deck2);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testCardCompare1bigger2Bad() {
        System.out.println("cardCompare1bigger2");
        String deck1 = "HEARTS:5";
        String deck2 = "CLUBS:king";
        boolean expResult = false;
        boolean result = CardsCompare.cardCompare1bigger2(deck1, deck2);
        assertEquals(expResult, result);
       
    }
    
    //TEST card1 smaller than card2
    @Test
    public void testCardCompare1bigger2Boundary() {
        System.out.println("cardCompare1bigger2");
        String deck1 = "HEARTS:ace";
        String deck2 = "CLUBS:Ace";
        boolean expResult = false;
        boolean result = CardsCompare.cardCompare1bigger2(deck1, deck2);
        assertEquals(expResult, result);
       
    }
   
    @Test
    public void testCardCompare1smaller2Good() {
        System.out.println("cardCompare1smaller2");
        String deck1 = "Diamonds:9";
        String deck2 = "Spades:Jack";
        boolean expResult = true;
        boolean result = CardsCompare.cardCompare1smaller2(deck1, deck2);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCardCompare1smaller2Bad() {
        System.out.println("cardCompare1smaller2");
        String deck1 = "Diamonds:6";
        String deck2 = "Spades:2";
        boolean expResult = false;
        boolean result = CardsCompare.cardCompare1smaller2(deck1, deck2);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCardCompare1smaller2Boundary() {
        System.out.println("cardCompare1smaller2");
        String deck1 = "Diamonds:8";
        String deck2 = "Spades:8";
        boolean expResult = false;
        boolean result = CardsCompare.cardCompare1smaller2(deck1, deck2);
        assertEquals(expResult, result);
        
    }
    
    //TEST WAR
    @Test
    public void testCardCompareWarGood() {
        System.out.println("cardCompareWar");
        String deck1 = "Diamonds:queen";
        String deck2 = "HEARTS:queen";
        boolean expResult = true;
        boolean result = CardsCompare.cardCompareWar(deck1, deck2);
        assertEquals(expResult, result);

    }
    @Test
    public void testCardCompareWarBad() {
        System.out.println("cardCompareWar");
        String deck1 = "Diamonds:queen";
        String deck2 = "HEARTS:Jack";
        boolean expResult = false;
        boolean result = CardsCompare.cardCompareWar(deck1, deck2);
        assertEquals(expResult, result);

    }
}
