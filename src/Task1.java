public class Task1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 1000) {
            System.out.print("before: " + i);
            i *= 10;
            System.out.println("  after: " + i);
        }
    }
}