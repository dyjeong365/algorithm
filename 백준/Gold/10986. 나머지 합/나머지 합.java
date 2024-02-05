import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());
        long[] sequenceA = new long[N + 1];
        long[] remainder = new long[M];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i < N + 1; i++) {
            /*
            (S[j] - S[i]) % M = 0
            S[j] % M - S[i] % M = 0
            S[j] % M = S[i] % M
             */
            sequenceA[i]
                    = (sequenceA[i - 1] + Integer.parseInt(st.nextToken())) % M;
            remainder[(int) sequenceA[i]]++;
        }

        long count = remainder[0];

        for (int i = 0; i < M; i++) {
            // 나머지가 같은 2개를 뽑는 경우
            count += (remainder[i] * (remainder[i] - 1)) / 2;
        }

        System.out.print(count);
    }
}
