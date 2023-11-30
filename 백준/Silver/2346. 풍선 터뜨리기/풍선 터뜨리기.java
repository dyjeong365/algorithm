import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] move = new int[N];
        Deque<Integer> balloons = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            move[i] = Integer.parseInt(st.nextToken());
            balloons.offer(i + 1);
        }

        while (true) {
            int cur = balloons.pollFirst();
            sb.append(cur).append(" ");

            if (balloons.isEmpty()) {
                break;
            }

            int nextIdx = move[cur - 1];

            if (nextIdx > 0) {
                while (--nextIdx > 0) {
                    balloons.offerLast(balloons.pollFirst());
                }
            } else {
                while (nextIdx++ < 0) {
                    balloons.offerFirst(balloons.pollLast());
                }
            }
        }

        System.out.print(sb);
    }
}
