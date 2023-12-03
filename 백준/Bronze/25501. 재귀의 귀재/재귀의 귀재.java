import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            sb.append(isPalindrome(br.readLine())).append("\n");
        }

        System.out.print(sb);
    }

    private static String isPalindrome(String s) {
        int count = 0;

        return recursion(s, 0, s.length() - 1, count);
    }

    private static String recursion(String s, int l, int r, int count) {
        count++;

        if (l >= r) {
            return "1 " + count;
        } else if (s.charAt(l) != s.charAt(r)) {
            return "0 " + count;
        } else {
            return recursion(s, l + 1, r - 1, count);
        }
    }
}
