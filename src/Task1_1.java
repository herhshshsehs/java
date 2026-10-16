import java.util.Scanner;
public class Task1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int CORRECT_PIN = 1234;
        final int MAX_ATTEMPTS = 3;

        int attemptsLeft = MAX_ATTEMPTS;
        boolean granted = false;

        while (attemptsLeft > 0) {
            System.out.print("Enter PIN: ");
            int pin = scanner.nextInt();

            if (pin == CORRECT_PIN) {
                granted = true;
                break;
            }

            attemptsLeft--;
            System.out.println("Incorrect PIN. Attempts left: " + attemptsLeft);
        }

        if (granted) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Card blocked.");
        }

        scanner.close();
    }
}