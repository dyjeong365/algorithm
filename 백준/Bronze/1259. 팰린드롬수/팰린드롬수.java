import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        while (true) {
            String input = br.readLine();
            if (input.equals("0")) break;

            StringBuilder reversed = new StringBuilder(input).reverse();
            answer.append(input.equals(reversed.toString()) ? "yes" : "no")
                    .append("\n");
        }

        System.out.println(answer);
    }
}
