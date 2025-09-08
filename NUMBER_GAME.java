import java.util.Scanner;
import java.util.Random;

public class NUMBER_GAME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 7;
        int min = 1, max = 100;
        int score = 0;

        boolean playAgain = true;
        while (playAgain) {
            int numberToGuess = random.nextInt(max - min + 1) + min;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("Guess a number between " + min + " and " + max + ":");

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + ": ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                    score++;
                    guessedCorrectly = true;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("You've used all attempts. The number was " + numberToGuess + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Game over. Your score: " + score);
        scanner.close();
    }
}
