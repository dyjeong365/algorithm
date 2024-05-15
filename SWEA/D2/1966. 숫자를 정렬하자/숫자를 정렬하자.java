import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        final int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            final int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                priorityQueue.offer(Integer.parseInt(st.nextToken()));
            }

            sb.append("#")
                    .append(i + 1)
                    .append(" ");

            while (!priorityQueue.isEmpty()) {
                sb.append(priorityQueue.poll())
                        .append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}


