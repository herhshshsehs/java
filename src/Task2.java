public class Task2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; ) {
            System.out.print("before: " + i);
            i *= 10;
            System.out.println("  after: " + i);
        }
    }
}