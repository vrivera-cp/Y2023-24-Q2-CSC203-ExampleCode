/**
 * Represents a playing card.
 *
 * @author Vanessa Rivera
 */
public class Card {
    // Constant values for face cards
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    /** The card's value. **/
    private final int rank; // Private: Only Card class access; Final: it can't be reassigned.

    /** The card's suit, 'Clubs', 'Spades', etc. **/
    public String suit; // Public: other classes can access it freely. Should be private and final.

    /** Constructs a Card object with the specified values. */
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /** Returns the card's rank. */
    public int getRank() {
        return rank;
    }

    /** Returns a string based on the given rank. **/
    public static String getRankString(int rank) {
        return switch (rank) {
            case ACE -> "Ace";
            case JACK -> "Jack";
            case QUEEN -> "Queen";
            case KING -> "King";
            default -> String.valueOf(rank);
        };
    }

    /** Returns a string representation of the object. */
    @Override
    public String toString() {
        return getRankString(rank) + " of " + suit;
    }

    /** Returns true of the other object is a card with the same rank and suit. */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card card)) return false; // Checks for null
        return rank == card.rank && (suit == null ? card.suit == null : suit.equals(card.suit));
        // or: return rank == card.rank && Objects.equals(suit, card.suit);
    }

    /** Returns a unique integer based on rank and suit. */
    @Override
    public int hashCode() {
        int hash = 1;
        hash = (hash * 31) + rank;
        hash = (hash * 31) + (suit == null ? 0 : suit.hashCode());
        return hash;
        // or: return Objects.hash(rank, suit);
    }
}