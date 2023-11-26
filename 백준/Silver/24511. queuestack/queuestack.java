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

        final int N = Integer.parseInt(br.readLine());

        int[] sequenceA = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            sequenceA[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> deque = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int b = Integer.parseInt(st.nextToken());

            if (sequenceA[i] == 0) {
                deque.offer(b);
            }
        }

        final int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < M; i++) {
            int x = Integer.parseInt(st.nextToken());
            deque.addFirst(x);
            x = deque.pollLast();
            sb.append(x).append(" ");
        }

        System.out.print(sb);
    }
}
