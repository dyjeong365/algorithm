import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;

        for (int i = 0; i < 3; i++) {
            String input = br.readLine();

            if (Character.isDigit(input.charAt(0))) {
                ans += (Integer.parseInt(input) + (3 - i));
                break;
            }
        }

        if (ans % 3 == 0) {
            if (ans % 5 == 0) {
                System.out.print("FizzBuzz");
            } else {
                System.out.println("Fizz");
            }
        } else {
            if (ans % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(ans);
            }
        }
    }
}
