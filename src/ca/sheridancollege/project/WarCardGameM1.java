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
import java.util.Scanner;

/**
 *
 * @author seanz
 */
public class WarCardGameM1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] score={0,0};
        //card generator
        CarGenerator one=new CarGenerator();
        LinkedList<Card> deck1 = one.getDeck1();
        LinkedList<Card> deck2 = one.getDeck2();
        CarGenerator.cardGeneratorMethod();
        //compare and war
        
        while(true){

            //use interaction
            System.out.println("Player1 enter 1 to start and show your card, enter 0 to quit the game");
            int add1=input.nextInt();
                        
            System.out.println("Player2 enter 1 to start and show your card, enter 0 to quit the game");
            int add2=input.nextInt();
            if (add1==1&&add2==1){
             CardCompare1.cardCompare(deck1, deck2, score);
            }else if(add1==0||add2==0){
                System.out.println("The score of Player 1 is "+score[0]);
                System.out.println("The score of Player 2 is "+score[1]);
                if(score[0]>score[1]){
                    System.out.println("Player 1 wins the game");
                }else if (score[1]>score[0]){
                    System.out.println("Player 2 wins the game");
                }else{System.out.println("Draw");}

                System.out.println("Goodbye, see you next time.");
                break;
            }
            //end of interaction
//            System.out.println("Player 1 plays card number is " + deck1.size());
//            System.out.println("Player 2 plays card number is " + deck2.size());
            if(deck1.size() == 0 ){
                System.out.println("game over\nPlayer 2 wins the game");
                score[1]=score[1]+50;
                System.out.println("The score of Player 1 is "+score[0]);
                System.out.println("The score of Player 2 is "+score[1]);
                
                break;
            }
            else if(deck2.size() == 0){
                System.out.println("game over\nPlayer 1 wins the game");
                score[0]=score[0]+50;
                System.out.println("The score of Player 1 is "+score[0]);
                System.out.println("The score of Player 2 is "+score[1]);
                break;
            }
        }

    }   
}
