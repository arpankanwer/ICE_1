/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * 
 * @author Birarpanjot Singh
 *         Student Id: 991664167
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Card luckyCard=new Card();
        luckyCard.setValue(3);
        luckyCard.setSuit("Diamond");
        Random random = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            int randomNumber = random.nextInt(13) + 1;
            int newRandomNumber = random.nextInt(3);
            Card c = new Card();
            // c.setValue(insert call to random number generator here)
            c.setValue(randomNumber);

            // c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[newRandomNumber]);

            magicHand[i] = c;

        }

        // insert code to ask the user for Card value and suit, create their card
        // Scanner input = new Scanner(System.in);
        // System.out.print("Please enter any Card Value(1 - 13): ");
        // int cardValue = input.nextInt();
        // System.out.print("Please enter any Suit: ");
        // String suitValue = input.next();

        // and search magicHand here
        for (Card cards : magicHand) {

            if (cards.getValue() == luckyCard.getValue() && cards.getSuit().equals(luckyCard.getSuit())) {

                // Then report the result here
                System.out.println("You Won!");
            }else{
                System.out.println("You Loss!");
            }
        }

    }

}
