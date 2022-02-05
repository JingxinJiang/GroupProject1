/**
 * SYST 17796 Project Base code.
 * Author Name: Jingxin Jiang
 * Student Number:  991657051
 * Date:2022.01.30
 */
package ca.sheridancollege.project;

import java.util.Scanner;
import ca.sheridancollege.project.content.Player;
import java.util.ArrayList;
public class GameStartCode {
    public static void main(String[] args){
        System.out.println("Welcome war Game");
        //user name input
        Scanner input= new Scanner(System.in);
//        System.out.println("Player 1: enter your name");
//        String user1= input.nextLine();
//        System.out.println("Player 2: enter your name");
//        String user2= input.nextLine();
////        System.out.println("Player1 name:"+user1);
////        System.out.println("Player2 name:"+user2);
//        //user name call
//        Player playerGroup1=new Player(user1,user2);        
//        System.out.println("Player1 name:"+playerGroup1.getUser1());
//        System.out.println("Player2 name:"+playerGroup1.getUser2());

       // card
        int[] player1HoldCard = new int[26];
        int[] player2HoldCard = new int[26];
        int[] totalCards=new int[52];
        int sumNum=0;
        int sumNum1=0;
        int cardValue1=0;
        int cardValue2=0;
        //Dealer
        
                 //send cards
        for(int i=0;i<=25;i++){
            //System.out.println("card "+i+"initial:"+player1HoldCard[i]);
            //player1
            do{sumNum=0;
                 cardValue1 = 1+ (int)Math.floor(Math.random()*13);
                //System.out.println("cardValue "+cardValue1);
                

                //check num is illegale
                
                for(int j=0;j<=51;j++){
                 if (cardValue1 == totalCards[j]) {
                     sumNum++;
                     if(sumNum>=4) {
                        cardValue1=0;
                         break;}
                 }
                 }
                
            }while(cardValue1==0);
            //System.out.println("card "+i+":"+player1HoldCard[i]);
            if(cardValue1!=0){
                     player1HoldCard[i]=cardValue1;
                      totalCards[i]=cardValue1;}
                      
            
            //player2
            do{ sumNum1=0;
                 cardValue2 = 1+ (int)Math.floor(Math.random()*13);
                //System.out.println("cardValue "+cardValue1);
                
                
                //check num is illegale
                
                for(int j=0;j<=51;j++){
                 if (cardValue2 == totalCards[j]) {
                     sumNum1++;
                     if(sumNum1>=4) {
                        cardValue2=0;
                         break;}
                 }
                 }
                
            }while(cardValue2==0);
            //System.out.println("card "+i+":"+player1HoldCard[i]);
            if(cardValue2!=0){
                     player2HoldCard[i]=cardValue2;
                      totalCards[i+26]=cardValue2;}
                      
            
            System.out.printf("Player1 card %d: %d",i,player1HoldCard[i]);
            System.out.println("");
            System.out.printf("Player2 card %d: %d",i,player2HoldCard[i]);
            System.out.println("");
            
        }
        //
        
        
        
        final int SIZE=7;
       /* //test equal
        player1HoldCard[0]=12;
        player2HoldCard[0]=2;
        player1HoldCard[1]=3;
        player2HoldCard[1]=3;
        player1HoldCard[2]=3;
        player2HoldCard[2]=10;
        player1HoldCard[3]=7;
        player2HoldCard[3]=13;
        player1HoldCard[4]=4;
        player2HoldCard[4]=4; 
        player1HoldCard[5]=3;
        player2HoldCard[5]=13; 
        player1HoldCard[6]=13;
        player2HoldCard[6]=11; */
        
        //playGame
        ArrayList<Integer> player1winCard= new ArrayList<>();
        ArrayList<Integer> player2winCard= new ArrayList<>();
        ArrayList<Integer> player1EqualCard= new ArrayList<>();
        ArrayList<Integer> player2EqualCard= new ArrayList<>();
        boolean condition=false;
        
       // while(player1winCard.size()!=52&&player2winCard.size()!=52)
            
        int i=0;    
        while(i<SIZE){
            //player open their card
                condition=false;
                System.out.println("Player1 enter 1 show you card");
                int open1=input.nextInt();

                if(open1==1){
                System.out.println("Player1's card is "+player1HoldCard[i]);}            
                System.out.println("Player2 enter 1 show you card");            
                int open2=input.nextInt();
                if(open2==1){
                System.out.println("Player2's card is "+player2HoldCard[i]);}
                
                //compare card
                if(player1HoldCard[i]>player2HoldCard[i]){
                    player1winCard.add(player1HoldCard[i]);
                    player1winCard.add(player2HoldCard[i]);
                    i=i+1;
                    //System.out.println("Player1 wins cards: " + player1winCard);
                    //System.out.println("Player2 wins cards: " + player2winCard);
                }
                else if(player1HoldCard[i]<player2HoldCard[i]){
                    player2winCard.add(player1HoldCard[i]);
                    player2winCard.add(player2HoldCard[i]);
                    i=i+1;
                    //System.out.println("Player1 wins cards: " + player1winCard);
                    //System.out.println("Player2 wins cards: " + player2winCard);
                }
                else{
                    //war add one card and open a new card
                    
                    do{ 
                       
                       player1EqualCard.add(player1HoldCard[i]);                       
                       player2EqualCard.add(player2HoldCard[i]);                       
                       
                        condition=false;  
                       //add card 
                        System.out.println("Player1 enter 1 to add one card");
                        int add1=input.nextInt();
                        if (add1==1&&(i+1)<SIZE){
                        System.out.println("Player1 add one card");
                        player1EqualCard.add(player1HoldCard[i+1]);                    
                        }else{
                            //if one have card, the other no card then, have card win
                        System.out.println("out");
                        for(int k=0;k<player1EqualCard.size();k++){
                              player1winCard.add(player1EqualCard.get(k));
                              player2winCard.add(player2EqualCard.get(k));                               
                            }
                        player1EqualCard.removeAll(player1EqualCard);
                        player2EqualCard.removeAll(player2EqualCard);
                        
                        i=i+1;
                        break;
                        }

                        System.out.println("Player2 enter 1 to add one card");               
                        int add2=input.nextInt();
                        if (add2==1&&(i+1)<SIZE){
                        System.out.println("Player2 add one card");
                        player2EqualCard.add(player2HoldCard[i+1]);
                        //System.out.println("player2EqualCard "+player2EqualCard);
                        }else{
                            System.out.println("out");
                            for(int k=0;k<player1EqualCard.size();k++){
                              player1winCard.add(player1EqualCard.get(k));
                              player2winCard.add(player2EqualCard.get(k));                          
                            }
                            player1EqualCard.removeAll(player1EqualCard);
                        player2EqualCard.removeAll(player2EqualCard);
                            i=i+1;
                            break;}

                        //show card
                        System.out.println("Player1 enter 1 show you card"); 
                        int open3=input.nextInt();
                        if (open3==1&&(i+2)<SIZE){
                        System.out.println("Player1's card is "+player1HoldCard[i+2]);

                        }else{
                            System.out.println("out");
                            for(int k=0;k<player1EqualCard.size();k++){
                              player1winCard.add(player1EqualCard.get(k));
                              player2winCard.add(player2EqualCard.get(k));                      
                            }
                            player1EqualCard.removeAll(player1EqualCard);
                        player2EqualCard.removeAll(player2EqualCard);
                            
                            i=i+2;
                            break;}

                        System.out.println("Player2 enter 1 show you card");            
                        int open4=input.nextInt();
                        if(open4==1&&(i+2)<SIZE){
                        System.out.println("Player2's card is "+player2HoldCard[i+2]);}
                        else{
                            System.out.println("out");
                            for(int k=0;k<player1EqualCard.size();k++){
                              player1winCard.add(player1EqualCard.get(k));
                              player2winCard.add(player2EqualCard.get(k));                          
                            }
                            player1EqualCard.removeAll(player1EqualCard);
                        player2EqualCard.removeAll(player2EqualCard);
                            i=i+2;
                            break;}
                        //compare new card
                        if(player1HoldCard[i+2]>player2HoldCard[i+2]){
                            for(int k=0;k<player1EqualCard.size();k++){
                              player1winCard.add(player1EqualCard.get(k));
                              player1winCard.add(player2EqualCard.get(k));                          
                            }
                            
                            System.out.println("Player1 equal cards: " + player1EqualCard);
                            System.out.println("Player2 equal cards: " + player2EqualCard);
                            System.out.println("Player2 equal cards: " + player1EqualCard.size());
                            
                            player1EqualCard.removeAll(player1EqualCard);
                        player2EqualCard.removeAll(player2EqualCard);
                             System.out.println("Player1 equal cards after remove: " + player1EqualCard);
                            System.out.println("Player2 equal cards after remove: " + player2EqualCard);
                            
                            player1winCard.add(player1HoldCard[i+2]);
                            player1winCard.add(player2HoldCard[i+2]);
                            i=i+3;
                        }else if(player1HoldCard[i+2]<player2HoldCard[i+2]){
                            for(int k=0;k<player1EqualCard.size();k++){
                              player2winCard.add(player1EqualCard.get(k));
                              player2winCard.add(player2EqualCard.get(k));                          
                            }
                            
                            System.out.println("Player1 equal cards: " + player1EqualCard);
                            System.out.println("Player2 equal cards: " + player2EqualCard);
                            
                            
                            player1EqualCard.removeAll(player1EqualCard);
                        player2EqualCard.removeAll(player2EqualCard);
                             System.out.println("Player1 equal cards after remove: " + player1EqualCard);
                            System.out.println("Player2 equal cards after remove: " + player2EqualCard);
                            player2winCard.add(player1HoldCard[i+2]);
                            player2winCard.add(player2HoldCard[i+2]);
                            i=i+3;
                        }else{
                           condition=true; 
                           //player1EqualCard.add(player1HoldCard[i+2]);
                           //player2EqualCard.add(player2HoldCard[i+2]);
                           i=i+2;
                        }
                        
                 }while(condition&&i<SIZE);
                    
                if(condition){
                for(int k=0;k<player1EqualCard.size();k++){
                          player1winCard.add(player1EqualCard.get(k));
                          player2winCard.add(player2EqualCard.get(k));                            
                        }  
                
                
                System.out.println("Player1 equal cards: " + player1EqualCard);
                System.out.println("Player2 equal cards: " + player2EqualCard);
                
                
                player1EqualCard.removeAll(player1EqualCard);
                        player2EqualCard.removeAll(player2EqualCard);
            } 
            }
            
            
                
        }
        System.out.println("Player1 wins cards: " + player1winCard);
        System.out.println("Player2 wins cards: " + player2winCard);
        System.out.println("Player1 wins cards: " + player1winCard.size());
        System.out.println("Player2 wins cards: " + player2winCard.size());
    }
    
    
}
