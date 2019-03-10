package edu.dmacc.codedsm.homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DeckOfCards {

    public static void main(String[] args) {

        HashMap<String, List> cardDeck = new HashMap<>();
        ArrayList<Integer> cardValues = new ArrayList();
        cardValues.add(1);
        cardValues.add(2);
        cardValues.add(3);
        cardValues.add(4);
        cardValues.add(5);
        cardValues.add(6);
        cardValues.add(7);
        cardValues.add(8);
        cardValues.add(9);
        cardValues.add(10);
        cardValues.add(11);
        cardValues.add(12);
        cardValues.add(13);

        cardDeck.put("Hearts", cardValues);
        cardDeck.put("Diamonds", cardValues);
        cardDeck.put("Clubs", cardValues);
        cardDeck.put("Spades", cardValues);

        for (Map.Entry<String, List> entry : cardDeck.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

