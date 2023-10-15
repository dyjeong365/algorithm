import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        final int N = Integer.parseInt(input[0]);
        final int K = Integer.parseInt(input[1]);
        int answer = 0;
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (count == K) break;

            if (N % i == 0) {
                answer = i;
                count++;
            }
        }

        if (count < K) answer = 0;

        System.out.println(answer);
    }
}
