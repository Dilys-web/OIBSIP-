package GuessingGame;

public class Main {
    public static void main(String[] args) {
        // Set difficulty (max attempts, total rounds)
        int maxAttempts = 5;
        int totalRounds = 3;

        GuessingGame game = new GuessingGame(maxAttempts, totalRounds);
        game.play();
    }
    
}
