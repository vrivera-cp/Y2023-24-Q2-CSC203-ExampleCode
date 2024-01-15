import java.util.*;

public class Deck {
    private List<Card> cards;

    /** Default constructor. */
    private Deck() {} // Private to force usage of factory method

    /** Creates a standard playing card deck. */
    public static Deck createStandardDeck() {
        Deck deck = new Deck();
        deck.cards = new ArrayList<>();

        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        for (String suit : suits) {
            for (int rank = 1; rank <= 13; rank++) { // Ace to King
                deck.cards.add(new Card(rank, suit));
            }
        }

        return deck;
    }

    /** Returns and removes the first card from the deck as a set. */
    public Set<Card> draw() {
        return Set.of(cards.remove(0));
    }

    /** Returns and removes some cards at the front of the deck as a set. */
    public Set<Card> draw(int number) {
        Set<Card> drawnCards = new HashSet<>();
        for (int i = 0; i < number; ++i) {
            drawnCards.add(cards.remove(0));
        }
        return drawnCards;
    }

    /** Randomizes the card order. */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /** Returns the remaining number of cards in the deck. */
    public int getSize() {
        return cards.size();
    }
}
