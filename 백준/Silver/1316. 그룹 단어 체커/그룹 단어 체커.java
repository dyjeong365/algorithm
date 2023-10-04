import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < N; i++) {
            answer += findGroupWords(br.readLine());
        }

        System.out.println(answer);
    }

    private static int findGroupWords(String word) {
        boolean[] flag = new boolean[26];
        int prev = 0;

        for (var el : word.toCharArray()) {

            if (!flag[el - 'a']) {
                flag[el - 'a'] = true;
            } else {
                if (prev != el) return 0;
            }

            prev = el;
        }

        return 1;
    }
}
