/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.LinkedList;

/**
 *
 * @author seanz
 */
public class CardCompare1 {
    private static LinkedList<Card> cardPlayer1 = new LinkedList<Card>();
    private static LinkedList<Card> cardPlayer2 = new LinkedList<Card>();

    public static LinkedList<Card> getCardPlayer1() {
        return cardPlayer1;
    }

    public static LinkedList<Card> getCardPlayer2() {
        return cardPlayer2;
    }
    
    public static void cardCompare( LinkedList<Card> deck1,LinkedList<Card> deck2, int[] score){
        Card p1Card = deck1.pop();  
        Card p2Card = deck2.pop();
        System.out.println("Player 1 plays card is " + p1Card.toString());
        System.out.println("Player 2 plays card is " + p2Card.toString());
        if(p1Card.getCard() > p2Card.getCard()){
                deck1.addLast(p1Card); 
                deck1.addLast(p2Card);  
                System.out.println("Player 1 wins the round");
                score[0]++;
                System.out.println("The score of Player 1 is "+score[0]);
                System.out.println("The score of Player 2 is "+score[1]);
            }
 
            else if(p1Card.getCard() < p2Card.getCard()){
                deck2.addLast(p1Card);   
                deck2.addLast(p2Card);  
                System.out.println("Player 2 wins the round");
                score[1]++;
                System.out.println("The score of Player 1 is "+score[0]);
                System.out.println("The score of Player 2 is "+score[1]);
            } else {
                
                War1.warResult(deck1, deck2, p1Card, p2Card, score);
            }
    }
    
}
