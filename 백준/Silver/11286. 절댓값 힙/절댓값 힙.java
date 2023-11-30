import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) ->
                Math.abs(a) == Math.abs(b) ? a - b : Math.abs(a) - Math.abs(b));

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                sb.append(priorityQueue.isEmpty() ? 0 : priorityQueue.poll()).append("\n");
            } else {
                priorityQueue.offer(x);
            }
        }

        System.out.print(sb);
    }
}
