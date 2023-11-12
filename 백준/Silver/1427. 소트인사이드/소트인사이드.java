import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] input = br.readLine().split("");
        PriorityQueue<Integer> number = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < input.length; i++) {
            number.offer(Integer.parseInt(input[i]));
        }

        for (int i = 0; i < input.length; i++) {
            sb.append(number.poll());
        }

        System.out.print(sb);
    }
}
