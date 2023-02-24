import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; ; i++) {
            int A = scanner.nextInt();
            if (A == 0) break;
            int B = scanner.nextInt();
            System.out.println(A + B);
        }

    }
}