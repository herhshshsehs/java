import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("while:");
        int i = 1;
        while (i <= n) { if (i % 2 != 0) System.out.print(i + " "); i++; }
        System.out.println();

        System.out.println("do-while:");
        i = 1;
        if (n >= 1) {
            do { if (i % 2 != 0) System.out.print(i + " "); i++; } while (i <= n);
        }
        System.out.println();

        System.out.println("for:");
        for (i = 1; i <= n; i += 2) System.out.print(i + " ");
        System.out.println();
    }
}