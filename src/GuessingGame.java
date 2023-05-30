import java.util.Scanner;

public class GuessingGame {

    // Declare variables
    int number = (int) (Math.random() * 100);
    Scanner scanner = new Scanner(System.in);

    // Constructor
    public GuessingGame() {
        // Get the user's guess
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        int guess = scanner.nextInt();

        // Check if the user's guess is correct
        while (guess != number) {

            if (guess > number) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            }

            // Get the user's next guess
            guess = scanner.nextInt();
        }

        // The user has guessed the number correctly
        System.out.println("Congratulations! You guessed the number correctly.");
    }

    public static void main(String[] args) {
        // Create a GuessingGame object
        GuessingGame guessingGame = new GuessingGame();
    }
}