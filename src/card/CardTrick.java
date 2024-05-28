/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Richin Richin
 * @StudentNumber 991421509
 */
import java.util.Random;


public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i]=c;
        }
        // Hard-coded luckyCard
        Card luckyCard = new Card();
        luckyCard.setValue(6); 
        luckyCard.setSuit("Hearts");

        System.out.println("Lucky card is: " + luckyCard.getValue() + " of " + luckyCard.getSuit());
        
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Your lucky card is in the magic hand!");
        } else {
            System.out.println("Your lucky card is not in the magic hand.");
        }

   
    }
    
}
