package com.pluralsight;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter Player name1 ");
        String PlayerName1 = scanner.nextLine();

        System.out.println( "Enter Player name2 ");
        String PlayerName2 = scanner.nextLine();

Deck deck =new Deck();
deck.shuffle();

Hand Player1Hand = new Hand();
Player1Hand.deal(deck.deal());
Player1Hand.deal(deck.deal());

        Hand Player2Hand = new Hand();
        Player2Hand.deal(deck.deal());
        Player2Hand.deal(deck.deal());

        System.out.println(PlayerName1);
        System.out.println(PlayerName2);

        int player1Score = Player1Hand.getValue();
        int player2Score = Player2Hand.getValue();






        }

    }

