/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.StringTokenizer;

/**
 *
 * @author seanz
 */
public class CardsCompare {
    public static boolean cardCompare1bigger2( String deck1,String deck2){
        StringTokenizer card1=new StringTokenizer(deck1,":");
        StringTokenizer card2=new StringTokenizer(deck2,":");
        card1.nextToken();
        card2.nextToken();
        String playerCardStr1=card1.nextToken();
        String playerCardStr2=card2.nextToken();
        int rank1;
        int rank2;
        if(playerCardStr1.equalsIgnoreCase("ACE")){
            rank1=14;
        }else if(playerCardStr1.equalsIgnoreCase("King")){
            rank1=13;
        }else if(playerCardStr1.equalsIgnoreCase("Queen")){
            rank1=12;
        }else if(playerCardStr1.equalsIgnoreCase("Jack")){
            rank1=11;
        }else{
            rank1=Integer.parseInt(playerCardStr1);
        }
        
        if(playerCardStr2.equalsIgnoreCase("ACE")){
            rank2=14;
        }else if(playerCardStr2.equalsIgnoreCase("King")){
            rank2=13;
        }else if(playerCardStr2.equalsIgnoreCase("Queen")){
            rank2=12;
        }else if(playerCardStr2.equalsIgnoreCase("Jack")){
            rank2=11;
        }else{
            rank2=Integer.parseInt(playerCardStr2);
        }
        
        if(rank1 > rank2){
                return true;
        }else {
            return false;
        } 
    }

    public static boolean cardCompare1smaller2( String deck1,String deck2){
        StringTokenizer card1=new StringTokenizer(deck1,":");
        StringTokenizer card2=new StringTokenizer(deck2,":");
        card1.nextToken();
        card2.nextToken();
        String playerCardStr1=card1.nextToken();
        String playerCardStr2=card2.nextToken();
        int rank1;
        int rank2;
        if(playerCardStr1.equalsIgnoreCase("ACE")){
            rank1=14;
        }else if(playerCardStr1.equalsIgnoreCase("King")){
            rank1=13;
        }else if(playerCardStr1.equalsIgnoreCase("Queen")){
            rank1=12;
        }else if(playerCardStr1.equalsIgnoreCase("Jack")){
            rank1=11;
        }else{
            rank1=Integer.parseInt(playerCardStr1);
        }
        
        if(playerCardStr2.equalsIgnoreCase("ACE")){
            rank2=14;
        }else if(playerCardStr2.equalsIgnoreCase("King")){
            rank2=13;
        }else if(playerCardStr2.equalsIgnoreCase("Queen")){
            rank2=12;
        }else if(playerCardStr2.equalsIgnoreCase("Jack")){
            rank2=11;
        }else{
            rank2=Integer.parseInt(playerCardStr2);
        }
        
        if(rank1 < rank2){
                return true;
        }else {
            return false;
        } 
    }
    
    public static boolean cardCompareWar( String deck1,String deck2){
        StringTokenizer card1=new StringTokenizer(deck1,":");
        StringTokenizer card2=new StringTokenizer(deck2,":");
        card1.nextToken();
        card2.nextToken();
        String playerCardStr1=card1.nextToken();
        String playerCardStr2=card2.nextToken();
        int rank1;
        int rank2;
        if(playerCardStr1.equalsIgnoreCase("ACE")){
            rank1=14;
        }else if(playerCardStr1.equalsIgnoreCase("King")){
            rank1=13;
        }else if(playerCardStr1.equalsIgnoreCase("Queen")){
            rank1=12;
        }else if(playerCardStr1.equalsIgnoreCase("Jack")){
            rank1=11;
        }else{
            rank1=Integer.parseInt(playerCardStr1);
        }
        
        if(playerCardStr2.equalsIgnoreCase("ACE")){
            rank2=14;
        }else if(playerCardStr2.equalsIgnoreCase("King")){
            rank2=13;
        }else if(playerCardStr2.equalsIgnoreCase("Queen")){
            rank2=12;
        }else if(playerCardStr2.equalsIgnoreCase("Jack")){
            rank2=11;
        }else{
            rank2=Integer.parseInt(playerCardStr2);
        }
        
        if(rank1 == rank2){
                return true;
        }else {
            return false;
        } 
    }
    
}
