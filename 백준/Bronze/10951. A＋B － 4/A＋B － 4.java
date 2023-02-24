import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                int A = scanner.nextInt();
                int B = scanner.nextInt();
                System.out.println(A + B);
            }
        } catch (NoSuchElementException e) {
        }
        ;
    }
}