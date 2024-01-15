import java.util.*;

public class Player {
    /** Current cards held by the player. */
    private Set<Card> hand;
    private int score;

    /** Constructs a player with an empty hand. */
    public Player() {
        hand = new HashSet<>();
    }

    /** Constructs a player with an initial hand drawn from a deck. */
    public Player(Deck deck, int handSize) {
        hand = new HashSet<>();
        hand.addAll(deck.draw(handSize));
    }

    /** Takes cards from the opponent and returns true if able. Returns false otherwise. */
    public boolean askForRank(Player opponent, int rank) {
        Set<Card> cardsOfRank = opponent.getCardsByRank(rank);

        if (!cardsOfRank.isEmpty()) {
            opponent.hand.removeAll(cardsOfRank);
            hand.addAll(cardsOfRank);
            return true;
        }

        return false;
    }

    /** Returns all cards in the player's hand with the given rank. */
    public Set<Card> getCardsByRank(int rank) {
        HashSet<Card> cardsOfRank = new HashSet<>();
        for (Card card : hand) {
            if (card.getRank() == rank) {
                cardsOfRank.add(card);
            }
        }
        return cardsOfRank;
    }

    /** Finds and removes pairs from the player's hand. */
    public int removeFourOfAKinds() {
        // Group cards by rank
        HashMap<Integer, Set<Card>> cardsByRank = new HashMap<>();
        for (Card card : hand) {
            int rank = card.getRank();

            if (!cardsByRank.containsKey(rank)) {
                cardsByRank.put(rank, new HashSet<>());
            }

            cardsByRank.get(rank).add(card);
        }

        // Remove and count four-of-a-kinds
        int fourOfAKinds = 0;
        for (Set<Card> cardsOfRank : cardsByRank.values()) {
            if (cardsOfRank.size() >= 4) {
                hand.removeAll(cardsOfRank);
                fourOfAKinds += 1;
            }
        }

        return fourOfAKinds;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int getHandSize() {
        return hand.size();
    }
    public void addToHand(Set<Card> cards) {
        hand.addAll(cards);
    }

    /** Displays all cards in the hand. */
    public void printHand() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }
}
