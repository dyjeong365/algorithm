import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
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

            LinkedList<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                queue.offer(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            int count = 0;

            while (!queue.isEmpty()) {
                int[] front = queue.poll();

                if (isMax(front, queue)) {
                    count++;

                    if (front[0] == M) {
                        sb.append(count).append("\n");
                        break;
                    }
                } else {
                    queue.offer(front);
                }
            }
        }

        System.out.print(sb);
    }

    private static boolean isMax(int[] front, LinkedList<int[]> queue) {
        for (int i = 0; i < queue.size(); i++) {
            if (front[1] < queue.get(i)[1]) {
                return false;
            }
        }

        return true;
    }
}
