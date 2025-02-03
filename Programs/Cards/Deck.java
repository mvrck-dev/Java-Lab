import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
    }

    public void createDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public void displayDeck() {
        System.out.println("_______________Deck_______________");
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    public void set2cards() {
        Random rand = new Random();
        int card1 = rand.nextInt(deck.size());
        int card2 = rand.nextInt(deck.size());
        System.out.println("Card 1: " + deck.get(card1));
        System.out.println("Card 2: " + deck.get(card2));

    }

    public void shuffleDeck() {
        System.out.println("Shuffling deck...");
        Collections.shuffle(deck);
    }

}
