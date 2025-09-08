import java.util.Scanner;
import java.util.Random;

public class NUMBER_GAME {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int score = 0;

        while (true) {
            int n = r.nextInt(100) + 1;
            int tries = 0;

            System.out.println("Guess number between 1 and 100:");

            while (tries < 10) {
                int g = s.nextInt();
                tries++;
                if (g == n) {
                    System.out.println("Correct in " + tries + " tries.");
                    score++;
                    break;
                } else if (g < n) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }
                int remaining = 10 - tries;
                System.out.println("You have " + remaining + " tries remaining");
            }

            if (tries == 10) {
                System.out.println("Out of tries. It was: " + n);
            }

            System.out.println("Play again? yes/no");
            String again = s.next();
            if (!again.equalsIgnoreCase("yes")) break;
        }

        System.out.println("Final score: " + score);
        s.close();
    }
}
