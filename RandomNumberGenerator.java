import java.util.Random;
import java.util.Scanner;

class RandomNumberGenerator {
    public static void main(String[] args) {

        // Generating Random Number
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        // Game Rule
        System.out.println("--------Game Rule------");
        System.out.println("1. You have only 10 attempts to complete this game.");
        System.out.println("2. If you guess the right number in between 1 to 10 attempts then you won.");
        System.out.println("3. Finally we announce that in how many attempts you complete this game.");
        System.out.println("4. We give hint in each step which helps you to complete the game as in less attempts.");
        System.out.println("--------Let's Start the Game---------------");
        System.out.println();

        int guess;
        int attempt = 10; // Total attempts
        int count = 1; // Count the number of attempts

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Guess the number: ");
            guess = sc.nextInt();

            if (randomNumber == guess) {
                System.out.println("You Got the right number in " + count + " attempt.");
                System.out.println("Thank you user");
                System.out.println();
            } else if (randomNumber < guess) {
                count++;
                attempt--;
                System.out.println("Enter the small number.");
                System.out.println();
            } else if (randomNumber > guess) {
                count++;
                attempt--;
                System.out.println("Enter the big number.");
                System.out.println();
            }

            if (attempt == 0) {
                System.out.println("All Attempts end");
                System.out.println("Thank you user");
            }
        } while (randomNumber != guess && attempt != 0);
    }
}
