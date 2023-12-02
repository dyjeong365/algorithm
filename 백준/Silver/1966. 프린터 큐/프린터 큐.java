import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        final int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            final int N = Integer.parseInt(st.nextToken());
            final int M = Integer.parseInt(st.nextToken());

            Deque<Integer> priority = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                priority.offer(Integer.parseInt(st.nextToken()));
            }

            int idx = 0;
            int count = 0;
            int max = priority.stream().mapToInt(Integer::intValue).max().getAsInt();

            while (max != 0) {
                int value = priority.poll();

                if (value != max) {
                    priority.offer(value);
                } else {
                    count++;
                    value = 0;
                    priority.offer(value);

                    if (idx == M) {
                        sb.append(count).append("\n");
                        break;
                    } else {
                        if (!priority.isEmpty()) {
                            max = priority.stream().mapToInt(Integer::intValue).max().getAsInt();
                        }

                    }
                }

                idx = ++idx % N;
            }
        }

        System.out.print(sb);
    }
}
