package edu.dmacc.codedsm.homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DeckOfCards {

    public static void main(String[] args) {
        HashMap<String, List> cardDeck = new HashMap<>();               //created hashmap called cardDeck with key of String and a value filled with an integer list
        ArrayList<Integer> cardValues = new ArrayList();                //created the array list called cardValues that goes in the value of the map
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};     //created a string array called suits
        for (String suit : suits) {                                     //for each suit in the suits array (similar to above; "for each Integer i")
            cardDeck.put(suit, cardValues);                             //add the cards to the carddeck; String is suit; List is cardValues
        }
        for (Integer i = 1; i < 14; i++) {
            cardValues.add(i);                                          //added values 1 - 13 to cardValues arraylist
        }
        for (Map.Entry<String, List> suit : cardDeck.entrySet()) {
            for (Object card : suit.getValue()) {                       //for each card in each suit of the deck
                System.out.println(suit.getKey() + " - " + card);       //print the suit and its value;
            }
        }
    }
}
