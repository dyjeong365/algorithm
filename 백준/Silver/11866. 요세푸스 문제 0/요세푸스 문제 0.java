import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("<");
        Queue<Integer> queue = new LinkedList<>();
        String[] input = br.readLine().split(" ");

        final int N = Integer.parseInt(input[0]);
        final int K = Integer.parseInt(input[1]);

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            int indexOfK = (K - 1) % queue.size();

            for (int i = 0; i < indexOfK; i++) {
                queue.offer(queue.poll());
            }

            sb.append(queue.poll())
                    .append(", ");
        }

        sb.append(queue.poll())
                .append(">");
        
        System.out.println(sb);
    }
}
