import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < T; i++) {
            String input = br.readLine();

            for (int j = 0; j < input.length(); j++) {
                set.add(input.charAt(j));
            }

            sb.append("#")
                    .append(i + 1)
                    .append(" ")
                    .append(set.size())
                    .append("\n");

            set.clear();
        }

        System.out.print(sb);
    }
}

