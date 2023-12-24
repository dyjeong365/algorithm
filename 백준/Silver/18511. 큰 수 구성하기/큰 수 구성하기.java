import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int K;
    static int[] elOfK;
    static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        elOfK = new int[K];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < K; i++) {
            elOfK[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(elOfK);
        findBigNotMoreThanN(0);
        System.out.println(ans);
    }

    private static void findBigNotMoreThanN(int cur) {
        if (cur > N) {
            return;
        }

        if (ans < cur) {
            ans = cur;
        }

        for (int i = K - 1; i >= 0; i--) {
            findBigNotMoreThanN(10 * cur + elOfK[i]);
        }
    }
}
