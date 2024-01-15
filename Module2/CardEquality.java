/**
 * Demonstrates the usage of an overridden 'equals' method.
 *
 * @author Vanessa Rivera
 */
public class CardEquality {
    public static void main(String[] args) {
        Card card1 = new Card(1, "Spades");
        Card card2 = new Card(1, "Spades");
        Card card3 = new Card(1, "Clubs");
        Card card4 = card1;

        // Question: What is the value of each expression?
        System.out.printf("card1 == card1: %s%n", card1 == card1);
        System.out.printf("card1 == card2: %s%n", card1 == card2);
        System.out.printf("card1 == card3: %s%n", card1 == card3);
        System.out.printf("card1 == card4: %s%n", card1 == card4);

        // Question: What is the value of each call?
        System.out.printf("card1.equals(card1): %s%n", card1.equals(card1));
        System.out.printf("card1.equals(card2): %s%n", card1.equals(card2));
        System.out.printf("card1.equals(card3): %s%n", card1.equals(card3));
        System.out.printf("card1.equals(card4): %s%n", card1.equals(card4));

        // Question: Will this error?
        System.out.printf("card1.equals(null): %s%n", card1.equals(null));

        // Question: What about null.equals(card1)?

        // Mutability
        card1.suit = "Clubs"; // Recall 'suit' is public, so we can change it outside the class!

        // Question: What is the value of each expression now?
        System.out.printf("card1.equals(card1): %s%n", card1.equals(card1));
        System.out.printf("card1.equals(card2): %s%n", card1.equals(card2));
        System.out.printf("card1.equals(card3): %s%n", card1.equals(card3));
        System.out.printf("card1.equals(card4): %s%n", card1.equals(card4));
    }
}
