import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i >= 2) System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}