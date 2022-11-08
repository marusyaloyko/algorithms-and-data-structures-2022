package Poker;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.deckCreate();
        deck.shuffle();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 8){
            deck.give(n);
        }
    }
}
