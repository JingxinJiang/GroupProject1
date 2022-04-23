/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.StringTokenizer;

/**
 *
 * @author seanz
 */
public class WarGameMethodForTest {
    //local Card class
    public static class Card {    
        private int rank; 
        private int suit; 

        public Card(int suit, int rank){
            this.rank = rank;
            this.suit = suit;
        }


        public int getCard(){
            return rank; 
        }


        public void setCard(int rank){
            this.rank = rank;
        }
        
        @Override
        public String toString(){   
            StringBuilder displayCard = new StringBuilder();
            switch(rank){

                case 11:
                    displayCard.append("Jack");
                    break;
                case 12:
                    displayCard.append("Queen");
                    break;
                case 13:
                    displayCard.append("King");
                    break;
                case 14:
                    displayCard.append("Ace");
                    break;    
                default:
                    displayCard.append(rank); 
                    break;
            }

            displayCard.append(" of "); 

            switch(suit){
                case 0:
                    displayCard.append("Spades");
                    break;
                case 1:
                    displayCard.append("Hearts");
                    break;
                case 2:
                    displayCard.append("Clubs");
                    break;
                case 3:
                    displayCard.append("Diamonds");
                    break;
                default: 
                    break;
            }      
            return displayCard.toString();
        }
    }
//Card generator Method    
    public static boolean cardGeneratorMethod(int a, int b){
        ArrayList<Card> cardDeck=new ArrayList<Card>();
        ArrayList<Card> deck1=new ArrayList<Card>();
        ArrayList<Card> deck2=new ArrayList<Card>();
        boolean flag=false;
        for(int x=0; x<a; x++){          
            for(int y=2; y<b; y++){ 
                Card one=new Card(x,y);
                cardDeck.add(one); 
            } 
        }
        
        Collections.shuffle(cardDeck, new Random());   
        
        deck1.addAll(cardDeck.subList(0, 26));                  
        deck2.addAll(cardDeck.subList(26, cardDeck.size()));
        if(deck1.size()==26&&deck2.size()==26){
            for(int i=0;i<26;i++){
                for (int j=0;j<26;j++){
                    if (deck1.get(i).toString().equalsIgnoreCase(deck2.get(j).toString())){
                        flag=false;
                        break;
                    }else{
                        flag=true;
                    }
                }
                
            }
        }else{flag=false;}
        return flag;        
    }
    //Card compare methods
    public static boolean cardCompare1bigger2( Card deck1,Card deck2){
        
        int rank1=deck1.getCard();
        int rank2=deck2.getCard();
                
        if(rank1 > rank2){
                return true;
        }else {
            return false;
        } 
    }
    
    public static boolean cardCompare1smaller2( Card deck1,Card deck2){
        
        int rank1=deck1.getCard();
        int rank2=deck2.getCard();
                
        if(rank1 < rank2){
                return true;
        }else {
            return false;
        } 
    }
    
    public static boolean cardCompareWar( Card deck1,Card deck2){
        
        int rank1=deck1.getCard();
        int rank2=deck2.getCard();
                
        if(rank1 == rank2){
                return true;
        }else {
            return false;
        } 
    }
    
}
