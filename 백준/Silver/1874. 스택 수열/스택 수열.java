import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> sequences = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            sequences.offer(Integer.parseInt(br.readLine()));
        }

        for (int i = 1; i <= n; i++) {
            stack.push(i);
            sb.append("+").append("\n");

            while (!stack.isEmpty() && !sequences.isEmpty() && stack.peek().equals(sequences.peek())) {
                stack.pop();
                sequences.poll();
                sb.append("-").append("\n");
            }
        }

        System.out.print(stack.isEmpty() && sequences.isEmpty() ? sb : "NO");
    }
}
