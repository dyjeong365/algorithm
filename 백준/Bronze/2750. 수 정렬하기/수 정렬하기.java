import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        final int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            priorityQueue.offer(Integer.parseInt(br.readLine()));
        }

        while (!priorityQueue.isEmpty()) {
            sb.append(priorityQueue.poll() + "\n");
        }

        System.out.print(sb);
    }
}
