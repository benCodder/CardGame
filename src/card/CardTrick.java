/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Basil
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random r = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(r.nextInt(13)+1);
            c.setSuit(Card.SUITS[r.nextInt(4)]);
            
            magicHand[i]=c;
        }
        
        for(Card card: magicHand)
        {
            System.out.println(card.getSuit() + " " + card.getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        /*Scanner key = new Scanner(System.in);
        
        System.out.println("Enter a card value(1-13): ");
        int userValue=key.nextInt();
        
        System.out.println("Enter a suit(0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs): ");
        int userSuit=key.nextInt();/*
        
        /*Card userCard= new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);
        */

        // add one luckcard hard code 2,clubs
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit(Card.SUITS[3]);
        
        
        // and search magicHand here
        boolean found = false;
        for(Card card: magicHand)
        {
            if(card.getValue()==luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())){
               found=true;
               break;
            }
            
        }
        //Then report the result here
        
        if(found)
        {
            System.out.println("Congratulations!! The lucky card is in the magic hand!");
        }
        else
        {
            System.out.println("Sorry, the lucky card is not in the magic hand.");
        }
        
    
    
}
}
