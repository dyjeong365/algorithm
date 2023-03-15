import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < ALPHABET.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (ALPHABET.charAt(i) == S.charAt(j)) { // a == b
                    sb.append(j + " ");
                    break;
                } else {
                    if (j == S.length() - 1) sb.append(-1 + " ");
                }
            }
        }
        System.out.println(sb);
    }
}