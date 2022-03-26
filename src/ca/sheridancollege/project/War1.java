/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author seanz
 */
public class War1 {
    private LinkedList<Card> warPlayer1=new LinkedList<Card>();
    private LinkedList<Card> warPlayer2=new LinkedList<Card>();
    private static Scanner input = new Scanner(System.in);
    public LinkedList<Card> getWarPlayer1() {
        return warPlayer1;
    }

    public LinkedList<Card> getWarPlayer2() {
        return warPlayer2;
    }
    
    //first war method
    public static void warResult(LinkedList<Card> deck1,LinkedList<Card> deck2, Card p1Card, Card p2Card, int[] score ){
        System.out.println("War");                              
                List<Card> war1 = new ArrayList<Card>(); 
                List<Card> war2 = new ArrayList<Card>();
                war1.add(p1Card);
                war2.add(p2Card);
//                System.out.println("War card for player1 is " + war1.get(0).toString());
//                System.out.println("War card for player2 is " + war2.get(0).toString());
                for(int x=0; x<3; x++){
                    if(deck1.size() == 0){
                        deck2.addAll(war1); 
                        deck2.addAll(war2);
                        war1.clear();
                        war2.clear();
                        break;
                    }
                    if(deck2.size() == 0){  
                        deck1.addAll(war1); 
                        deck1.addAll(war2);
                        war1.clear();
                        war2.clear();                       
                        break;
                    }  
                    System.out.println("War face-down card for player1 is xx\nWar face-down card for player2 is xx");                                      
                    war1.add(deck1.pop()); 
                    war2.add(deck2.pop());                                                 
                }
                if(deck1.size() == 0){
                        deck2.addAll(war1); 
                        deck2.addAll(war2);
                        war1.clear();
                        war2.clear(); 
                    }
                if(deck2.size() == 0){  
                        deck1.addAll(war1); 
                        deck1.addAll(war2);
                        war1.clear();
                        war2.clear(); 
                    }  
                 if(deck1.size() != 0&&deck2.size() != 0){
                    war1.add(deck1.pop()); 
                    war2.add(deck2.pop()); 
//                 }                 
//                    
//                if(war1.size() == 5 && war2.size() == 5 &&deck1.size() != 0&&deck1.size() != 0){
                System.out.println("Player1 enter any key to show your card");
                        int add1=input.nextInt();
                        
                System.out.println("Player2 enter any key to show your card");
                        int add2=input.nextInt();
                System.out.println("For player1, Card for WAR BATTLE is " + war1.get((war1.size())-1).toString());
                System.out.println("For player2, Card for WAR BATTLE is " + war2.get((war2.size())-1).toString());
                    
                if(war1.get(4).getCard() > war2.get(4).getCard()){
                        deck1.addAll(war1); 
                        deck1.addAll(war2);
                        
                        
                        System.out.println("Player 1 wins the war round");
                        score[0]++;
                        System.out.println("The score of Player 1 is "+score[0]);
                        System.out.println("The score of Player 2 is "+score[1]);
                    }
                    
                    else if(war1.get(4).getCard() < war2.get(4).getCard()){
                        deck2.addAll(war1); 
                        deck2.addAll(war2);
                        System.out.println("Player 2 wins the war round");
                        score[1]++;
                        System.out.println("The score of Player 1 is "+score[0]);
                        System.out.println("The score of Player 2 is "+score[1]);
                    }else{                        
//                       int warSize=war1.size();
                        warAgainResult(deck1, deck2,war1, war2, score);
                    }                    
                }
    }
    //war again method
    

    public static void warAgainResult(LinkedList<Card> deck1,LinkedList<Card> deck2, List<Card> war1, List<Card> war2, int[] score){
        System.out.println("War again"); 
//        System.out.println("War card for player1 is " + war1.get(war1.size()-1).toString());
//        System.out.println("War card for player2 is " + war2.get(war2.size()-1).toString());
//        int step= warSize+4;
//        System.out.println("step is "+step);             
                
        for(int x=0; x<3; x++){
            if(deck1.size() == 0){
                deck2.addAll(war1); 
                deck2.addAll(war2);
                war1.clear();
                war2.clear();
                
                break;
            }
            if(deck2.size() == 0){  
                deck1.addAll(war1); 
                deck1.addAll(war2);
                war1.clear();
                war2.clear();
                break;
            }  
            System.out.println("War face-down card for player1 is xx\nWar face-down card for player2 is xx");                                      
            war1.add(deck1.pop()); 
            war2.add(deck2.pop());                                                 
        }
        if(deck1.size() == 0){
            
                        deck2.addAll(war1); 
                        deck2.addAll(war2);
                        war1.clear();
                        war2.clear(); 
                    }
        if(deck2.size() == 0){  
                        deck1.addAll(war1); 
                        deck1.addAll(war2);
                        war1.clear();
                        war2.clear(); 
                    }  
        if(deck1.size() != 0&&deck2.size() != 0){
            war1.add(deck1.pop()); 
            war2.add(deck2.pop());         
            System.out.println("Player1 enter any key to show your card");
            int add1=input.nextInt();
                        
            System.out.println("Player2 enter any key to show your card");
            int add2=input.nextInt();
            System.out.println("For player1, Card for WAR BATTLE is " + war1.get((war1.size())-1).toString());
            System.out.println("For player2, Card for WAR BATTLE is " + war2.get((war2.size())-1).toString());
            if(war1.get(war1.size()-1).getCard() > war2.get(war1.size()-1).getCard()){
               deck1.addAll(war1); 
               deck1.addAll(war2);
               System.out.println("Player 1 wins the war round");
               score[0]++;
               System.out.println("The score of Player 1 is "+score[0]);
               System.out.println("The score of Player 2 is "+score[1]);
           }

           else if(war1.get(war1.size()-1).getCard() < war2.get(war1.size()-1).getCard()){
               deck2.addAll(war1); 
               deck2.addAll(war2);
               
               
               System.out.println("Player 2 wins the war round");
               score[1]++;
               System.out.println("The score of Player 1 is "+score[0]);
               System.out.println("The score of Player 2 is "+score[1]);
           }else{
               //invoke himself method

               warAgainResult(deck1, deck2,war1, war2,score);
           }                    
                }
                
    }
    
}
