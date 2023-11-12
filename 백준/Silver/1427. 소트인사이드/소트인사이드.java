import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> number = new PriorityQueue<>((a, b) -> b - a);

        for (char el : br.readLine().toCharArray()) {
            number.offer(Character.getNumericValue(el));
        }

        final int NUMBER_OF_DIGITS = number.size();

        for (int i = 0; i < NUMBER_OF_DIGITS; i++) {
            sb.append(number.poll());
        }

        System.out.print(sb);
    }
}
