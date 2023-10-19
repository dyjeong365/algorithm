import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            char[] input = br.readLine().toCharArray();
            Stack<Character> stack = new Stack<>();

            for (var el : input) {
                if (stack.isEmpty() && el == ')') {
                    stack.push(el);
                    break;
                } else if (!stack.isEmpty() && stack.peek() == '(' && el == ')') {
                    stack.pop();
                } else stack.push(el);
            }

            if (stack.isEmpty()) sb.append("YES\n");
            else sb.append("NO\n");
        }

        System.out.print(sb);
    }
}
