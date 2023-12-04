import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int start = 1;

        while (n-- > 0) {
            int target = Integer.parseInt(br.readLine());

            if (start <= target) {
                for (int j = start; j <= target; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }

                start = ++target;
            } else if (stack.peek() != target) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");
        }

        System.out.print(sb);
    }
}
