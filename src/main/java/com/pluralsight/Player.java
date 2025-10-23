package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Player {

        private String name;
        private List<Card> hand;

        public Player() {
            this.name = name;
            hand = new ArrayList<>();
        }

        public void addCard(Card card) {
            hand.add(card);
        }

        public int getHandValues() {
            int total = 0;
            for (Card card : hand) {
                total += Integer.parseInt(card.getValue());
            }
            return total;
        }
        public void  showHand(){
            for (Card card : hand) {
                System.out.println( card);

            }
            System.out.println(getHandValues());
        }
        public String name (){
            return  name;
        }
    }




