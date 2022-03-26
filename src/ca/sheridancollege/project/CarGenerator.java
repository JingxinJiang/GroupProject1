/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author seanz
 */
public class CarGenerator {
    
    private static List<Card> cardDeck = new ArrayList<Card>(); 
    private static LinkedList<Card> deck1 = new LinkedList<Card>();
    private static LinkedList<Card> deck2 = new LinkedList<Card>();

    public LinkedList<Card> getDeck1() {
        return deck1;
    }

    public LinkedList<Card> getDeck2() {
        return deck2;
    }
    
    public static void cardGeneratorMethod(){
        for(int x=0; x<4; x++){          
            for(int y=2; y<15; y++){     
                cardDeck.add(new Card(x,y)); 
            } 
        }
        
        Collections.shuffle(cardDeck, new Random());   
        
//        deck1.addAll(cardDeck.subList(0, 26));                  
//        deck2.addAll(cardDeck.subList(26, cardDeck.size()));
        //Test for user console
        deck1.addAll(cardDeck.subList(0, 6));                  
        deck2.addAll(cardDeck.subList(26, 32));
    }
            
    
        
        
    
}
