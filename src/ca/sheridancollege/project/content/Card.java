/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project.content;

/**
 *
 * @author seanz
 */
public class Card {
     private String suit;// hearts, diamonds, spades and clubs
    private int value;//1-13
    
    /**
     * A constructor that creates a Card Object with a given
     * suit and a given value.
     * @param givenSuit
     * @param givenValue 
     */
    public Card(String givenSuit, int givenValue)
    {
        suit = givenSuit;
        value = givenValue;
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        if(suit.equals("Hearts") || suit.equals("Diamonds")|| suit.equals("Clubs")|| suit.equals("Spades"))
        {
            this.suit = suit;
        }
        else
        {
            System.out.println("The suit you have tried to assign is not valid");
            System.out.println("Please choose from: Hearts, Diamonds, Clubs, Spades");
        }
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) 
    {
        if((value<1)||(value>13))
        {
              System.out.println("The value of the card must be between 1-13");      
        }
        else
        {
            this.value = value;
        }
    }
    
}
