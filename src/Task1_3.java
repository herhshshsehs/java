import java.util.Scanner;
public class Task1_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int COUNT = 10;

        int positive = 0;
        int negative = 0;
        int zeros = 0;
        int even = 0;
        int odd = 0;

        for (int i = 1; i <= COUNT; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();

            // sign
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zeros++;
            }

            // parity (zero counts as even)
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println();
        System.out.println("===== STATISTICS =====");
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zeros);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        scanner.close();
    }
}