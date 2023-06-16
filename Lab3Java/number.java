import java.util.Random;
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        int randomNumber = GenerateRandomNumber();
        PlayGame(randomNumber);
    }

    private static int GenerateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10000);
    }

    private static void PlayGame(int randomNumber) {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a random 4-digit number. Can you guess it within 14 attempts?");

        Scanner scanner = new Scanner(System.in);

        for (int guessCount = 1; guessCount <= 14; guessCount++) {
            System.out.print("Attempt #" + guessCount + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Your guess is SMALLER.");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is BIGGER.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + guessCount + " attempts.");
                return;
            }
        }

        System.out.println("Sorry, you didn't guess the number within 14 attempts.");
        System.out.println("The number was: " + randomNumber);
    }
}
