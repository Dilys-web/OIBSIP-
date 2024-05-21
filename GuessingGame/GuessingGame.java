package GuessingGame;

import java.util.*;

public class GuessingGame {

    private int maxAttempts;
    private final int totalRounds;
    private final Scanner scanner;
    private final Random random;

    public GuessingGame(int maxAttempts, int totalRounds) {
        this.maxAttempts = maxAttempts;
        this.totalRounds = totalRounds;
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void play() {
        for (int currentRound = 1; currentRound <= totalRounds; currentRound++) {
            int randomNumber = random.nextInt(100) + 1; // Range 1 to 100

            int attempts = 0;
            boolean guessed = false;

            System.out.println("Round " + currentRound + ": Guess the number between 1 and 100!");

            while (attempts < maxAttempts && !guessed) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();

                attempts++;

                if (guess == randomNumber) {
                    guessed = true;
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");

                    int points = calculatePoints(attempts);
                    System.out.println("You earned " + points + " points this round!");
                } else if (guess < randomNumber) {
                    System.out.println("Your guess is too low. Try again!");
                } else {
                    System.out.println("Your guess is too high. Try again!");
                }
            }

            if (!guessed) {
                System.out.println("You ran out of attempts. The number was " + randomNumber);
            }
        }

        System.out.println("Game Over! Your final score is: " + calculateTotalScore());
        scanner.close();
    }

    private int calculatePoints(int attempts) {
        return maxAttempts - attempts + 1;
    }

    private int calculateTotalScore() {
        // Logic to calculate score across all rounds (modify based on your needs)
        // This example simply sums points from each round
        int totalScore = 0;
        // ... (loop through rounds and add points)
        return totalScore;
    }
}
