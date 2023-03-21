import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            if (i > 0) sb.append("\n");
            st = new StringTokenizer(br.readLine());
            int multiply = Integer.parseInt(st.nextToken());
            String word = st.nextToken();
            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < multiply; k++) {
                    sb.append(word.charAt(j));
                }
            }
        }
        System.out.print(sb);
    }
}