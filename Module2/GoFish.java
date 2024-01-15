import java.util.Scanner;
import java.util.Set;

public class GoFish {
    public static final int HAND_SIZE = 5;

    public static void main(String[] args) {
        // Initialize Deck
        Deck deck = Deck.createStandardDeck();
        deck.shuffle();

        // Initialize first player
        Player playerOne = new Player();
        for (int i = 0; i < HAND_SIZE; i++) {
            playerOne.addToHand(deck.draw());
        }

        // Initialize second player
        Player playerTwo = new Player(deck, HAND_SIZE);

        Scanner scanner = new Scanner(System.in);

        // Play the game
        Player player = playerOne;
        Player opponent = playerTwo;
        while (deck.getSize() > 0) {
            // Display the player's hand
            if (player == playerOne) {
                System.out.println("--Player One Hand--");
            } else {
                System.out.println("--Player Two Hand--");
            }
            player.printHand();
            System.out.println("--End of Hand--");

            // Perform the player's Turn
            System.out.print("Ask for rank: ");
            int rank = Integer.parseInt(scanner.nextLine().strip());
            if (player.askForRank(opponent, rank)) {
                System.out.println("Opponent had card(s)!");
            } else {
                System.out.println("Go fish!");
                player.addToHand(deck.draw());
            }

            // Check for four-of-a-kinds
            int newFourOfAKinds = player.removeFourOfAKinds();
            if (newFourOfAKinds > 0) {
                System.out.println(newFourOfAKinds + " four-of-a-kind(s)!");
                player.setScore(player.getScore() + newFourOfAKinds);
            }

            // Swap the player and opponent
            Player temp = player;
            player = opponent;
            opponent = temp;
        }

        // Display the winner
        if (playerOne.getScore() > playerTwo.getScore()) {
            System.out.println("Player one wins!");
        } else if (playerOne.getScore() == playerTwo.getScore()) {
            System.out.println("Tie!");
        } else {
            System.out.println("Player two wins!");
        }
    }
}
