import java.util.Scanner;
public class Task1_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int SECRET = 7;
        final int MAX_ATTEMPTS = 5;

        int attempts = 0;
        boolean guessed = false;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == SECRET) {
                guessed = true;
                break;
            } else if (guess < SECRET) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
            System.out.println();
        }

        if (guessed) {
            System.out.println("Correct!");
            System.out.println("You needed " + attempts + " attempts.");
        } else {
            System.out.println("Game over!");
            System.out.println("The secret number was " + SECRET + ".");
        }

        scanner.close();
    }
}