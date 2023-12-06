import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> time = new PriorityQueue<>();
        int minValueOfSum = 0;
        int result = 0;

        for (int i = 0; i < N; i++) {
            time.offer(Integer.parseInt(st.nextToken()));
        }

        while (!time.isEmpty()) {
            result += time.poll();
            minValueOfSum += result;
        }

        System.out.print(minValueOfSum);
    }
}
