import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();
        String third = br.readLine();
        int ans = 0;

        if (Character.isDigit(first.charAt(0))) {
            ans += Integer.parseInt(first) + 3;
        } else if (Character.isDigit(second.charAt(0))) {
            ans += Integer.parseInt(second) + 2;
        } else {
            ans += Integer.parseInt(third) + 1;
        }

        if (ans % 3 == 0 && ans % 5 == 0) {
            System.out.print("FizzBuzz");
        } else if (ans % 3 == 0 && ans % 5 != 0) {
            System.out.print("Fizz");
        } else if (ans % 3 != 0 && ans % 5 == 0) {
            System.out.print("Buzz");
        } else {
            System.out.println(ans);
        }
    }
}
